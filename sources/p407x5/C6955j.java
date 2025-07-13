package p407x5;

/* renamed from: x5.j */
/* loaded from: classes.dex */
public final class C6955j extends android.opengl.GLSurfaceView {

    /* renamed from: a0 */
    public final java.util.concurrent.CopyOnWriteArrayList<p407x5.C6955j.b> f27174a0;

    /* renamed from: b0 */
    public final android.hardware.SensorManager f27175b0;

    /* renamed from: c0 */
    public final android.hardware.Sensor f27176c0;

    /* renamed from: d0 */
    public final p407x5.C6949d f27177d0;

    /* renamed from: e0 */
    public final android.os.Handler f27178e0;

    /* renamed from: f0 */
    public final p407x5.C6954i f27179f0;

    /* renamed from: g0 */
    public android.graphics.SurfaceTexture f27180g0;

    /* renamed from: h0 */
    public android.view.Surface f27181h0;

    /* renamed from: i0 */
    public boolean f27182i0;

    /* renamed from: j0 */
    public boolean f27183j0;

    /* renamed from: k0 */
    public boolean f27184k0;

    /* renamed from: x5.j$a */
    public final class a implements android.opengl.GLSurfaceView.Renderer, p407x5.ViewOnTouchListenerC6956k.a, p407x5.C6949d.a {

        /* renamed from: Y */
        public final p407x5.C6954i f27185Y;

        /* renamed from: Z */
        public final float[] f27186Z;

        /* renamed from: a0 */
        public final float[] f27187a0;

        /* renamed from: b0 */
        public final float[] f27188b0;

        /* renamed from: c0 */
        public final float[] f27189c0;

        /* renamed from: d0 */
        public final float[] f27190d0;

        /* renamed from: e0 */
        public float f27191e0;

        /* renamed from: f0 */
        public float f27192f0;

        /* renamed from: g0 */
        public final float[] f27193g0;

        /* renamed from: h0 */
        public final float[] f27194h0;

        /* renamed from: i0 */
        public final /* synthetic */ p407x5.C6955j f27195i0;

        public a(p407x5.C6955j r5, p407x5.C6954i r6) {
                r4 = this;
                r4.f27195i0 = r5
                r4.<init>()
                r5 = 16
                float[] r0 = new float[r5]
                r4.f27186Z = r0
                float[] r0 = new float[r5]
                r4.f27187a0 = r0
                float[] r0 = new float[r5]
                r4.f27188b0 = r0
                float[] r1 = new float[r5]
                r4.f27189c0 = r1
                float[] r2 = new float[r5]
                r4.f27190d0 = r2
                float[] r3 = new float[r5]
                r4.f27193g0 = r3
                float[] r5 = new float[r5]
                r4.f27194h0 = r5
                r4.f27185Y = r6
                r5 = 0
                android.opengl.Matrix.setIdentityM(r0, r5)
                android.opengl.Matrix.setIdentityM(r1, r5)
                android.opengl.Matrix.setIdentityM(r2, r5)
                r5 = 1078530011(0x40490fdb, float:3.1415927)
                r4.f27192f0 = r5
                return
        }

        @Override // p407x5.C6949d.a
        /* renamed from: a */
        public synchronized void mo14117a(float[] r4, float r5) {
                r3 = this;
                monitor-enter(r3)
                float[] r0 = r3.f27188b0     // Catch: java.lang.Throwable -> L10
                int r1 = r0.length     // Catch: java.lang.Throwable -> L10
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)     // Catch: java.lang.Throwable -> L10
                float r4 = -r5
                r3.f27192f0 = r4     // Catch: java.lang.Throwable -> L10
                r3.m14122b()     // Catch: java.lang.Throwable -> L10
                monitor-exit(r3)
                return
            L10:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
        }

        /* renamed from: b */
        public final void m14122b() {
                r6 = this;
                float[] r0 = r6.f27189c0
                float r1 = r6.f27191e0
                float r2 = -r1
                float r1 = r6.f27192f0
                double r3 = (double) r1
                double r3 = java.lang.Math.cos(r3)
                float r3 = (float) r3
                float r1 = r6.f27192f0
                double r4 = (double) r1
                double r4 = java.lang.Math.sin(r4)
                float r4 = (float) r4
                r1 = 0
                r5 = 0
                android.opengl.Matrix.setRotateM(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r23) {
                r22 = this;
                r1 = r22
                monitor-enter(r22)
                float[] r2 = r1.f27194h0     // Catch: java.lang.Throwable -> L1e3
                r3 = 0
                float[] r4 = r1.f27188b0     // Catch: java.lang.Throwable -> L1e3
                r5 = 0
                float[] r6 = r1.f27190d0     // Catch: java.lang.Throwable -> L1e3
                r7 = 0
                android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1e3
                float[] r8 = r1.f27193g0     // Catch: java.lang.Throwable -> L1e3
                r9 = 0
                float[] r10 = r1.f27189c0     // Catch: java.lang.Throwable -> L1e3
                r11 = 0
                float[] r12 = r1.f27194h0     // Catch: java.lang.Throwable -> L1e3
                r13 = 0
                android.opengl.Matrix.multiplyMM(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L1e3
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L1e3
                float[] r2 = r1.f27187a0
                r3 = 0
                float[] r4 = r1.f27186Z
                r5 = 0
                float[] r6 = r1.f27193g0
                r7 = 0
                android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7)
                x5.i r0 = r1.f27185Y
                float[] r4 = r1.f27187a0
                java.util.Objects.requireNonNull(r0)
                r2 = 16384(0x4000, float:2.2959E-41)
                android.opengl.GLES20.glClear(r2)
                p371v5.C6562l.m13350a()
                java.util.concurrent.atomic.AtomicBoolean r2 = r0.f27161Y
                r8 = 1
                r9 = 0
                boolean r2 = r2.compareAndSet(r8, r9)
                r10 = 2
                if (r2 == 0) goto L111
                android.graphics.SurfaceTexture r2 = r0.f27170h0
                java.util.Objects.requireNonNull(r2)
                r2.updateTexImage()
                p371v5.C6562l.m13350a()
                java.util.concurrent.atomic.AtomicBoolean r2 = r0.f27162Z
                boolean r2 = r2.compareAndSet(r8, r9)
                if (r2 == 0) goto L5a
                float[] r2 = r0.f27167e0
                android.opengl.Matrix.setIdentityM(r2, r9)
            L5a:
                android.graphics.SurfaceTexture r2 = r0.f27170h0
                long r2 = r2.getTimestamp()
                v5.y<java.lang.Long> r5 = r0.f27165c0
                monitor-enter(r5)
                java.lang.Object r6 = r5.m13438j(r2, r9)     // Catch: java.lang.Throwable -> L10d
                monitor-exit(r5)
                java.lang.Long r6 = (java.lang.Long) r6
                if (r6 == 0) goto Ld3
                x5.c r5 = r0.f27164b0
                float[] r11 = r0.f27167e0
                long r6 = r6.longValue()
                v5.y<float[]> r12 = r5.f27122c
                v5.y r12 = (p371v5.C6575y) r12
                java.lang.Object r6 = r12.m13439k(r6)
                float[] r6 = (float[]) r6
                if (r6 != 0) goto L81
                goto Ld3
            L81:
                java.lang.Object r7 = r5.f27121b
                r12 = r7
                float[] r12 = (float[]) r12
                r7 = r6[r9]
                r13 = r6[r8]
                float r13 = -r13
                r6 = r6[r10]
                float r6 = -r6
                float r14 = android.opengl.Matrix.length(r7, r13, r6)
                r15 = 0
                int r15 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
                r18 = r11
                if (r15 == 0) goto Lac
                double r10 = (double) r14
                double r10 = java.lang.Math.toDegrees(r10)
                float r10 = (float) r10
                r11 = 0
                float r15 = r7 / r14
                float r16 = r13 / r14
                float r17 = r6 / r14
                r13 = r11
                r14 = r10
                android.opengl.Matrix.setRotateM(r12, r13, r14, r15, r16, r17)
                goto Laf
            Lac:
                android.opengl.Matrix.setIdentityM(r12, r9)
            Laf:
                boolean r6 = r5.f27123d
                if (r6 != 0) goto Lc0
                java.lang.Object r6 = r5.f27120a
                float[] r6 = (float[]) r6
                java.lang.Object r7 = r5.f27121b
                float[] r7 = (float[]) r7
                p407x5.C6948c.m14111a(r6, r7)
                r5.f27123d = r8
            Lc0:
                r12 = 0
                java.lang.Object r6 = r5.f27120a
                r13 = r6
                float[] r13 = (float[]) r13
                r14 = 0
                java.lang.Object r5 = r5.f27121b
                r15 = r5
                float[] r15 = (float[]) r15
                r16 = 0
                r11 = r18
                android.opengl.Matrix.multiplyMM(r11, r12, r13, r14, r15, r16)
            Ld3:
                v5.y<x5.e> r5 = r0.f27166d0
                java.lang.Object r2 = r5.m13439k(r2)
                x5.e r2 = (p407x5.C6950e) r2
                if (r2 == 0) goto L111
                x5.g r3 = r0.f27163a0
                java.util.Objects.requireNonNull(r3)
                boolean r5 = p407x5.C6952g.m14119a(r2)
                if (r5 != 0) goto Le9
                goto L111
            Le9:
                int r5 = r2.f27133c
                r3.f27147a = r5
                x5.g$a r5 = new x5.g$a
                x5.e$a r6 = r2.f27131a
                x5.e$b[] r6 = r6.f27135a
                r6 = r6[r9]
                r5.<init>(r6)
                r3.f27148b = r5
                boolean r6 = r2.f27134d
                if (r6 == 0) goto Lff
                goto L10a
            Lff:
                x5.g$a r5 = new x5.g$a
                x5.e$a r2 = r2.f27132b
                x5.e$b[] r2 = r2.f27135a
                r2 = r2[r9]
                r5.<init>(r2)
            L10a:
                r3.f27149c = r5
                goto L111
            L10d:
                r0 = move-exception
                r2 = r0
                monitor-exit(r5)
                throw r2
            L111:
                float[] r2 = r0.f27168f0
                r3 = 0
                r5 = 0
                float[] r6 = r0.f27167e0
                r7 = 0
                android.opengl.Matrix.multiplyMM(r2, r3, r4, r5, r6, r7)
                x5.g r2 = r0.f27163a0
                int r3 = r0.f27169g0
                float[] r0 = r0.f27168f0
                x5.g$a r4 = r2.f27148b
                if (r4 != 0) goto L127
                goto L1e2
            L127:
                v5.l$a r5 = r2.f27150d
                java.util.Objects.requireNonNull(r5)
                int r6 = r5.f25658a
                android.opengl.GLES20.glLinkProgram(r6)
                int[] r6 = new int[r8]
                r6[r9] = r9
                int r7 = r5.f25658a
                r10 = 35714(0x8b82, float:5.0046E-41)
                android.opengl.GLES20.glGetProgramiv(r7, r10, r6, r9)
                r6 = r6[r9]
                if (r6 == r8) goto L163
                java.lang.String r6 = "Unable to link shader program: \n"
                int r7 = r5.f25658a
                java.lang.String r7 = android.opengl.GLES20.glGetProgramInfoLog(r7)
                java.lang.String r7 = java.lang.String.valueOf(r7)
                int r10 = r7.length()
                if (r10 == 0) goto L158
                java.lang.String r6 = r6.concat(r7)
                goto L15e
            L158:
                java.lang.String r7 = new java.lang.String
                r7.<init>(r6)
                r6 = r7
            L15e:
                java.lang.String r7 = "GlUtil"
                android.util.Log.e(r7, r6)
            L163:
                p371v5.C6562l.m13350a()
                int r5 = r5.f25658a
                android.opengl.GLES20.glUseProgram(r5)
                p371v5.C6562l.m13350a()
                int r5 = r2.f27153g
                android.opengl.GLES20.glEnableVertexAttribArray(r5)
                int r5 = r2.f27154h
                android.opengl.GLES20.glEnableVertexAttribArray(r5)
                p371v5.C6562l.m13350a()
                int r5 = r2.f27147a
                if (r5 != r8) goto L182
                float[] r5 = p407x5.C6952g.f27143m
                goto L18a
            L182:
                r6 = 2
                if (r5 != r6) goto L188
                float[] r5 = p407x5.C6952g.f27145o
                goto L18a
            L188:
                float[] r5 = p407x5.C6952g.f27142l
            L18a:
                int r6 = r2.f27152f
                android.opengl.GLES20.glUniformMatrix3fv(r6, r8, r9, r5, r9)
                int r5 = r2.f27151e
                android.opengl.GLES20.glUniformMatrix4fv(r5, r8, r9, r0, r9)
                r0 = 33984(0x84c0, float:4.7622E-41)
                android.opengl.GLES20.glActiveTexture(r0)
                r0 = 36197(0x8d65, float:5.0723E-41)
                android.opengl.GLES20.glBindTexture(r0, r3)
                int r0 = r2.f27155i
                android.opengl.GLES20.glUniform1i(r0, r9)
                p371v5.C6562l.m13350a()
                int r10 = r2.f27153g
                r11 = 3
                r12 = 5126(0x1406, float:7.183E-42)
                r13 = 0
                r14 = 12
                java.nio.FloatBuffer r15 = r4.f27157b
                android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)
                p371v5.C6562l.m13350a()
                int r0 = r2.f27154h
                r17 = 2
                r18 = 5126(0x1406, float:7.183E-42)
                r19 = 0
                r20 = 8
                java.nio.FloatBuffer r3 = r4.f27158c
                r16 = r0
                r21 = r3
                android.opengl.GLES20.glVertexAttribPointer(r16, r17, r18, r19, r20, r21)
                p371v5.C6562l.m13350a()
                int r0 = r4.f27159d
                int r3 = r4.f27156a
                android.opengl.GLES20.glDrawArrays(r0, r9, r3)
                p371v5.C6562l.m13350a()
                int r0 = r2.f27153g
                android.opengl.GLES20.glDisableVertexAttribArray(r0)
                int r0 = r2.f27154h
                android.opengl.GLES20.glDisableVertexAttribArray(r0)
            L1e2:
                return
            L1e3:
                r0 = move-exception
                monitor-exit(r22)     // Catch: java.lang.Throwable -> L1e3
                throw r0
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r7, int r8, int r9) {
                r6 = this;
                r7 = 0
                android.opengl.GLES20.glViewport(r7, r7, r8, r9)
                float r8 = (float) r8
                float r9 = (float) r9
                float r3 = r8 / r9
                r8 = 1065353216(0x3f800000, float:1.0)
                int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r8 <= 0) goto Lf
                r7 = 1
            Lf:
                if (r7 == 0) goto L2f
                r7 = 4631530004285489152(0x4046800000000000, double:45.0)
                double r7 = java.lang.Math.toRadians(r7)
                double r7 = java.lang.Math.tan(r7)
                double r0 = (double) r3
                double r7 = r7 / r0
                double r7 = java.lang.Math.atan(r7)
                double r7 = java.lang.Math.toDegrees(r7)
                r0 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r7 = r7 * r0
                float r7 = (float) r7
                r2 = r7
                goto L33
            L2f:
                r7 = 1119092736(0x42b40000, float:90.0)
                r2 = 1119092736(0x42b40000, float:90.0)
            L33:
                float[] r0 = r6.f27186Z
                r1 = 0
                r4 = 1036831949(0x3dcccccd, float:0.1)
                r5 = 1120403456(0x42c80000, float:100.0)
                android.opengl.Matrix.perspectiveM(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 r3, javax.microedition.khronos.egl.EGLConfig r4) {
                r2 = this;
                monitor-enter(r2)
                x5.j r3 = r2.f27195i0     // Catch: java.lang.Throwable -> L15
                x5.i r4 = r2.f27185Y     // Catch: java.lang.Throwable -> L15
                android.graphics.SurfaceTexture r4 = r4.m14120a()     // Catch: java.lang.Throwable -> L15
                android.os.Handler r0 = r3.f27178e0     // Catch: java.lang.Throwable -> L15
                a4.c r1 = new a4.c     // Catch: java.lang.Throwable -> L15
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L15
                r0.post(r1)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)
                return
            L15:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
        }
    }

    /* renamed from: x5.j$b */
    public interface b {
        /* renamed from: i */
        void mo5297i(android.view.Surface r1);

        /* renamed from: o */
        void mo5300o(android.view.Surface r1);
    }

    public C6955j(android.content.Context r7) {
            r6 = this;
            r0 = 0
            r6.<init>(r7, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r6.f27174a0 = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r6.f27178e0 = r1
            java.lang.String r1 = "sensor"
            java.lang.Object r1 = r7.getSystemService(r1)
            java.util.Objects.requireNonNull(r1)
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1
            r6.f27175b0 = r1
            int r2 = p371v5.C6552b0.f25624a
            r3 = 18
            if (r2 < r3) goto L2f
            r0 = 15
            android.hardware.Sensor r0 = r1.getDefaultSensor(r0)
        L2f:
            if (r0 != 0) goto L37
            r0 = 11
            android.hardware.Sensor r0 = r1.getDefaultSensor(r0)
        L37:
            r6.f27176c0 = r0
            x5.i r0 = new x5.i
            r0.<init>()
            r6.f27179f0 = r0
            x5.j$a r1 = new x5.j$a
            r1.<init>(r6, r0)
            x5.k r0 = new x5.k
            r2 = 1103626240(0x41c80000, float:25.0)
            r0.<init>(r7, r1, r2)
            java.lang.String r2 = "window"
            java.lang.Object r7 = r7.getSystemService(r2)
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            java.util.Objects.requireNonNull(r7)
            android.view.Display r7 = r7.getDefaultDisplay()
            x5.d r2 = new x5.d
            r3 = 2
            x5.d$a[] r4 = new p407x5.C6949d.a[r3]
            r5 = 0
            r4[r5] = r0
            r5 = 1
            r4[r5] = r1
            r2.<init>(r7, r4)
            r6.f27177d0 = r2
            r6.f27182i0 = r5
            r6.setEGLContextClientVersion(r3)
            r6.setRenderer(r1)
            r6.setOnTouchListener(r0)
            return
    }

    /* renamed from: a */
    public final void m14121a() {
            r5 = this;
            boolean r0 = r5.f27182i0
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r0 = r5.f27183j0
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.hardware.Sensor r2 = r5.f27176c0
            if (r2 == 0) goto L28
            boolean r3 = r5.f27184k0
            if (r0 != r3) goto L15
            goto L28
        L15:
            if (r0 == 0) goto L1f
            android.hardware.SensorManager r3 = r5.f27175b0
            x5.d r4 = r5.f27177d0
            r3.registerListener(r4, r2, r1)
            goto L26
        L1f:
            android.hardware.SensorManager r1 = r5.f27175b0
            x5.d r2 = r5.f27177d0
            r1.unregisterListener(r2)
        L26:
            r5.f27184k0 = r0
        L28:
            return
    }

    public p407x5.InterfaceC6946a getCameraMotionListener() {
            r1 = this;
            x5.i r0 = r1.f27179f0
            return r0
    }

    public p387w5.InterfaceC6806i getVideoFrameMetadataListener() {
            r1 = this;
            x5.i r0 = r1.f27179f0
            return r0
    }

    public android.view.Surface getVideoSurface() {
            r1 = this;
            android.view.Surface r0 = r1.f27181h0
            return r0
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.os.Handler r0 = r2.f27178e0
            f1.f r1 = new f1.f
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
            r1 = this;
            r0 = 0
            r1.f27183j0 = r0
            r1.m14121a()
            super.onPause()
            return
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
            r1 = this;
            super.onResume()
            r0 = 1
            r1.f27183j0 = r0
            r1.m14121a()
            return
    }

    public void setDefaultStereoMode(int r2) {
            r1 = this;
            x5.i r0 = r1.f27179f0
            r0.f27171i0 = r2
            return
    }

    public void setUseSensorRotation(boolean r1) {
            r0 = this;
            r0.f27182i0 = r1
            r0.m14121a()
            return
    }
}
