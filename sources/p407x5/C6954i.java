package p407x5;

/* renamed from: x5.i */
/* loaded from: classes.dex */
public final class C6954i implements p387w5.InterfaceC6806i, p407x5.InterfaceC6946a {

    /* renamed from: Y */
    public final java.util.concurrent.atomic.AtomicBoolean f27161Y;

    /* renamed from: Z */
    public final java.util.concurrent.atomic.AtomicBoolean f27162Z;

    /* renamed from: a0 */
    public final p407x5.C6952g f27163a0;

    /* renamed from: b0 */
    public final p407x5.C6948c f27164b0;

    /* renamed from: c0 */
    public final p371v5.C6575y<java.lang.Long> f27165c0;

    /* renamed from: d0 */
    public final p371v5.C6575y<p407x5.C6950e> f27166d0;

    /* renamed from: e0 */
    public final float[] f27167e0;

    /* renamed from: f0 */
    public final float[] f27168f0;

    /* renamed from: g0 */
    public int f27169g0;

    /* renamed from: h0 */
    public android.graphics.SurfaceTexture f27170h0;

    /* renamed from: i0 */
    public volatile int f27171i0;

    /* renamed from: j0 */
    public int f27172j0;

    /* renamed from: k0 */
    public byte[] f27173k0;

    public C6954i() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f27161Y = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.f27162Z = r0
            x5.g r0 = new x5.g
            r0.<init>()
            r2.f27163a0 = r0
            x5.c r0 = new x5.c
            r0.<init>()
            r2.f27164b0 = r0
            v5.y r0 = new v5.y
            r0.<init>()
            r2.f27165c0 = r0
            v5.y r0 = new v5.y
            r0.<init>()
            r2.f27166d0 = r0
            r0 = 16
            float[] r1 = new float[r0]
            r2.f27167e0 = r1
            float[] r0 = new float[r0]
            r2.f27168f0 = r0
            r0 = 0
            r2.f27171i0 = r0
            r0 = -1
            r2.f27172j0 = r0
            return
    }

    /* renamed from: a */
    public android.graphics.SurfaceTexture m14120a() {
            r5 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r0, r0, r0, r1)
            p371v5.C6562l.m13350a()
            x5.g r0 = r5.f27163a0
            java.util.Objects.requireNonNull(r0)
            v5.l$a r1 = new v5.l$a
            java.lang.String[] r2 = p407x5.C6952g.f27140j
            java.lang.String[] r3 = p407x5.C6952g.f27141k
            r1.<init>(r2, r3)
            r0.f27150d = r1
            int r1 = r1.f25658a
            java.lang.String r2 = "uMvpMatrix"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)
            r0.f27151e = r1
            v5.l$a r1 = r0.f27150d
            int r1 = r1.f25658a
            java.lang.String r2 = "uTexMatrix"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)
            r0.f27152f = r1
            v5.l$a r1 = r0.f27150d
            int r1 = r1.f25658a
            java.lang.String r2 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r2)
            r0.f27153g = r1
            v5.l$a r1 = r0.f27150d
            int r1 = r1.f25658a
            java.lang.String r2 = "aTexCoords"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r2)
            r0.f27154h = r1
            v5.l$a r1 = r0.f27150d
            int r1 = r1.f25658a
            java.lang.String r2 = "uTexture"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r2)
            r0.f27155i = r1
            p371v5.C6562l.m13350a()
            r0 = 1
            int[] r1 = new int[r0]
            java.nio.IntBuffer r2 = java.nio.IntBuffer.wrap(r1)
            android.opengl.GLES20.glGenTextures(r0, r2)
            r0 = 0
            r2 = r1[r0]
            r3 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r3, r2)
            r2 = 10241(0x2801, float:1.435E-41)
            r4 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r3, r2, r4)
            r2 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r3, r2, r4)
            r2 = 10242(0x2802, float:1.4352E-41)
            r4 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r3, r2, r4)
            r2 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r3, r2, r4)
            p371v5.C6562l.m13350a()
            r0 = r1[r0]
            r5.f27169g0 = r0
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            int r1 = r5.f27169g0
            r0.<init>(r1)
            r5.f27170h0 = r0
            x5.h r1 = new x5.h
            r1.<init>(r5)
            r0.setOnFrameAvailableListener(r1)
            android.graphics.SurfaceTexture r0 = r5.f27170h0
            return r0
    }

    @Override // p407x5.InterfaceC6946a
    /* renamed from: c */
    public void mo5306c(long r2, float[] r4) {
            r1 = this;
            x5.c r0 = r1.f27164b0
            v5.y<float[]> r0 = r0.f27122c
            v5.y r0 = (p371v5.C6575y) r0
            r0.m13429a(r2, r4)
            return
    }

    @Override // p407x5.InterfaceC6946a
    /* renamed from: e */
    public void mo5307e() {
            r2 = this;
            v5.y<java.lang.Long> r0 = r2.f27165c0
            r0.m13430b()
            x5.c r0 = r2.f27164b0
            v5.y<float[]> r1 = r0.f27122c
            v5.y r1 = (p371v5.C6575y) r1
            r1.m13430b()
            r1 = 0
            r0.f27123d = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f27162Z
            r1 = 1
            r0.set(r1)
            return
    }

    @Override // p387w5.InterfaceC6806i
    /* renamed from: f */
    public void mo5308f(long r33, long r35, p088f4.C2003e0 r37, android.media.MediaFormat r38) {
            r32 = this;
            r0 = r32
            r1 = r35
            r3 = r37
            v5.y<java.lang.Long> r4 = r0.f27165c0
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r4.m13429a(r1, r5)
            byte[] r4 = r3.f8906t0
            int r3 = r3.f8907u0
            byte[] r5 = r0.f27173k0
            int r6 = r0.f27172j0
            r0.f27173k0 = r4
            r4 = -1
            if (r3 != r4) goto L1e
            int r3 = r0.f27171i0
        L1e:
            r0.f27172j0 = r3
            if (r6 != r3) goto L2c
            byte[] r3 = r0.f27173k0
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L2c
            goto L202
        L2c:
            byte[] r3 = r0.f27173k0
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto Lb0
            int r8 = r0.f27172j0
            v5.u r9 = new v5.u
            r9.<init>(r3)
            r3 = 4
            r9.m13397G(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            int r3 = r9.m13403f()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            r9.m13396F(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r10) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L81
            r3 = 8
            r9.m13397G(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            int r3 = r9.f25711b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            int r10 = r9.f25712c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
        L59:
            if (r3 >= r10) goto L86
            int r11 = r9.m13403f()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            int r11 = r11 + r3
            if (r11 <= r3) goto L86
            if (r11 <= r10) goto L65
            goto L86
        L65:
            int r3 = r9.m13403f()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            r12 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r12) goto L79
            r12 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r12) goto L74
            goto L79
        L74:
            r9.m13396F(r11)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            r3 = r11
            goto L59
        L79:
            r9.m13395E(r11)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            java.util.ArrayList r3 = p407x5.C6951f.m14118a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            goto L87
        L81:
            java.util.ArrayList r3 = p407x5.C6951f.m14118a(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L86
            goto L87
        L86:
            r3 = r4
        L87:
            if (r3 != 0) goto L8a
            goto Lb0
        L8a:
            int r9 = r3.size()
            if (r9 == r7) goto La5
            if (r9 == r5) goto L93
            goto Lb0
        L93:
            x5.e r4 = new x5.e
            java.lang.Object r9 = r3.get(r6)
            x5.e$a r9 = (p407x5.C6950e.a) r9
            java.lang.Object r3 = r3.get(r7)
            x5.e$a r3 = (p407x5.C6950e.a) r3
            r4.<init>(r9, r3, r8)
            goto Lb0
        La5:
            x5.e r4 = new x5.e
            java.lang.Object r3 = r3.get(r6)
            x5.e$a r3 = (p407x5.C6950e.a) r3
            r4.<init>(r3, r8)
        Lb0:
            if (r4 == 0) goto Lba
            boolean r3 = p407x5.C6952g.m14119a(r4)
            if (r3 == 0) goto Lba
            goto L1fb
        Lba:
            int r3 = r0.f27172j0
            p371v5.C6549a.m13288b(r7)
            p371v5.C6549a.m13288b(r7)
            p371v5.C6549a.m13288b(r7)
            p371v5.C6549a.m13288b(r7)
            p371v5.C6549a.m13288b(r7)
            r4 = 1127481344(0x43340000, float:180.0)
            double r8 = (double) r4
            double r8 = java.lang.Math.toRadians(r8)
            float r4 = (float) r8
            r8 = 1135869952(0x43b40000, float:360.0)
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            r9 = 36
            float r10 = (float) r9
            float r10 = r4 / r10
            r11 = 72
            float r12 = (float) r11
            float r12 = r8 / r12
            r13 = 15984(0x3e70, float:2.2398E-41)
            float[] r13 = new float[r13]
            r14 = 10656(0x29a0, float:1.4932E-41)
            float[] r14 = new float[r14]
            r15 = 0
            r16 = 0
            r17 = 0
        Lf2:
            if (r15 >= r9) goto L1e2
            float r9 = (float) r15
            float r9 = r9 * r10
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r4 / r18
            float r9 = r9 - r19
            int r6 = r15 + 1
            float r7 = (float) r6
            float r7 = r7 * r10
            float r7 = r7 - r19
            r11 = 0
        L105:
            r5 = 73
            if (r11 >= r5) goto L1d1
            r20 = r6
            r5 = 0
            r6 = 2
        L10d:
            if (r5 >= r6) goto L1b5
            if (r5 != 0) goto L115
            r21 = r7
            r6 = r9
            goto L118
        L115:
            r6 = r7
            r21 = r6
        L118:
            float r7 = (float) r11
            float r7 = r7 * r12
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r7 + r22
            float r23 = r8 / r18
            r24 = r9
            float r9 = r22 - r23
            int r22 = r16 + 1
            r23 = r12
            r12 = 1112014848(0x42480000, float:50.0)
            double r1 = (double) r12
            r25 = r11
            double r11 = (double) r9
            double r26 = java.lang.Math.sin(r11)
            double r26 = r26 * r1
            r9 = r3
            r28 = r4
            double r3 = (double) r6
            double r29 = java.lang.Math.cos(r3)
            r31 = r9
            r6 = r10
            double r9 = r29 * r26
            float r9 = (float) r9
            float r9 = -r9
            r13[r16] = r9
            int r9 = r22 + 1
            double r26 = java.lang.Math.sin(r3)
            r10 = r5
            r29 = r6
            double r5 = r26 * r1
            float r5 = (float) r5
            r13[r22] = r5
            int r5 = r9 + 1
            double r11 = java.lang.Math.cos(r11)
            double r11 = r11 * r1
            double r1 = java.lang.Math.cos(r3)
            double r1 = r1 * r11
            float r1 = (float) r1
            r13[r9] = r1
            int r1 = r17 + 1
            float r7 = r7 / r8
            r14[r17] = r7
            int r2 = r1 + 1
            int r3 = r15 + r10
            float r3 = (float) r3
            float r3 = r3 * r29
            float r3 = r3 / r28
            r14[r1] = r3
            if (r25 != 0) goto L181
            if (r10 == 0) goto L17b
            goto L181
        L17b:
            r4 = r10
            r1 = r25
            r3 = 72
            goto L18b
        L181:
            r1 = r25
            r3 = 72
            r4 = r10
            if (r1 != r3) goto L19c
            r6 = 1
            if (r4 != r6) goto L19c
        L18b:
            int r6 = r5 + (-3)
            r7 = 3
            java.lang.System.arraycopy(r13, r6, r13, r5, r7)
            int r5 = r5 + 3
            int r6 = r2 + (-2)
            r7 = 2
            java.lang.System.arraycopy(r14, r6, r14, r2, r7)
            int r2 = r2 + 2
            goto L19d
        L19c:
            r7 = 2
        L19d:
            r17 = r2
            r16 = r5
            int r5 = r4 + 1
            r11 = r1
            r7 = r21
            r12 = r23
            r9 = r24
            r4 = r28
            r10 = r29
            r3 = r31
            r6 = 2
            r1 = r35
            goto L10d
        L1b5:
            r31 = r3
            r28 = r4
            r21 = r7
            r24 = r9
            r29 = r10
            r1 = r11
            r23 = r12
            r3 = 72
            r7 = 2
            int r11 = r1 + 1
            r1 = r35
            r6 = r20
            r7 = r21
            r3 = r31
            goto L105
        L1d1:
            r31 = r3
            r20 = r6
            r1 = r35
            r15 = r20
            r5 = 2
            r6 = 0
            r7 = 1
            r9 = 36
            r11 = 72
            goto Lf2
        L1e2:
            r31 = r3
            x5.e$b r1 = new x5.e$b
            r2 = 0
            r3 = 1
            r1.<init>(r2, r13, r14, r3)
            x5.e r4 = new x5.e
            x5.e$a r5 = new x5.e$a
            x5.e$b[] r3 = new p407x5.C6950e.b[r3]
            r3[r2] = r1
            r5.<init>(r3)
            r1 = r31
            r4.<init>(r5, r1)
        L1fb:
            v5.y<x5.e> r1 = r0.f27166d0
            r2 = r35
            r1.m13429a(r2, r4)
        L202:
            return
    }
}
