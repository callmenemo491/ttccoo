package p371v5;

/* renamed from: v5.l */
/* loaded from: classes.dex */
public final class C6562l {

    /* renamed from: v5.l$a */
    public static final class a {

        /* renamed from: a */
        public final int f25658a;

        public a(java.lang.String[] r2, java.lang.String[] r3) {
                r1 = this;
                java.lang.String r0 = "\n"
                java.lang.String r2 = android.text.TextUtils.join(r0, r2)
                java.lang.String r3 = android.text.TextUtils.join(r0, r3)
                r1.<init>()
                int r0 = android.opengl.GLES20.glCreateProgram()
                r1.f25658a = r0
                p371v5.C6562l.m13350a()
                r0 = 35633(0x8b31, float:4.9932E-41)
                r1.m13352a(r0, r2)
                r2 = 35632(0x8b30, float:4.9931E-41)
                r1.m13352a(r2, r3)
                return
        }

        /* renamed from: a */
        public final void m13352a(int r5, java.lang.String r6) {
                r4 = this;
                int r5 = android.opengl.GLES20.glCreateShader(r5)
                android.opengl.GLES20.glShaderSource(r5, r6)
                android.opengl.GLES20.glCompileShader(r5)
                r0 = 1
                int[] r1 = new int[r0]
                r2 = 0
                r1[r2] = r2
                r3 = 35713(0x8b81, float:5.0045E-41)
                android.opengl.GLES20.glGetShaderiv(r5, r3, r1, r2)
                r1 = r1[r2]
                if (r1 == r0) goto L41
                java.lang.String r0 = android.opengl.GLES20.glGetShaderInfoLog(r5)
                r1 = 10
                int r1 = p064e.C1489c.m4038a(r0, r1)
                int r1 = p064e.C1489c.m4038a(r6, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r0)
                java.lang.String r0 = ", source: "
                r2.append(r0)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                java.lang.String r0 = "GlUtil"
                android.util.Log.e(r0, r6)
            L41:
                int r6 = r4.f25658a
                android.opengl.GLES20.glAttachShader(r6, r5)
                android.opengl.GLES20.glDeleteShader(r5)
                p371v5.C6562l.m13350a()
                return
        }
    }

    /* renamed from: a */
    public static void m13350a() {
            r0 = 0
        L1:
            int r1 = android.opengl.GLES20.glGetError()
            java.lang.String r2 = "glError "
            java.lang.String r3 = "GlUtil"
            if (r1 == 0) goto L28
            java.lang.String r0 = android.opengl.GLU.gluErrorString(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L1e
            java.lang.String r0 = r2.concat(r0)
            goto L23
        L1e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L23:
            android.util.Log.e(r3, r0)
            r0 = r1
            goto L1
        L28:
            if (r0 == 0) goto L45
            java.lang.String r0 = android.opengl.GLU.gluErrorString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L3d
            java.lang.String r0 = r2.concat(r0)
            goto L42
        L3d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L42:
            android.util.Log.e(r3, r0)
        L45:
            return
    }

    /* renamed from: b */
    public static java.nio.FloatBuffer m13351b(float[] r2) {
            int r0 = r2.length
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()
            java.nio.FloatBuffer r2 = r0.put(r2)
            java.nio.Buffer r2 = r2.flip()
            java.nio.FloatBuffer r2 = (java.nio.FloatBuffer) r2
            return r2
    }
}
