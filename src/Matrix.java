
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

    public class Matrix {
        public Matrix() {
            rows = 1;
            colls = 1;
            nums = new Float[1][1];
            nums[0][0] = (float) 0.0;
            String MatrixDimensionsException;
        }

        public Matrix(int rows , int colls , ArrayList<Float> data)
                throws MatrixDimensionsException {
            if (rows * colls != data.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not enought data: ");
                sb.append(rows).append("x").append(colls).append(" != ").append(
                        data.size());
                throw new MatrixDimensionsException(sb.toString());
            }
            this.rows = rows;
            this.colls = colls;
            nums = new Float[rows][colls];
            int k = 0;
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < colls; ++j) {
                    nums[i][j] = data.get(k++);
                }
            }
        }

        public Matrix(String filePath) throws IOException,
                MatrixDimensionsException {
            BufferedReader in = new BufferedReader(new FileReader(
                    new File(filePath).getAbsoluteFile()));
            String line;
            int width = 0;
            LinkedList<String[]> sNums = new LinkedList<String[]>();
            try {
                while ((line = in.readLine()) != null) {
                    String[] row = line.split(",");
                    if (width != 0 && width != row.length)
                        throw new MatrixDimensionsException(
                                "Each of the matrix's rows has to have identical amount of elements");
                    width = row.length;
                    sNums.add(row);
                }
            } finally {
                in.close();
            }
            colls = sNums.size();
            rows = sNums.get(0).length;
            nums = new Float[colls][rows];
            for (int i = 0; i < colls; ++i) {
                for (int j = 0; j < rows; ++j) {
                    nums[i][j] = Float.valueOf(sNums.get(i)[j]);
                }
            }
        }

        public Boolean isEmpty() {
            return (rows == 0 || colls == 0);
        }

        public void print() {
            for (int i = 0; i < rows; ++i) {
                System.out.println();
                for (int j = 0; j < colls; ++j) {
                    System.out.print(nums[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        public Float data(int row , int coll) {
            return nums[row][coll];
        }

        public int rows() {
            return rows;
        }

        public int colls() {
            return colls;
        }

        public Matrix add(Matrix m) throws MatrixDimensionsException {
            if (rows != m.rows() || colls != m.colls()) {
                StringBuffer strbuff = new StringBuffer();
                strbuff.append("Matrixs dimensions must be identical: ");
                strbuff.append(rows).append("x").append(colls).append(" ").append(
                        m.rows).append("x").append(m.colls);
                throw new MatrixDimensionsException(strbuff.toString());
            }
            ArrayList<Float> dt = new ArrayList<Float>();
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < colls; ++j) {
                    dt.add(nums[i][j] + m.data(i , j));
                }
            }
            return new Matrix(rows , colls , dt);
        }

        public Matrix sub(Matrix m) throws MatrixDimensionsException {
            if (rows != m.rows() || colls != m.colls()) {
                StringBuffer strbuff = new StringBuffer();
                strbuff.append("Matrixs dimensions must be identical: ");
                strbuff.append(rows).append("x").append(colls).append(" ").append(
                        m.rows).append(m.colls);
                throw new MatrixDimensionsException(strbuff.toString());
            }
            ArrayList<Float> dt = new ArrayList<Float>();
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < colls; ++j) {
                    dt.add(nums[i][j] - m.data(i , j));
                }
            }
            return new Matrix(rows , colls , dt);
        }

        public Matrix mul(Matrix m) throws MatrixDimensionsException {
            if (colls != m.rows) {
                StringBuffer strbuff = new StringBuffer();
                strbuff
                        .append("First matrix'a colls must be identical with second matrix'a rows: ");
                strbuff.append(rows).append("x").append(colls).append(" ").append(
                        m.rows).append("x").append(m.colls);
                throw new MatrixDimensionsException(strbuff.toString());
            }
            ArrayList<Float> dt = new ArrayList<Float>();
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < colls; ++j) {
                    Float cur = (float) 0.0;
                    for (int k = 0; k < colls; ++k) {
                        cur += nums[i][k] * m.data(k , i);
                    }
                    dt.add(cur);
                }
            }
            return new Matrix(m.colls() , rows , dt);
        }

        Float[][] nums;
        int rows, colls;

    }