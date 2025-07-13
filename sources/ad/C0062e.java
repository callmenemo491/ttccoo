package ad;

/* renamed from: ad.e */
/* loaded from: classes.dex */
public final class C0062e {

    /* renamed from: n */
    public static final /* synthetic */ int f179n = 0;

    /* renamed from: a */
    public android.hardware.Camera f180a;

    /* renamed from: b */
    public android.hardware.Camera.CameraInfo f181b;

    /* renamed from: c */
    public ad.C0058a f182c;

    /* renamed from: d */
    public p413xb.C7018a f183d;

    /* renamed from: e */
    public boolean f184e;

    /* renamed from: f */
    public java.lang.String f185f;

    /* renamed from: g */
    public ad.C0063f f186g;

    /* renamed from: h */
    public ad.C0066i f187h;

    /* renamed from: i */
    public p454zc.C7294r f188i;

    /* renamed from: j */
    public p454zc.C7294r f189j;

    /* renamed from: k */
    public int f190k;

    /* renamed from: l */
    public android.content.Context f191l;

    /* renamed from: m */
    public final ad.C0062e.a f192m;

    /* renamed from: ad.e$a */
    public final class a implements android.hardware.Camera.PreviewCallback {

        /* renamed from: a */
        public ad.InterfaceC0069l f193a;

        /* renamed from: b */
        public p454zc.C7294r f194b;

        /* renamed from: c */
        public final /* synthetic */ ad.C0062e f195c;

        public a(ad.C0062e r1) {
                r0 = this;
                r0.f195c = r1
                r0.<init>()
                return
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] r9, android.hardware.Camera r10) {
                r8 = this;
                zc.r r0 = r8.f194b
                ad.l r1 = r8.f193a
                if (r0 == 0) goto L5f
                if (r1 == 0) goto L5f
                if (r9 == 0) goto L4d
                android.hardware.Camera$Parameters r10 = r10.getParameters()     // Catch: java.lang.RuntimeException -> L4b
                int r6 = r10.getPreviewFormat()     // Catch: java.lang.RuntimeException -> L4b
                zc.s r10 = new zc.s     // Catch: java.lang.RuntimeException -> L4b
                int r4 = r0.f27963Y     // Catch: java.lang.RuntimeException -> L4b
                int r5 = r0.f27964Z     // Catch: java.lang.RuntimeException -> L4b
                ad.e r0 = r8.f195c     // Catch: java.lang.RuntimeException -> L4b
                int r7 = r0.f190k     // Catch: java.lang.RuntimeException -> L4b
                r2 = r10
                r3 = r9
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L4b
                ad.e r9 = r8.f195c     // Catch: java.lang.RuntimeException -> L4b
                android.hardware.Camera$CameraInfo r9 = r9.f181b     // Catch: java.lang.RuntimeException -> L4b
                int r9 = r9.facing     // Catch: java.lang.RuntimeException -> L4b
                r0 = 1
                if (r9 != r0) goto L2c
                r10.f27969e = r0     // Catch: java.lang.RuntimeException -> L4b
            L2c:
                r9 = r1
                zc.k$b r9 = (p454zc.C7287k.b) r9     // Catch: java.lang.RuntimeException -> L4b
                zc.k r0 = r9.f27952a     // Catch: java.lang.RuntimeException -> L4b
                java.lang.Object r0 = r0.f27948h     // Catch: java.lang.RuntimeException -> L4b
                monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L4b
                zc.k r9 = r9.f27952a     // Catch: java.lang.Throwable -> L48
                boolean r2 = r9.f27947g     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L46
                android.os.Handler r9 = r9.f27943c     // Catch: java.lang.Throwable -> L48
                r2 = 2131362786(0x7f0a03e2, float:1.8345362E38)
                android.os.Message r9 = r9.obtainMessage(r2, r10)     // Catch: java.lang.Throwable -> L48
                r9.sendToTarget()     // Catch: java.lang.Throwable -> L48
            L46:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                goto L76
            L48:
                r9 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                throw r9     // Catch: java.lang.RuntimeException -> L4b
            L4b:
                r9 = move-exception
                goto L55
            L4d:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException     // Catch: java.lang.RuntimeException -> L4b
                java.lang.String r10 = "No preview data received"
                r9.<init>(r10)     // Catch: java.lang.RuntimeException -> L4b
                throw r9     // Catch: java.lang.RuntimeException -> L4b
            L55:
                int r10 = ad.C0062e.f179n
                java.lang.String r10 = "e"
                java.lang.String r0 = "Camera preview failed"
                android.util.Log.e(r10, r0, r9)
                goto L71
            L5f:
                int r9 = ad.C0062e.f179n
                java.lang.String r9 = "e"
                java.lang.String r10 = "Got preview callback, but no handler or resolution available"
                android.util.Log.d(r9, r10)
                if (r1 == 0) goto L76
                java.lang.Exception r9 = new java.lang.Exception
                java.lang.String r10 = "No resolution available"
                r9.<init>(r10)
            L71:
                zc.k$b r1 = (p454zc.C7287k.b) r1
                r1.m14393a(r9)
            L76:
                return
        }
    }

    public C0062e(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            ad.f r0 = new ad.f
            r0.<init>()
            r1.f186g = r0
            r0 = -1
            r1.f190k = r0
            r1.f191l = r2
            ad.e$a r2 = new ad.e$a
            r2.<init>(r1)
            r1.f192m = r2
            return
    }

    /* renamed from: a */
    public final int m95a() {
            r4 = this;
            ad.i r0 = r4.f187h
            int r0 = r0.f203b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            if (r0 == r1) goto L17
            r3 = 2
            if (r0 == r3) goto L14
            r3 = 3
            if (r0 == r3) goto L11
            goto L19
        L11:
            r2 = 270(0x10e, float:3.78E-43)
            goto L19
        L14:
            r2 = 180(0xb4, float:2.52E-43)
            goto L19
        L17:
            r2 = 90
        L19:
            android.hardware.Camera$CameraInfo r0 = r4.f181b
            int r3 = r0.facing
            int r0 = r0.orientation
            if (r3 != r1) goto L27
            int r0 = r0 + r2
            int r0 = r0 % 360
            int r0 = 360 - r0
            goto L2a
        L27:
            int r0 = r0 - r2
            int r0 = r0 + 360
        L2a:
            int r0 = r0 % 360
            java.lang.String r1 = "e"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Camera Display Orientation: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r1, r2)
            return r0
    }

    /* renamed from: b */
    public void m96b() {
            r3 = this;
            android.hardware.Camera r0 = r3.f180a
            if (r0 == 0) goto L49
            java.lang.String r0 = "e"
            int r1 = r3.m95a()     // Catch: java.lang.Exception -> L12
            r3.f190k = r1     // Catch: java.lang.Exception -> L12
            android.hardware.Camera r2 = r3.f180a     // Catch: java.lang.Exception -> L12
            r2.setDisplayOrientation(r1)     // Catch: java.lang.Exception -> L12
            goto L17
        L12:
            java.lang.String r1 = "Failed to set rotation."
            android.util.Log.w(r0, r1)
        L17:
            r1 = 0
            r3.m99e(r1)     // Catch: java.lang.Exception -> L1c
            goto L26
        L1c:
            r1 = 1
            r3.m99e(r1)     // Catch: java.lang.Exception -> L21
            goto L26
        L21:
            java.lang.String r1 = "Camera rejected even safe-mode parameters! No configuration"
            android.util.Log.w(r0, r1)
        L26:
            android.hardware.Camera r0 = r3.f180a
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            android.hardware.Camera$Size r0 = r0.getPreviewSize()
            if (r0 != 0) goto L37
            zc.r r0 = r3.f188i
            r3.f189j = r0
            goto L42
        L37:
            zc.r r1 = new zc.r
            int r2 = r0.width
            int r0 = r0.height
            r1.<init>(r2, r0)
            r3.f189j = r1
        L42:
            ad.e$a r0 = r3.f192m
            zc.r r1 = r3.f189j
            r0.f194b = r1
            return
        L49:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Camera not open"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: c */
    public boolean m97c() {
            r2 = this;
            int r0 = r2.f190k
            r1 = -1
            if (r0 == r1) goto Ld
            int r0 = r0 % 180
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Rotation not calculated yet. Call configure() first."
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: d */
    public void m98d() {
            r2 = this;
            ad.f r0 = r2.f186g
            int r0 = r0.f196a
            int r0 = p434yb.C7154a.m14267a(r0)
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 0
            goto L11
        Ld:
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)
        L11:
            r2.f180a = r0
            if (r0 == 0) goto L28
            ad.f r0 = r2.f186g
            int r0 = r0.f196a
            int r0 = p434yb.C7154a.m14267a(r0)
            android.hardware.Camera$CameraInfo r1 = new android.hardware.Camera$CameraInfo
            r1.<init>()
            r2.f181b = r1
            android.hardware.Camera.getCameraInfo(r0, r1)
            return
        L28:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to open camera"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: e */
    public final void m99e(boolean r11) {
            r10 = this;
            java.lang.String r0 = "e"
            android.hardware.Camera r1 = r10.f180a
            android.hardware.Camera$Parameters r1 = r1.getParameters()
            java.lang.String r2 = r10.f185f
            if (r2 != 0) goto L13
            java.lang.String r2 = r1.flatten()
            r10.f185f = r2
            goto L16
        L13:
            r1.unflatten(r2)
        L16:
            if (r1 != 0) goto L1e
            java.lang.String r11 = "Device error: no camera parameters are available. Proceeding without configuration."
            android.util.Log.w(r0, r11)
            return
        L1e:
            java.lang.String r2 = "Initial camera parameters: "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = r1.flatten()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
            if (r11 == 0) goto L39
            java.lang.String r2 = "In camera config safe mode -- most settings will not be honored"
            android.util.Log.w(r0, r2)
        L39:
            ad.f r2 = r10.f186g
            java.util.Objects.requireNonNull(r2)
            int r2 = ad.C0059b.f157a
            java.util.List r2 = r1.getSupportedFocusModes()
            java.lang.String r3 = "focus mode"
            java.lang.String r4 = "auto"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r4 = ad.C0059b.m92a(r3, r2, r4)
            if (r11 != 0) goto L60
            if (r4 != 0) goto L60
            java.lang.String r4 = "macro"
            java.lang.String r5 = "edof"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r4 = ad.C0059b.m92a(r3, r2, r4)
        L60:
            java.lang.String r2 = "CameraConfiguration"
            if (r4 == 0) goto L86
            java.lang.String r3 = r1.getFocusMode()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L83
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Focus mode already set to "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r2, r3)
            goto L86
        L83:
            r1.setFocusMode(r4)
        L86:
            r3 = 0
            if (r11 != 0) goto L9b
            ad.C0059b.m93b(r1, r3)
            ad.f r11 = r10.f186g
            java.util.Objects.requireNonNull(r11)
            ad.f r11 = r10.f186g
            java.util.Objects.requireNonNull(r11)
            ad.f r11 = r10.f186g
            java.util.Objects.requireNonNull(r11)
        L9b:
            java.util.List r11 = r1.getSupportedPreviewSizes()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r11 != 0) goto Lb9
            android.hardware.Camera$Size r11 = r1.getPreviewSize()
            if (r11 == 0) goto Ld6
            int r5 = r11.width
            int r11 = r11.height
            zc.r r6 = new zc.r
            r6.<init>(r5, r11)
            r4.add(r6)
            goto Ld6
        Lb9:
            java.util.Iterator r11 = r11.iterator()
        Lbd:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r11.next()
            android.hardware.Camera$Size r5 = (android.hardware.Camera.Size) r5
            zc.r r6 = new zc.r
            int r7 = r5.width
            int r5 = r5.height
            r6.<init>(r7, r5)
            r4.add(r6)
            goto Lbd
        Ld6:
            int r11 = r4.size()
            r5 = 0
            if (r11 != 0) goto Le0
            r10.f188i = r5
            goto L141
        Le0:
            ad.i r11 = r10.f187h
            boolean r6 = r10.m97c()
            zc.r r7 = r11.f202a
            if (r7 != 0) goto Lec
            r7 = r5
            goto Lf8
        Lec:
            if (r6 == 0) goto Lf8
            zc.r r6 = new zc.r
            int r8 = r7.f27964Z
            int r7 = r7.f27963Y
            r6.<init>(r8, r7)
            r7 = r6
        Lf8:
            ad.n r11 = r11.f204c
            java.util.Objects.requireNonNull(r11)
            java.lang.String r6 = "n"
            if (r7 != 0) goto L102
            goto L10a
        L102:
            ad.m r8 = new ad.m
            r8.<init>(r11, r7)
            java.util.Collections.sort(r4, r8)
        L10a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r8 = "Viewfinder size: "
            r11.append(r8)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r6, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r7 = "Preview in order of preference: "
            r11.append(r7)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r6, r11)
            java.lang.Object r11 = r4.get(r3)
            zc.r r11 = (p454zc.C7294r) r11
            r10.f188i = r11
            int r4 = r11.f27963Y
            int r11 = r11.f27964Z
            r1.setPreviewSize(r4, r11)
        L141:
            java.lang.String r11 = android.os.Build.DEVICE
            java.lang.String r4 = "glass-1"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L204
            java.util.List r11 = r1.getSupportedPreviewFpsRange()
            java.lang.String r4 = "Supported FPS ranges: "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            if (r11 == 0) goto L191
            boolean r6 = r11.isEmpty()
            if (r6 == 0) goto L15e
            goto L191
        L15e:
            r6 = 91
            java.lang.StringBuilder r6 = p367v1.C6487a.m13176a(r6)
            java.util.Iterator r7 = r11.iterator()
        L168:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L187
            java.lang.Object r8 = r7.next()
            int[] r8 = (int[]) r8
            java.lang.String r8 = java.util.Arrays.toString(r8)
            r6.append(r8)
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L168
            java.lang.String r8 = ", "
            r6.append(r8)
            goto L168
        L187:
            r7 = 93
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L193
        L191:
            java.lang.String r6 = "[]"
        L193:
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r2, r4)
            if (r11 == 0) goto L204
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L204
            java.util.Iterator r11 = r11.iterator()
        L1a9:
            boolean r4 = r11.hasNext()
            r6 = 1
            if (r4 == 0) goto L1c3
            java.lang.Object r4 = r11.next()
            int[] r4 = (int[]) r4
            r7 = r4[r3]
            r8 = r4[r6]
            r9 = 10000(0x2710, float:1.4013E-41)
            if (r7 < r9) goto L1a9
            r7 = 20000(0x4e20, float:2.8026E-41)
            if (r8 > r7) goto L1a9
            r5 = r4
        L1c3:
            if (r5 != 0) goto L1c8
            java.lang.String r11 = "No suitable FPS range?"
            goto L1e5
        L1c8:
            r11 = 2
            int[] r11 = new int[r11]
            r1.getPreviewFpsRange(r11)
            boolean r11 = java.util.Arrays.equals(r11, r5)
            if (r11 == 0) goto L1e9
            java.lang.String r11 = "FPS range already set to "
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r3 = java.util.Arrays.toString(r5)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
        L1e5:
            android.util.Log.i(r2, r11)
            goto L204
        L1e9:
            java.lang.String r11 = "Setting FPS range to "
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r4 = java.util.Arrays.toString(r5)
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r2, r11)
            r11 = r5[r3]
            r2 = r5[r6]
            r1.setPreviewFpsRange(r11, r2)
        L204:
            java.lang.String r11 = "Final camera parameters: "
            java.lang.StringBuilder r11 = android.support.v4.media.C0144c.m256a(r11)
            java.lang.String r2 = r1.flatten()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            android.util.Log.i(r0, r11)
            android.hardware.Camera r11 = r10.f180a
            r11.setParameters(r1)
            return
    }

    /* renamed from: f */
    public void m100f(boolean r4) {
            r3 = this;
            android.hardware.Camera r0 = r3.f180a
            if (r0 == 0) goto L52
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.RuntimeException -> L4a
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.getFlashMode()     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L23
            java.lang.String r2 = "on"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.RuntimeException -> L4a
            if (r2 != 0) goto L21
            java.lang.String r2 = "torch"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L23
        L21:
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r4 == r0) goto L52
            ad.a r0 = r3.f182c     // Catch: java.lang.RuntimeException -> L4a
            if (r0 == 0) goto L2d
            r0.m91c()     // Catch: java.lang.RuntimeException -> L4a
        L2d:
            android.hardware.Camera r0 = r3.f180a     // Catch: java.lang.RuntimeException -> L4a
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.RuntimeException -> L4a
            ad.C0059b.m93b(r0, r4)     // Catch: java.lang.RuntimeException -> L4a
            ad.f r4 = r3.f186g     // Catch: java.lang.RuntimeException -> L4a
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.RuntimeException -> L4a
            android.hardware.Camera r4 = r3.f180a     // Catch: java.lang.RuntimeException -> L4a
            r4.setParameters(r0)     // Catch: java.lang.RuntimeException -> L4a
            ad.a r4 = r3.f182c     // Catch: java.lang.RuntimeException -> L4a
            if (r4 == 0) goto L52
            r4.f149a = r1     // Catch: java.lang.RuntimeException -> L4a
            r4.m90b()     // Catch: java.lang.RuntimeException -> L4a
            goto L52
        L4a:
            r4 = move-exception
            java.lang.String r0 = "e"
            java.lang.String r1 = "Failed to set torch"
            android.util.Log.e(r0, r1, r4)
        L52:
            return
    }

    /* renamed from: g */
    public void m101g() {
            r3 = this;
            android.hardware.Camera r0 = r3.f180a
            if (r0 == 0) goto L27
            boolean r1 = r3.f184e
            if (r1 != 0) goto L27
            r0.startPreview()
            r0 = 1
            r3.f184e = r0
            ad.a r0 = new ad.a
            android.hardware.Camera r1 = r3.f180a
            ad.f r2 = r3.f186g
            r0.<init>(r1, r2)
            r3.f182c = r0
            xb.a r0 = new xb.a
            android.content.Context r1 = r3.f191l
            ad.f r2 = r3.f186g
            r0.<init>(r1, r3, r2)
            r3.f183d = r0
            java.util.Objects.requireNonNull(r2)
        L27:
            return
    }
}
