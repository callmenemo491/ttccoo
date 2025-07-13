package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.k */
/* loaded from: classes.dex */
public final class C0285k {

    /* renamed from: b */
    public static final android.graphics.PorterDuff.Mode f1357b = null;

    /* renamed from: c */
    public static androidx.appcompat.widget.C0285k f1358c;

    /* renamed from: a */
    public androidx.appcompat.widget.C0290m0 f1359a;

    /* renamed from: androidx.appcompat.widget.k$a */
    public class a implements androidx.appcompat.widget.C0290m0.f {

        /* renamed from: a */
        public final int[] f1360a;

        /* renamed from: b */
        public final int[] f1361b;

        /* renamed from: c */
        public final int[] f1362c;

        /* renamed from: d */
        public final int[] f1363d;

        /* renamed from: e */
        public final int[] f1364e;

        /* renamed from: f */
        public final int[] f1365f;

        public a() {
                r3 = this;
                r3.<init>()
                r0 = 3
                int[] r1 = new int[r0]
                r1 = {x0032: FILL_ARRAY_DATA , data: [2131230803, 2131230801, 2131230727} // fill-array
                r3.f1360a = r1
                r1 = 7
                int[] r2 = new int[r1]
                r2 = {x003c: FILL_ARRAY_DATA , data: [2131230751, 2131230786, 2131230758, 2131230753, 2131230754, 2131230757, 2131230756} // fill-array
                r3.f1361b = r2
                int[] r1 = new int[r1]
                r1 = {x004e: FILL_ARRAY_DATA , data: [2131230800, 2131230802, 2131230744, 2131230796, 2131230797, 2131230798, 2131230799} // fill-array
                r3.f1362c = r1
                int[] r0 = new int[r0]
                r0 = {x0060: FILL_ARRAY_DATA , data: [2131230776, 2131230742, 2131230775} // fill-array
                r3.f1363d = r0
                r0 = 2
                int[] r0 = new int[r0]
                r0 = {x006a: FILL_ARRAY_DATA , data: [2131230794, 2131230804} // fill-array
                r3.f1364e = r0
                r0 = 4
                int[] r0 = new int[r0]
                r0 = {x0072: FILL_ARRAY_DATA , data: [2131230730, 2131230736, 2131230731, 2131230737} // fill-array
                r3.f1365f = r0
                return
        }

        /* renamed from: a */
        public final boolean m748a(int[] r5, int r6) {
                r4 = this;
                int r0 = r5.length
                r1 = 0
                r2 = 0
            L3:
                if (r2 >= r0) goto Le
                r3 = r5[r2]
                if (r3 != r6) goto Lb
                r5 = 1
                return r5
            Lb:
                int r2 = r2 + 1
                goto L3
            Le:
                return r1
        }

        /* renamed from: b */
        public final android.content.res.ColorStateList m749b(android.content.Context r6, int r7) {
                r5 = this;
                r0 = 4
                int[][] r1 = new int[r0][]
                int[] r0 = new int[r0]
                r2 = 2130968822(0x7f0400f6, float:1.7546308E38)
                int r2 = androidx.appcompat.widget.C0304t0.m789c(r6, r2)
                r3 = 2130968820(0x7f0400f4, float:1.7546304E38)
                int r6 = androidx.appcompat.widget.C0304t0.m788b(r6, r3)
                int[] r3 = androidx.appcompat.widget.C0304t0.f1434b
                r4 = 0
                r1[r4] = r3
                r0[r4] = r6
                int[] r6 = androidx.appcompat.widget.C0304t0.f1436d
                r3 = 1
                r1[r3] = r6
                int r6 = p084f0.C1938a.m4821f(r2, r7)
                r0[r3] = r6
                int[] r6 = androidx.appcompat.widget.C0304t0.f1435c
                r3 = 2
                r1[r3] = r6
                int r6 = p084f0.C1938a.m4821f(r2, r7)
                r0[r3] = r6
                int[] r6 = androidx.appcompat.widget.C0304t0.f1438f
                r2 = 3
                r1[r2] = r6
                r0[r2] = r7
                android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
                r6.<init>(r1, r0)
                return r6
        }

        /* renamed from: c */
        public final android.graphics.drawable.LayerDrawable m750c(androidx.appcompat.widget.C0290m0 r5, android.content.Context r6, int r7) {
                r4 = this;
                android.content.res.Resources r0 = r6.getResources()
                int r7 = r0.getDimensionPixelSize(r7)
                r0 = 2131230790(0x7f080046, float:1.8077643E38)
                android.graphics.drawable.Drawable r0 = r5.m761f(r6, r0)
                r1 = 2131230791(0x7f080047, float:1.8077645E38)
                android.graphics.drawable.Drawable r5 = r5.m761f(r6, r1)
                boolean r6 = r0 instanceof android.graphics.drawable.BitmapDrawable
                r1 = 0
                if (r6 == 0) goto L33
                int r6 = r0.getIntrinsicWidth()
                if (r6 != r7) goto L33
                int r6 = r0.getIntrinsicHeight()
                if (r6 != r7) goto L33
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
                android.graphics.Bitmap r2 = r0.getBitmap()
                r6.<init>(r2)
                goto L4f
            L33:
                android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r7, r7, r6)
                android.graphics.Canvas r2 = new android.graphics.Canvas
                r2.<init>(r6)
                r0.setBounds(r1, r1, r7, r7)
                r0.draw(r2)
                android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
                r0.<init>(r6)
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                r2.<init>(r6)
                r6 = r2
            L4f:
                android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
                r6.setTileModeX(r2)
                boolean r2 = r5 instanceof android.graphics.drawable.BitmapDrawable
                if (r2 == 0) goto L67
                int r2 = r5.getIntrinsicWidth()
                if (r2 != r7) goto L67
                int r2 = r5.getIntrinsicHeight()
                if (r2 != r7) goto L67
                android.graphics.drawable.BitmapDrawable r5 = (android.graphics.drawable.BitmapDrawable) r5
                goto L7d
            L67:
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r7, r7, r2)
                android.graphics.Canvas r3 = new android.graphics.Canvas
                r3.<init>(r2)
                r5.setBounds(r1, r1, r7, r7)
                r5.draw(r3)
                android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
                r5.<init>(r2)
            L7d:
                android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
                r2 = 3
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
                r2[r1] = r0
                r0 = 1
                r2[r0] = r5
                r5 = 2
                r2[r5] = r6
                r7.<init>(r2)
                r6 = 16908288(0x1020000, float:2.387723E-38)
                r7.setId(r1, r6)
                r6 = 16908303(0x102000f, float:2.387727E-38)
                r7.setId(r0, r6)
                r6 = 16908301(0x102000d, float:2.3877265E-38)
                r7.setId(r5, r6)
                return r7
        }

        /* renamed from: d */
        public android.content.res.ColorStateList m751d(android.content.Context r9, int r10) {
                r8 = this;
                r0 = 2131230747(0x7f08001b, float:1.8077556E38)
                if (r10 != r0) goto Ld
                r10 = 2131099669(0x7f060015, float:1.7811698E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
            Ld:
                r0 = 2131230793(0x7f080049, float:1.8077649E38)
                if (r10 != r0) goto L1a
                r10 = 2131099672(0x7f060018, float:1.7811704E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
            L1a:
                r0 = 2131230792(0x7f080048, float:1.8077647E38)
                r1 = 0
                if (r10 != r0) goto L7e
                r10 = 3
                int[][] r0 = new int[r10][]
                int[] r10 = new int[r10]
                r2 = 2130968839(0x7f040107, float:1.7546343E38)
                android.content.res.ColorStateList r3 = androidx.appcompat.widget.C0304t0.m790d(r9, r2)
                r4 = 2
                r5 = 2130968821(0x7f0400f5, float:1.7546306E38)
                r6 = 1
                if (r3 == 0) goto L5a
                boolean r7 = r3.isStateful()
                if (r7 == 0) goto L5a
                int[] r2 = androidx.appcompat.widget.C0304t0.f1434b
                r0[r1] = r2
                r2 = r0[r1]
                int r2 = r3.getColorForState(r2, r1)
                r10[r1] = r2
                int[] r1 = androidx.appcompat.widget.C0304t0.f1437e
                r0[r6] = r1
                int r9 = androidx.appcompat.widget.C0304t0.m789c(r9, r5)
                r10[r6] = r9
                int[] r9 = androidx.appcompat.widget.C0304t0.f1438f
                r0[r4] = r9
                int r9 = r3.getDefaultColor()
                r10[r4] = r9
                goto L78
            L5a:
                int[] r3 = androidx.appcompat.widget.C0304t0.f1434b
                r0[r1] = r3
                int r3 = androidx.appcompat.widget.C0304t0.m788b(r9, r2)
                r10[r1] = r3
                int[] r1 = androidx.appcompat.widget.C0304t0.f1437e
                r0[r6] = r1
                int r1 = androidx.appcompat.widget.C0304t0.m789c(r9, r5)
                r10[r6] = r1
                int[] r1 = androidx.appcompat.widget.C0304t0.f1438f
                r0[r4] = r1
                int r9 = androidx.appcompat.widget.C0304t0.m789c(r9, r2)
                r10[r4] = r9
            L78:
                android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
                r9.<init>(r0, r10)
                return r9
            L7e:
                r0 = 2131230735(0x7f08000f, float:1.8077531E38)
                if (r10 != r0) goto L8f
                r10 = 2130968820(0x7f0400f4, float:1.7546304E38)
                int r10 = androidx.appcompat.widget.C0304t0.m789c(r9, r10)
                android.content.res.ColorStateList r9 = r8.m749b(r9, r10)
                return r9
            L8f:
                r0 = 2131230729(0x7f080009, float:1.807752E38)
                if (r10 != r0) goto L99
                android.content.res.ColorStateList r9 = r8.m749b(r9, r1)
                return r9
            L99:
                r0 = 2131230734(0x7f08000e, float:1.807753E38)
                if (r10 != r0) goto Laa
                r10 = 2130968818(0x7f0400f2, float:1.75463E38)
                int r10 = androidx.appcompat.widget.C0304t0.m789c(r9, r10)
                android.content.res.ColorStateList r9 = r8.m749b(r9, r10)
                return r9
            Laa:
                r0 = 2131230788(0x7f080044, float:1.8077639E38)
                if (r10 == r0) goto Lf4
                r0 = 2131230789(0x7f080045, float:1.807764E38)
                if (r10 != r0) goto Lb5
                goto Lf4
            Lb5:
                int[] r0 = r8.f1361b
                boolean r0 = r8.m748a(r0, r10)
                if (r0 == 0) goto Lc5
                r10 = 2130968823(0x7f0400f7, float:1.754631E38)
                android.content.res.ColorStateList r9 = androidx.appcompat.widget.C0304t0.m790d(r9, r10)
                return r9
            Lc5:
                int[] r0 = r8.f1364e
                boolean r0 = r8.m748a(r0, r10)
                if (r0 == 0) goto Ld5
                r10 = 2131099668(0x7f060014, float:1.7811696E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
            Ld5:
                int[] r0 = r8.f1365f
                boolean r0 = r8.m748a(r0, r10)
                if (r0 == 0) goto Le5
                r10 = 2131099667(0x7f060013, float:1.7811694E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
            Le5:
                r0 = 2131230785(0x7f080041, float:1.8077633E38)
                if (r10 != r0) goto Lf2
                r10 = 2131099670(0x7f060016, float:1.78117E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
            Lf2:
                r9 = 0
                return r9
            Lf4:
                r10 = 2131099671(0x7f060017, float:1.7811702E38)
                android.content.res.ColorStateList r9 = p102g.C2199a.m5783a(r9, r10)
                return r9
        }

        /* renamed from: e */
        public final void m752e(android.graphics.drawable.Drawable r2, int r3, android.graphics.PorterDuff.Mode r4) {
                r1 = this;
                boolean r0 = androidx.appcompat.widget.C0271e0.m707a(r2)
                if (r0 == 0) goto La
                android.graphics.drawable.Drawable r2 = r2.mutate()
            La:
                if (r4 != 0) goto Le
                android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.C0285k.f1357b
            Le:
                android.graphics.PorterDuffColorFilter r3 = androidx.appcompat.widget.C0285k.m743c(r3, r4)
                r2.setColorFilter(r3)
                return
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.appcompat.widget.C0285k.f1357b = r0
            return
    }

    public C0285k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static synchronized androidx.appcompat.widget.C0285k m742a() {
            java.lang.Class<androidx.appcompat.widget.k> r0 = androidx.appcompat.widget.C0285k.class
            monitor-enter(r0)
            androidx.appcompat.widget.k r1 = androidx.appcompat.widget.C0285k.f1358c     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto La
            m744e()     // Catch: java.lang.Throwable -> Le
        La:
            androidx.appcompat.widget.k r1 = androidx.appcompat.widget.C0285k.f1358c     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: c */
    public static synchronized android.graphics.PorterDuffColorFilter m743c(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<androidx.appcompat.widget.k> r0 = androidx.appcompat.widget.C0285k.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.C0290m0.m755h(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: e */
    public static synchronized void m744e() {
            java.lang.Class<androidx.appcompat.widget.k> r0 = androidx.appcompat.widget.C0285k.class
            monitor-enter(r0)
            androidx.appcompat.widget.k r1 = androidx.appcompat.widget.C0285k.f1358c     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L25
            androidx.appcompat.widget.k r1 = new androidx.appcompat.widget.k     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.widget.C0285k.f1358c = r1     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.widget.m0 r2 = androidx.appcompat.widget.C0290m0.m754d()     // Catch: java.lang.Throwable -> L27
            r1.f1359a = r2     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.widget.k r1 = androidx.appcompat.widget.C0285k.f1358c     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.widget.m0 r1 = r1.f1359a     // Catch: java.lang.Throwable -> L27
            androidx.appcompat.widget.k$a r2 = new androidx.appcompat.widget.k$a     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L27
            r1.f1387g = r2     // Catch: java.lang.Throwable -> L22
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            goto L25
        L22:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r0)
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* renamed from: f */
    public static void m745f(android.graphics.drawable.Drawable r3, androidx.appcompat.widget.C0310w0 r4, int[] r5) {
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0290m0.f1378h
            boolean r0 = androidx.appcompat.widget.C0271e0.m707a(r3)
            if (r0 == 0) goto L16
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 == r3) goto L16
            java.lang.String r3 = "ResourceManagerInternal"
            java.lang.String r4 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r3, r4)
            goto L4d
        L16:
            boolean r0 = r4.f1478d
            if (r0 != 0) goto L23
            boolean r1 = r4.f1477c
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r3.clearColorFilter()
            goto L44
        L23:
            r1 = 0
            if (r0 == 0) goto L29
            android.content.res.ColorStateList r0 = r4.f1475a
            goto L2a
        L29:
            r0 = r1
        L2a:
            boolean r2 = r4.f1477c
            if (r2 == 0) goto L31
            android.graphics.PorterDuff$Mode r4 = r4.f1476b
            goto L33
        L31:
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.C0290m0.f1378h
        L33:
            if (r0 == 0) goto L41
            if (r4 != 0) goto L38
            goto L41
        L38:
            r1 = 0
            int r5 = r0.getColorForState(r5, r1)
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.C0290m0.m755h(r5, r4)
        L41:
            r3.setColorFilter(r1)
        L44:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 > r5) goto L4d
            r3.invalidateSelf()
        L4d:
            return
    }

    /* renamed from: b */
    public synchronized android.graphics.drawable.Drawable m746b(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.m0 r0 = r1.f1359a     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.m761f(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* renamed from: d */
    public synchronized android.content.res.ColorStateList m747d(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            androidx.appcompat.widget.m0 r0 = r1.f1359a     // Catch: java.lang.Throwable -> L9
            android.content.res.ColorStateList r2 = r0.m763i(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
