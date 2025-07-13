package p116h;

/* renamed from: h.c */
/* loaded from: classes.dex */
public class C2432c extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: k0 */
    public static final /* synthetic */ int f10815k0 = 0;

    /* renamed from: Y */
    public p116h.C2432c.c f10816Y;

    /* renamed from: Z */
    public android.graphics.Rect f10817Z;

    /* renamed from: a0 */
    public android.graphics.drawable.Drawable f10818a0;

    /* renamed from: b0 */
    public android.graphics.drawable.Drawable f10819b0;

    /* renamed from: c0 */
    public int f10820c0;

    /* renamed from: d0 */
    public boolean f10821d0;

    /* renamed from: e0 */
    public int f10822e0;

    /* renamed from: f0 */
    public boolean f10823f0;

    /* renamed from: g0 */
    public java.lang.Runnable f10824g0;

    /* renamed from: h0 */
    public long f10825h0;

    /* renamed from: i0 */
    public long f10826i0;

    /* renamed from: j0 */
    public p116h.C2432c.b f10827j0;

    /* renamed from: h.c$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p116h.C2432c f10828Y;

        public a(p116h.C2432c r1) {
                r0 = this;
                r0.f10828Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                h.c r0 = r2.f10828Y
                r1 = 1
                r0.m6167a(r1)
                h.c r0 = r2.f10828Y
                r0.invalidateSelf()
                return
        }
    }

    /* renamed from: h.c$b */
    public static class b implements android.graphics.drawable.Drawable.Callback {

        /* renamed from: Y */
        public android.graphics.drawable.Drawable.Callback f10829Y;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f10829Y
                if (r0 == 0) goto L7
                r0.scheduleDrawable(r2, r3, r4)
            L7:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f10829Y
                if (r0 == 0) goto L7
                r0.unscheduleDrawable(r2, r3)
            L7:
                return
        }
    }

    /* renamed from: h.c$c */
    public static abstract class c extends android.graphics.drawable.Drawable.ConstantState {

        /* renamed from: A */
        public int f10830A;

        /* renamed from: B */
        public int f10831B;

        /* renamed from: C */
        public boolean f10832C;

        /* renamed from: D */
        public android.graphics.ColorFilter f10833D;

        /* renamed from: E */
        public boolean f10834E;

        /* renamed from: F */
        public android.content.res.ColorStateList f10835F;

        /* renamed from: G */
        public android.graphics.PorterDuff.Mode f10836G;

        /* renamed from: H */
        public boolean f10837H;

        /* renamed from: I */
        public boolean f10838I;

        /* renamed from: a */
        public final p116h.C2432c f10839a;

        /* renamed from: b */
        public android.content.res.Resources f10840b;

        /* renamed from: c */
        public int f10841c;

        /* renamed from: d */
        public int f10842d;

        /* renamed from: e */
        public int f10843e;

        /* renamed from: f */
        public android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> f10844f;

        /* renamed from: g */
        public android.graphics.drawable.Drawable[] f10845g;

        /* renamed from: h */
        public int f10846h;

        /* renamed from: i */
        public boolean f10847i;

        /* renamed from: j */
        public boolean f10848j;

        /* renamed from: k */
        public android.graphics.Rect f10849k;

        /* renamed from: l */
        public boolean f10850l;

        /* renamed from: m */
        public boolean f10851m;

        /* renamed from: n */
        public int f10852n;

        /* renamed from: o */
        public int f10853o;

        /* renamed from: p */
        public int f10854p;

        /* renamed from: q */
        public int f10855q;

        /* renamed from: r */
        public boolean f10856r;

        /* renamed from: s */
        public int f10857s;

        /* renamed from: t */
        public boolean f10858t;

        /* renamed from: u */
        public boolean f10859u;

        /* renamed from: v */
        public boolean f10860v;

        /* renamed from: w */
        public boolean f10861w;

        /* renamed from: x */
        public boolean f10862x;

        /* renamed from: y */
        public boolean f10863y;

        /* renamed from: z */
        public int f10864z;

        public c(p116h.C2432c.c r5, p116h.C2432c r6, android.content.res.Resources r7) {
                r4 = this;
                r4.<init>()
                r0 = 0
                r4.f10847i = r0
                r4.f10850l = r0
                r1 = 1
                r4.f10862x = r1
                r4.f10830A = r0
                r4.f10831B = r0
                r4.f10839a = r6
                r6 = 0
                if (r7 == 0) goto L16
                r2 = r7
                goto L1c
            L16:
                if (r5 == 0) goto L1b
                android.content.res.Resources r2 = r5.f10840b
                goto L1c
            L1b:
                r2 = r6
            L1c:
                r4.f10840b = r2
                if (r5 == 0) goto L23
                int r2 = r5.f10841c
                goto L24
            L23:
                r2 = 0
            L24:
                int r3 = p116h.C2432c.f10815k0
                if (r7 != 0) goto L29
                goto L2f
            L29:
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r2 = r7.densityDpi
            L2f:
                if (r2 != 0) goto L33
                r2 = 160(0xa0, float:2.24E-43)
            L33:
                r4.f10841c = r2
                if (r5 == 0) goto Lf8
                int r7 = r5.f10842d
                r4.f10842d = r7
                int r7 = r5.f10843e
                r4.f10843e = r7
                r4.f10860v = r1
                r4.f10861w = r1
                boolean r7 = r5.f10847i
                r4.f10847i = r7
                boolean r7 = r5.f10850l
                r4.f10850l = r7
                boolean r7 = r5.f10862x
                r4.f10862x = r7
                boolean r7 = r5.f10863y
                r4.f10863y = r7
                int r7 = r5.f10864z
                r4.f10864z = r7
                int r7 = r5.f10830A
                r4.f10830A = r7
                int r7 = r5.f10831B
                r4.f10831B = r7
                boolean r7 = r5.f10832C
                r4.f10832C = r7
                android.graphics.ColorFilter r7 = r5.f10833D
                r4.f10833D = r7
                boolean r7 = r5.f10834E
                r4.f10834E = r7
                android.content.res.ColorStateList r7 = r5.f10835F
                r4.f10835F = r7
                android.graphics.PorterDuff$Mode r7 = r5.f10836G
                r4.f10836G = r7
                boolean r7 = r5.f10837H
                r4.f10837H = r7
                boolean r7 = r5.f10838I
                r4.f10838I = r7
                int r7 = r5.f10841c
                if (r7 != r2) goto La8
                boolean r7 = r5.f10848j
                if (r7 == 0) goto L92
                android.graphics.Rect r7 = r5.f10849k
                if (r7 == 0) goto L8e
                android.graphics.Rect r6 = new android.graphics.Rect
                android.graphics.Rect r7 = r5.f10849k
                r6.<init>(r7)
            L8e:
                r4.f10849k = r6
                r4.f10848j = r1
            L92:
                boolean r6 = r5.f10851m
                if (r6 == 0) goto La8
                int r6 = r5.f10852n
                r4.f10852n = r6
                int r6 = r5.f10853o
                r4.f10853o = r6
                int r6 = r5.f10854p
                r4.f10854p = r6
                int r6 = r5.f10855q
                r4.f10855q = r6
                r4.f10851m = r1
            La8:
                boolean r6 = r5.f10856r
                if (r6 == 0) goto Lb2
                int r6 = r5.f10857s
                r4.f10857s = r6
                r4.f10856r = r1
            Lb2:
                boolean r6 = r5.f10858t
                if (r6 == 0) goto Lbc
                boolean r6 = r5.f10859u
                r4.f10859u = r6
                r4.f10858t = r1
            Lbc:
                android.graphics.drawable.Drawable[] r6 = r5.f10845g
                int r7 = r6.length
                android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
                r4.f10845g = r7
                int r7 = r5.f10846h
                r4.f10846h = r7
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r5.f10844f
                if (r5 == 0) goto Ld0
                android.util.SparseArray r5 = r5.clone()
                goto Ld7
            Ld0:
                android.util.SparseArray r5 = new android.util.SparseArray
                int r7 = r4.f10846h
                r5.<init>(r7)
            Ld7:
                r4.f10844f = r5
                int r5 = r4.f10846h
            Ldb:
                if (r0 >= r5) goto L100
                r7 = r6[r0]
                if (r7 == 0) goto Lf5
                r7 = r6[r0]
                android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
                if (r7 == 0) goto Lef
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r4.f10844f
                r1.put(r0, r7)
                goto Lf5
            Lef:
                android.graphics.drawable.Drawable[] r7 = r4.f10845g
                r1 = r6[r0]
                r7[r0] = r1
            Lf5:
                int r0 = r0 + 1
                goto Ldb
            Lf8:
                r5 = 10
                android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
                r4.f10845g = r5
                r4.f10846h = r0
            L100:
                return
        }

        /* renamed from: a */
        public final int m6170a(android.graphics.drawable.Drawable r7) {
                r6 = this;
                int r0 = r6.f10846h
                android.graphics.drawable.Drawable[] r1 = r6.f10845g
                int r1 = r1.length
                r2 = 0
                if (r0 < r1) goto L21
                int r1 = r0 + 10
                r3 = r6
                h.e$a r3 = (p116h.C2434e.a) r3
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r1]
                android.graphics.drawable.Drawable[] r5 = r3.f10845g
                if (r5 == 0) goto L16
                java.lang.System.arraycopy(r5, r2, r4, r2, r0)
            L16:
                r3.f10845g = r4
                int[][] r1 = new int[r1][]
                int[][] r4 = r3.f10868J
                java.lang.System.arraycopy(r4, r2, r1, r2, r0)
                r3.f10868J = r1
            L21:
                r7.mutate()
                r1 = 1
                r7.setVisible(r2, r1)
                h.c r3 = r6.f10839a
                r7.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r6.f10845g
                r3[r0] = r7
                int r3 = r6.f10846h
                int r3 = r3 + r1
                r6.f10846h = r3
                int r1 = r6.f10843e
                int r7 = r7.getChangingConfigurations()
                r7 = r7 | r1
                r6.f10843e = r7
                r6.f10856r = r2
                r6.f10858t = r2
                r7 = 0
                r6.f10849k = r7
                r6.f10848j = r2
                r6.f10851m = r2
                r6.f10860v = r2
                return r0
        }

        /* renamed from: b */
        public void m6171b() {
                r6 = this;
                r0 = 1
                r6.f10851m = r0
                r6.m6172c()
                int r0 = r6.f10846h
                android.graphics.drawable.Drawable[] r1 = r6.f10845g
                r2 = -1
                r6.f10853o = r2
                r6.f10852n = r2
                r2 = 0
                r6.f10855q = r2
                r6.f10854p = r2
            L14:
                if (r2 >= r0) goto L43
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.f10852n
                if (r4 <= r5) goto L22
                r6.f10852n = r4
            L22:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.f10853o
                if (r4 <= r5) goto L2c
                r6.f10853o = r4
            L2c:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.f10854p
                if (r4 <= r5) goto L36
                r6.f10854p = r4
            L36:
                int r3 = r3.getMinimumHeight()
                int r4 = r6.f10855q
                if (r3 <= r4) goto L40
                r6.f10855q = r3
            L40:
                int r2 = r2 + 1
                goto L14
            L43:
                return
        }

        /* renamed from: c */
        public final void m6172c() {
                r7 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r7.f10844f
                if (r0 == 0) goto L3d
                int r0 = r0.size()
                r1 = 0
            L9:
                if (r1 >= r0) goto L3a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r7.f10844f
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r7.f10844f
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r7.f10845g
                android.content.res.Resources r5 = r7.f10840b
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r5)
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 23
                if (r5 < r6) goto L2c
                int r5 = r7.f10864z
                p103g0.C2200a.m5787c(r3, r5)
            L2c:
                android.graphics.drawable.Drawable r3 = r3.mutate()
                h.c r5 = r7.f10839a
                r3.setCallback(r5)
                r4[r2] = r3
                int r1 = r1 + 1
                goto L9
            L3a:
                r0 = 0
                r7.f10844f = r0
            L3d:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r6 = this;
                int r0 = r6.f10846h
                android.graphics.drawable.Drawable[] r1 = r6.f10845g
                r2 = 0
                r3 = 0
            L6:
                if (r3 >= r0) goto L28
                r4 = r1[r3]
                r5 = 1
                if (r4 == 0) goto L14
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L25
                return r5
            L14:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r6.f10844f
                java.lang.Object r4 = r4.get(r3)
                android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
                if (r4 == 0) goto L25
                boolean r4 = r4.canApplyTheme()
                if (r4 == 0) goto L25
                return r5
            L25:
                int r3 = r3 + 1
                goto L6
            L28:
                return r2
        }

        /* renamed from: d */
        public final android.graphics.drawable.Drawable m6173d(int r6) {
                r5 = this;
                android.graphics.drawable.Drawable[] r0 = r5.f10845g
                r0 = r0[r6]
                if (r0 == 0) goto L7
                return r0
            L7:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r5.f10844f
                r1 = 0
                if (r0 == 0) goto L48
                int r0 = r0.indexOfKey(r6)
                if (r0 < 0) goto L48
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r5.f10844f
                java.lang.Object r2 = r2.valueAt(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                android.content.res.Resources r3 = r5.f10840b
                android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 23
                if (r3 < r4) goto L2b
                int r3 = r5.f10864z
                p103g0.C2200a.m5787c(r2, r3)
            L2b:
                android.graphics.drawable.Drawable r2 = r2.mutate()
                h.c r3 = r5.f10839a
                r2.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r5.f10845g
                r3[r6] = r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r6 = r5.f10844f
                r6.removeAt(r0)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r6 = r5.f10844f
                int r6 = r6.size()
                if (r6 != 0) goto L47
                r5.f10844f = r1
            L47:
                return r2
            L48:
                return r1
        }

        /* renamed from: e */
        public abstract void mo6163e();

        /* renamed from: f */
        public final void m6174f(android.content.res.Resources r2) {
                r1 = this;
                if (r2 == 0) goto L1b
                r1.f10840b = r2
                int r0 = p116h.C2432c.f10815k0
                android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
                int r2 = r2.densityDpi
                if (r2 != 0) goto L10
                r2 = 160(0xa0, float:2.24E-43)
            L10:
                int r0 = r1.f10841c
                r1.f10841c = r2
                if (r0 == r2) goto L1b
                r2 = 0
                r1.f10851m = r2
                r1.f10848j = r2
            L1b:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.f10842d
                int r1 = r2.f10843e
                r0 = r0 | r1
                return r0
        }
    }

    public C2432c() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.f10820c0 = r0
            r0 = -1
            r1.f10822e0 = r0
            return
    }

    /* renamed from: a */
    public void m6167a(boolean r14) {
            r13 = this;
            r0 = 1
            r13.f10821d0 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f10818a0
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f10825h0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f10820c0
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.c$c r9 = r13.f10816Y
            int r9 = r9.f10830A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f10820c0
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f10825h0 = r7
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f10819b0
            if (r9 == 0) goto L61
            long r10 = r13.f10826i0
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f10819b0 = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.c$c r4 = r13.f10816Y
            int r4 = r4.f10831B
            int r3 = r3 / r4
            int r4 = r13.f10820c0
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f10826i0 = r7
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f10824g0
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r7) {
            r6 = this;
            h.c$c r0 = r6.f10816Y
            java.util.Objects.requireNonNull(r0)
            if (r7 == 0) goto L37
            r0.m6172c()
            int r1 = r0.f10846h
            android.graphics.drawable.Drawable[] r2 = r0.f10845g
            r3 = 0
        Lf:
            if (r3 >= r1) goto L30
            r4 = r2[r3]
            if (r4 == 0) goto L2d
            r4 = r2[r3]
            boolean r4 = r4.canApplyTheme()
            if (r4 == 0) goto L2d
            r4 = r2[r3]
            r4.applyTheme(r7)
            int r4 = r0.f10843e
            r5 = r2[r3]
            int r5 = r5.getChangingConfigurations()
            r4 = r4 | r5
            r0.f10843e = r4
        L2d:
            int r3 = r3 + 1
            goto Lf
        L30:
            android.content.res.Resources r7 = r7.getResources()
            r0.m6174f(r7)
        L37:
            return
    }

    /* renamed from: b */
    public p116h.C2432c.c mo6157b() {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* renamed from: c */
    public final void m6168c(android.graphics.drawable.Drawable r6) {
            r5 = this;
            h.c$b r0 = r5.f10827j0
            if (r0 != 0) goto Lb
            h.c$b r0 = new h.c$b
            r0.<init>()
            r5.f10827j0 = r0
        Lb:
            h.c$b r0 = r5.f10827j0
            android.graphics.drawable.Drawable$Callback r1 = r6.getCallback()
            r0.f10829Y = r1
            r6.setCallback(r0)
            r0 = 0
            h.c$c r1 = r5.f10816Y     // Catch: java.lang.Throwable -> L97
            int r1 = r1.f10830A     // Catch: java.lang.Throwable -> L97
            if (r1 > 0) goto L26
            boolean r1 = r5.f10821d0     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L26
            int r1 = r5.f10820c0     // Catch: java.lang.Throwable -> L97
            r6.setAlpha(r1)     // Catch: java.lang.Throwable -> L97
        L26:
            h.c$c r1 = r5.f10816Y     // Catch: java.lang.Throwable -> L97
            boolean r2 = r1.f10834E     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L32
            android.graphics.ColorFilter r1 = r1.f10833D     // Catch: java.lang.Throwable -> L97
            r6.setColorFilter(r1)     // Catch: java.lang.Throwable -> L97
            goto L46
        L32:
            boolean r2 = r1.f10837H     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L3b
            android.content.res.ColorStateList r1 = r1.f10835F     // Catch: java.lang.Throwable -> L97
            r6.setTintList(r1)     // Catch: java.lang.Throwable -> L97
        L3b:
            h.c$c r1 = r5.f10816Y     // Catch: java.lang.Throwable -> L97
            boolean r2 = r1.f10838I     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L46
            android.graphics.PorterDuff$Mode r1 = r1.f10836G     // Catch: java.lang.Throwable -> L97
            r6.setTintMode(r1)     // Catch: java.lang.Throwable -> L97
        L46:
            boolean r1 = r5.isVisible()     // Catch: java.lang.Throwable -> L97
            r2 = 1
            r6.setVisible(r1, r2)     // Catch: java.lang.Throwable -> L97
            h.c$c r1 = r5.f10816Y     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.f10862x     // Catch: java.lang.Throwable -> L97
            r6.setDither(r1)     // Catch: java.lang.Throwable -> L97
            int[] r1 = r5.getState()     // Catch: java.lang.Throwable -> L97
            r6.setState(r1)     // Catch: java.lang.Throwable -> L97
            int r1 = r5.getLevel()     // Catch: java.lang.Throwable -> L97
            r6.setLevel(r1)     // Catch: java.lang.Throwable -> L97
            android.graphics.Rect r1 = r5.getBounds()     // Catch: java.lang.Throwable -> L97
            r6.setBounds(r1)     // Catch: java.lang.Throwable -> L97
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L97
            r2 = 23
            if (r1 < r2) goto L77
            int r1 = p103g0.C2200a.m5786b(r5)     // Catch: java.lang.Throwable -> L97
            p103g0.C2200a.m5787c(r6, r1)     // Catch: java.lang.Throwable -> L97
        L77:
            h.c$c r1 = r5.f10816Y     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.f10832C     // Catch: java.lang.Throwable -> L97
            r6.setAutoMirrored(r1)     // Catch: java.lang.Throwable -> L97
            android.graphics.Rect r1 = r5.f10817Z     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L8d
            int r2 = r1.left     // Catch: java.lang.Throwable -> L97
            int r3 = r1.top     // Catch: java.lang.Throwable -> L97
            int r4 = r1.right     // Catch: java.lang.Throwable -> L97
            int r1 = r1.bottom     // Catch: java.lang.Throwable -> L97
            r6.setHotspotBounds(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L97
        L8d:
            h.c$b r1 = r5.f10827j0
            android.graphics.drawable.Drawable$Callback r2 = r1.f10829Y
            r1.f10829Y = r0
            r6.setCallback(r2)
            return
        L97:
            r1 = move-exception
            h.c$b r2 = r5.f10827j0
            android.graphics.drawable.Drawable$Callback r3 = r2.f10829Y
            r2.f10829Y = r0
            r6.setCallback(r3)
            throw r1
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            h.c$c r0 = r1.f10816Y
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    /* renamed from: d */
    public boolean m6169d(int r10) {
            r9 = this;
            int r0 = r9.f10822e0
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.c$c r0 = r9.f10816Y
            int r0 = r0.f10831B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f10819b0
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f10818a0
            if (r0 == 0) goto L29
            r9.f10819b0 = r0
            h.c$c r0 = r9.f10816Y
            int r0 = r0.f10831B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f10826i0 = r0
            goto L35
        L29:
            r9.f10819b0 = r4
            r9.f10826i0 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f10818a0
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.c$c r0 = r9.f10816Y
            int r1 = r0.f10846h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m6173d(r10)
            r9.f10818a0 = r0
            r9.f10822e0 = r10
            if (r0 == 0) goto L5a
            h.c$c r10 = r9.f10816Y
            int r10 = r10.f10830A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f10825h0 = r2
        L51:
            r9.m6168c(r0)
            goto L5a
        L55:
            r9.f10818a0 = r4
            r10 = -1
            r9.f10822e0 = r10
        L5a:
            long r0 = r9.f10825h0
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f10826i0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f10824g0
            if (r0 != 0) goto L73
            h.c$a r0 = new h.c$a
            r0.<init>(r9)
            r9.f10824g0 = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m6167a(r10)
        L79:
            r9.invalidateSelf()
            return r10
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L7
            r0.draw(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.f10819b0
            if (r0 == 0) goto Le
            r0.draw(r2)
        Le:
            return
    }

    /* renamed from: e */
    public void mo6158e(p116h.C2432c.c r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.f10820c0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            h.c$c r1 = r2.f10816Y
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r7 = this;
            h.c$c r0 = r7.f10816Y
            boolean r1 = r0.f10860v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lb
            boolean r2 = r0.f10861w
            goto L28
        Lb:
            r0.m6172c()
            r0.f10860v = r3
            int r1 = r0.f10846h
            android.graphics.drawable.Drawable[] r4 = r0.f10845g
            r5 = 0
        L15:
            if (r5 >= r1) goto L25
            r6 = r4[r5]
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()
            if (r6 != 0) goto L22
            r0.f10861w = r2
            goto L28
        L22:
            int r5 = r5 + 1
            goto L15
        L25:
            r0.f10861w = r3
            r2 = 1
        L28:
            if (r2 == 0) goto L35
            h.c$c r0 = r7.f10816Y
            int r1 = r7.getChangingConfigurations()
            r0.f10842d = r1
            h.c$c r0 = r7.f10816Y
            return r0
        L35:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f10817Z
            if (r0 == 0) goto L8
            r2.set(r0)
            goto Lb
        L8:
            super.getHotspotBounds(r2)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10850l
            if (r1 == 0) goto L10
            boolean r1 = r0.f10851m
            if (r1 != 0) goto Ld
            r0.m6171b()
        Ld:
            int r0 = r0.f10853o
            return r0
        L10:
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto L19
            int r0 = r0.getIntrinsicHeight()
            goto L1a
        L19:
            r0 = -1
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10850l
            if (r1 == 0) goto L10
            boolean r1 = r0.f10851m
            if (r1 != 0) goto Ld
            r0.m6171b()
        Ld:
            int r0 = r0.f10852n
            return r0
        L10:
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto L19
            int r0 = r0.getIntrinsicWidth()
            goto L1a
        L19:
            r0 = -1
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10850l
            if (r1 == 0) goto L10
            boolean r1 = r0.f10851m
            if (r1 != 0) goto Ld
            r0.m6171b()
        Ld:
            int r0 = r0.f10855q
            return r0
        L10:
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto L19
            int r0 = r0.getMinimumHeight()
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10850l
            if (r1 == 0) goto L10
            boolean r1 = r0.f10851m
            if (r1 != 0) goto Ld
            r0.m6171b()
        Ld:
            int r0 = r0.f10854p
            return r0
        L10:
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto L19
            int r0 = r0.getMinimumWidth()
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f10818a0
            r1 = -2
            if (r0 == 0) goto L3b
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto Lc
            goto L3b
        Lc:
            h.c$c r0 = r7.f10816Y
            boolean r2 = r0.f10856r
            if (r2 == 0) goto L16
            int r0 = r0.f10857s
            r1 = r0
            goto L3b
        L16:
            r0.m6172c()
            int r2 = r0.f10846h
            android.graphics.drawable.Drawable[] r3 = r0.f10845g
            if (r2 <= 0) goto L26
            r1 = 0
            r1 = r3[r1]
            int r1 = r1.getOpacity()
        L26:
            r4 = 1
            r5 = 1
        L28:
            if (r5 >= r2) goto L37
            r6 = r3[r5]
            int r6 = r6.getOpacity()
            int r1 = android.graphics.drawable.Drawable.resolveOpacity(r1, r6)
            int r5 = r5 + 1
            goto L28
        L37:
            r0.f10857s = r1
            r0.f10856r = r4
        L3b:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L7
            r0.getOutline(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r11) {
            r10 = this;
            h.c$c r0 = r10.f10816Y
            boolean r1 = r0.f10847i
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto La
            goto L5a
        La:
            android.graphics.Rect r1 = r0.f10849k
            if (r1 != 0) goto L59
            boolean r5 = r0.f10848j
            if (r5 == 0) goto L13
            goto L59
        L13:
            r0.m6172c()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            int r5 = r0.f10846h
            android.graphics.drawable.Drawable[] r6 = r0.f10845g
            r7 = 0
        L20:
            if (r7 >= r5) goto L54
            r8 = r6[r7]
            boolean r8 = r8.getPadding(r1)
            if (r8 == 0) goto L51
            if (r2 != 0) goto L31
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r4, r4, r4, r4)
        L31:
            int r8 = r1.left
            int r9 = r2.left
            if (r8 <= r9) goto L39
            r2.left = r8
        L39:
            int r8 = r1.top
            int r9 = r2.top
            if (r8 <= r9) goto L41
            r2.top = r8
        L41:
            int r8 = r1.right
            int r9 = r2.right
            if (r8 <= r9) goto L49
            r2.right = r8
        L49:
            int r8 = r1.bottom
            int r9 = r2.bottom
            if (r8 <= r9) goto L51
            r2.bottom = r8
        L51:
            int r7 = r7 + 1
            goto L20
        L54:
            r0.f10848j = r3
            r0.f10849k = r2
            goto L5a
        L59:
            r2 = r1
        L5a:
            if (r2 == 0) goto L70
            r11.set(r2)
            int r0 = r2.left
            int r1 = r2.top
            r0 = r0 | r1
            int r1 = r2.bottom
            r0 = r0 | r1
            int r1 = r2.right
            r0 = r0 | r1
            if (r0 == 0) goto L6e
            r0 = 1
            goto L7d
        L6e:
            r0 = 0
            goto L7d
        L70:
            android.graphics.drawable.Drawable r0 = r10.f10818a0
            if (r0 == 0) goto L79
            boolean r0 = r0.getPadding(r11)
            goto L7d
        L79:
            boolean r0 = super.getPadding(r11)
        L7d:
            h.c$c r1 = r10.f10816Y
            boolean r1 = r1.f10832C
            if (r1 == 0) goto L8a
            int r1 = p103g0.C2200a.m5786b(r10)
            if (r1 != r3) goto L8a
            goto L8b
        L8a:
            r3 = 0
        L8b:
            if (r3 == 0) goto L95
            int r1 = r11.left
            int r2 = r11.right
            r11.left = r2
            r11.right = r1
        L95:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            if (r0 == 0) goto L9
            r1 = 0
            r0.f10856r = r1
            r0.f10858t = r1
        L9:
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r3 != r0) goto L1a
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            if (r3 == 0) goto L1a
            android.graphics.drawable.Drawable$Callback r3 = r2.getCallback()
            r3.invalidateDrawable(r2)
        L1a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            h.c$c r0 = r1.f10816Y
            boolean r0 = r0.f10832C
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f10819b0
            r1 = 1
            if (r0 == 0) goto Ld
            r0.jumpToCurrentState()
            r0 = 0
            r7.f10819b0 = r0
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.drawable.Drawable r2 = r7.f10818a0
            if (r2 == 0) goto L20
            r2.jumpToCurrentState()
            boolean r2 = r7.f10821d0
            if (r2 == 0) goto L20
            android.graphics.drawable.Drawable r2 = r7.f10818a0
            int r3 = r7.f10820c0
            r2.setAlpha(r3)
        L20:
            long r2 = r7.f10826i0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2b
            r7.f10826i0 = r4
            r0 = 1
        L2b:
            long r2 = r7.f10825h0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            r7.f10825h0 = r4
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3a
            r7.invalidateSelf()
        L3a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f10823f0
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L17
            h.c$c r0 = r1.mo6157b()
            r0.mo6163e()
            r1.mo6158e(r0)
            r0 = 1
            r1.f10823f0 = r0
        L17:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10819b0
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto Le
            r0.setBounds(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r10) {
            r9 = this;
            h.c$c r0 = r9.f10816Y
            int r1 = r9.f10822e0
            int r2 = r0.f10846h
            android.graphics.drawable.Drawable[] r3 = r0.f10845g
            r4 = 0
            r5 = 0
            r6 = 0
        Lb:
            if (r5 >= r2) goto L25
            r7 = r3[r5]
            if (r7 == 0) goto L22
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r7 < r8) goto L1e
            r7 = r3[r5]
            boolean r7 = p103g0.C2200a.m5787c(r7, r10)
            goto L1f
        L1e:
            r7 = 0
        L1f:
            if (r5 != r1) goto L22
            r6 = r7
        L22:
            int r5 = r5 + 1
            goto Lb
        L25:
            r0.f10864z = r10
            return r6
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10819b0
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L12
            boolean r2 = r0.setLevel(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10819b0
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L12
            boolean r2 = r0.setState(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.scheduleDrawable(r1, r3, r4)
        L11:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r7) {
            r6 = this;
            boolean r0 = r6.f10821d0
            if (r0 == 0) goto L8
            int r0 = r6.f10820c0
            if (r0 == r7) goto L21
        L8:
            r0 = 1
            r6.f10821d0 = r0
            r6.f10820c0 = r7
            android.graphics.drawable.Drawable r0 = r6.f10818a0
            if (r0 == 0) goto L21
            long r1 = r6.f10825h0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L1d
            r0.setAlpha(r7)
            goto L21
        L1d:
            r7 = 0
            r6.m6167a(r7)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10832C
            if (r1 == r3) goto Lf
            r0.f10832C = r3
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto Lf
            r0.setAutoMirrored(r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            r1 = 1
            r0.f10834E = r1
            android.graphics.ColorFilter r1 = r0.f10833D
            if (r1 == r3) goto L12
            r0.f10833D = r3
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto L12
            r0.setColorFilter(r3)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            boolean r1 = r0.f10862x
            if (r1 == r3) goto Lf
            r0.f10862x = r3
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            if (r0 == 0) goto Lf
            r0.setDither(r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L7
            r0.setHotspot(r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.f10817Z
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.f10817Z = r0
            goto Lf
        Lc:
            r0.set(r2, r3, r4, r5)
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r0 == 0) goto L16
            r0.setHotspotBounds(r2, r3, r4, r5)
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            r1 = 1
            r0.f10837H = r1
            android.content.res.ColorStateList r1 = r0.f10835F
            if (r1 == r3) goto L10
            r0.f10835F = r3
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            p103g0.C2200a.m5789e(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            h.c$c r0 = r2.f10816Y
            r1 = 1
            r0.f10838I = r1
            android.graphics.PorterDuff$Mode r1 = r0.f10836G
            if (r1 == r3) goto L10
            r0.f10836G = r3
            android.graphics.drawable.Drawable r0 = r2.f10818a0
            p103g0.C2200a.m5790f(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.f10819b0
            if (r1 == 0) goto Lb
            r1.setVisible(r3, r4)
        Lb:
            android.graphics.drawable.Drawable r1 = r2.f10818a0
            if (r1 == 0) goto L12
            r1.setVisible(r3, r4)
        L12:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f10818a0
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.unscheduleDrawable(r1, r3)
        L11:
            return
    }
}
