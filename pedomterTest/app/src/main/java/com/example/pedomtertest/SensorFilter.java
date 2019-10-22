package com.example.pedomtertest;

/**
 * The type Sensor filter.
 */
public class SensorFilter {

    private SensorFilter() {
    }

    /**
     * Sum float.
     *
     * @param array the array
     * @return the float
     */
    public static float sum(float[] array) {
        float retval = 0;
        for (int i = 0; i < array.length; i++) {
            retval += array[i];
        }
        return retval;
    }

    /**
     * Cross float [ ].
     *
     * @param arrayA the array a
     * @param arrayB the array b
     * @return the float [ ]
     */
    public static float[] cross(float[] arrayA, float[] arrayB) {
        float[] retArray = new float[3];
        retArray[0] = arrayA[1] * arrayB[2] - arrayA[2] * arrayB[1];
        retArray[1] = arrayA[2] * arrayB[0] - arrayA[0] * arrayB[2];
        retArray[2] = arrayA[0] * arrayB[1] - arrayA[1] * arrayB[0];
        return retArray;
    }

    /**
     * Norm float.
     *
     * @param array the array
     * @return the float
     */
    public static float norm(float[] array) {
        float retval = 0;
        for (int i = 0; i < array.length; i++) {
            retval += array[i] * array[i];
        }
        return (float) Math.sqrt(retval);
    }


    /**
     * Dot float.
     *
     * @param a the a
     * @param b the b
     * @return the float
     */
    public static float dot(float[] a, float[] b) {
        float retval = a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
        return retval;
    }

    /**
     * Normalize float [ ].
     *
     * @param a the a
     * @return the float [ ]
     */
    public static float[] normalize(float[] a) {
        float[] retval = new float[a.length];
        float norm = norm(a);
        for (int i = 0; i < a.length; i++) {
            retval[i] = a[i] / norm;
        }
        return retval;
    }

}

