package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
public class C0593i extends androidx.recyclerview.widget.AbstractC0596j0 {

    /* renamed from: s */
    public static android.animation.TimeInterpolator f3419s;

    /* renamed from: h */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3420h;

    /* renamed from: i */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3421i;

    /* renamed from: j */
    public java.util.ArrayList<androidx.recyclerview.widget.C0593i.e> f3422j;

    /* renamed from: k */
    public java.util.ArrayList<androidx.recyclerview.widget.C0593i.d> f3423k;

    /* renamed from: l */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0>> f3424l;

    /* renamed from: m */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C0593i.e>> f3425m;

    /* renamed from: n */
    public java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.C0593i.d>> f3426n;

    /* renamed from: o */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3427o;

    /* renamed from: p */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3428p;

    /* renamed from: q */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3429q;

    /* renamed from: r */
    public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3430r;

    /* renamed from: androidx.recyclerview.widget.i$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.util.ArrayList f3431Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.C0593i f3432Z;

        public a(androidx.recyclerview.widget.C0593i r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f3432Z = r1
                r0.f3431Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r11 = this;
                java.util.ArrayList r0 = r11.f3431Y
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L58
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.i$e r1 = (androidx.recyclerview.widget.C0593i.e) r1
                androidx.recyclerview.widget.i r3 = r11.f3432Z
                androidx.recyclerview.widget.RecyclerView$b0 r4 = r1.f3443a
                int r2 = r1.f3444b
                int r5 = r1.f3445c
                int r6 = r1.f3446d
                int r1 = r1.f3447e
                java.util.Objects.requireNonNull(r3)
                android.view.View r7 = r4.f3208a
                int r6 = r6 - r2
                int r1 = r1 - r5
                r2 = 0
                if (r6 == 0) goto L2f
                android.view.ViewPropertyAnimator r5 = r7.animate()
                r5.translationX(r2)
            L2f:
                if (r1 == 0) goto L38
                android.view.ViewPropertyAnimator r5 = r7.animate()
                r5.translationY(r2)
            L38:
                android.view.ViewPropertyAnimator r8 = r7.animate()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r3.f3428p
                r2.add(r4)
                long r9 = r3.f3235e
                android.view.ViewPropertyAnimator r9 = r8.setDuration(r9)
                androidx.recyclerview.widget.l r10 = new androidx.recyclerview.widget.l
                r2 = r10
                r5 = r6
                r6 = r7
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                android.view.ViewPropertyAnimator r1 = r9.setListener(r10)
                r1.start()
                goto L6
            L58:
                java.util.ArrayList r0 = r11.f3431Y
                r0.clear()
                androidx.recyclerview.widget.i r0 = r11.f3432Z
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r0 = r0.f3425m
                java.util.ArrayList r1 = r11.f3431Y
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.util.ArrayList f3433Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.C0593i f3434Z;

        public b(androidx.recyclerview.widget.C0593i r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f3434Z = r1
                r0.f3433Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                java.util.ArrayList r0 = r9.f3433Y
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L8b
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.i$d r1 = (androidx.recyclerview.widget.C0593i.d) r1
                androidx.recyclerview.widget.i r2 = r9.f3434Z
                java.util.Objects.requireNonNull(r2)
                androidx.recyclerview.widget.RecyclerView$b0 r3 = r1.f3437a
                r4 = 0
                if (r3 != 0) goto L1e
                r3 = r4
                goto L20
            L1e:
                android.view.View r3 = r3.f3208a
            L20:
                androidx.recyclerview.widget.RecyclerView$b0 r5 = r1.f3438b
                if (r5 == 0) goto L26
                android.view.View r4 = r5.f3208a
            L26:
                r5 = 0
                if (r3 == 0) goto L5c
                android.view.ViewPropertyAnimator r6 = r3.animate()
                long r7 = r2.f3236f
                android.view.ViewPropertyAnimator r6 = r6.setDuration(r7)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r7 = r2.f3430r
                androidx.recyclerview.widget.RecyclerView$b0 r8 = r1.f3437a
                r7.add(r8)
                int r7 = r1.f3441e
                int r8 = r1.f3439c
                int r7 = r7 - r8
                float r7 = (float) r7
                r6.translationX(r7)
                int r7 = r1.f3442f
                int r8 = r1.f3440d
                int r7 = r7 - r8
                float r7 = (float) r7
                r6.translationY(r7)
                android.view.ViewPropertyAnimator r7 = r6.alpha(r5)
                androidx.recyclerview.widget.m r8 = new androidx.recyclerview.widget.m
                r8.<init>(r2, r1, r6, r3)
                android.view.ViewPropertyAnimator r3 = r7.setListener(r8)
                r3.start()
            L5c:
                if (r4 == 0) goto L6
                android.view.ViewPropertyAnimator r3 = r4.animate()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r6 = r2.f3430r
                androidx.recyclerview.widget.RecyclerView$b0 r7 = r1.f3438b
                r6.add(r7)
                android.view.ViewPropertyAnimator r6 = r3.translationX(r5)
                android.view.ViewPropertyAnimator r5 = r6.translationY(r5)
                long r6 = r2.f3236f
                android.view.ViewPropertyAnimator r5 = r5.setDuration(r6)
                r6 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r5 = r5.alpha(r6)
                androidx.recyclerview.widget.n r6 = new androidx.recyclerview.widget.n
                r6.<init>(r2, r1, r3, r4)
                android.view.ViewPropertyAnimator r1 = r5.setListener(r6)
                r1.start()
                goto L6
            L8b:
                java.util.ArrayList r0 = r9.f3433Y
                r0.clear()
                androidx.recyclerview.widget.i r0 = r9.f3434Z
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r0 = r0.f3426n
                java.util.ArrayList r1 = r9.f3433Y
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    public class c implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ java.util.ArrayList f3435Y;

        /* renamed from: Z */
        public final /* synthetic */ androidx.recyclerview.widget.C0593i f3436Z;

        public c(androidx.recyclerview.widget.C0593i r1, java.util.ArrayList r2) {
                r0 = this;
                r0.f3436Z = r1
                r0.f3435Y = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r8 = this;
                java.util.ArrayList r0 = r8.f3435Y
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3b
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.RecyclerView$b0 r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r1
                androidx.recyclerview.widget.i r2 = r8.f3436Z
                java.util.Objects.requireNonNull(r2)
                android.view.View r3 = r1.f3208a
                android.view.ViewPropertyAnimator r4 = r3.animate()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r2.f3427o
                r5.add(r1)
                r5 = 1065353216(0x3f800000, float:1.0)
                android.view.ViewPropertyAnimator r5 = r4.alpha(r5)
                long r6 = r2.f3233c
                android.view.ViewPropertyAnimator r5 = r5.setDuration(r6)
                androidx.recyclerview.widget.k r6 = new androidx.recyclerview.widget.k
                r6.<init>(r2, r1, r3, r4)
                android.view.ViewPropertyAnimator r1 = r5.setListener(r6)
                r1.start()
                goto L6
            L3b:
                java.util.ArrayList r0 = r8.f3435Y
                r0.clear()
                androidx.recyclerview.widget.i r0 = r8.f3436Z
                java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r0 = r0.f3424l
                java.util.ArrayList r1 = r8.f3435Y
                r0.remove(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    public static class d {

        /* renamed from: a */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3437a;

        /* renamed from: b */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3438b;

        /* renamed from: c */
        public int f3439c;

        /* renamed from: d */
        public int f3440d;

        /* renamed from: e */
        public int f3441e;

        /* renamed from: f */
        public int f3442f;

        public d(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.f3437a = r1
                r0.f3438b = r2
                r0.f3439c = r3
                r0.f3440d = r4
                r0.f3441e = r5
                r0.f3442f = r6
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "ChangeInfo{oldHolder="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r3.f3437a
                r0.append(r1)
                java.lang.String r1 = ", newHolder="
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r3.f3438b
                r0.append(r1)
                java.lang.String r1 = ", fromX="
                r0.append(r1)
                int r1 = r3.f3439c
                r0.append(r1)
                java.lang.String r1 = ", fromY="
                r0.append(r1)
                int r1 = r3.f3440d
                r0.append(r1)
                java.lang.String r1 = ", toX="
                r0.append(r1)
                int r1 = r3.f3441e
                r0.append(r1)
                java.lang.String r1 = ", toY="
                r0.append(r1)
                int r1 = r3.f3442f
                r2 = 125(0x7d, float:1.75E-43)
                java.lang.String r0 = p084f0.C1939b.m4826a(r0, r1, r2)
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$e */
    public static class e {

        /* renamed from: a */
        public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f3443a;

        /* renamed from: b */
        public int f3444b;

        /* renamed from: c */
        public int f3445c;

        /* renamed from: d */
        public int f3446d;

        /* renamed from: e */
        public int f3447e;

        public e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                r0.<init>()
                r0.f3443a = r1
                r0.f3444b = r2
                r0.f3445c = r3
                r0.f3446d = r4
                r0.f3447e = r5
                return
        }
    }

    public C0593i() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3420h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3421i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3422j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3423k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3424l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3425m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3426n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3427o = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3428p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3429q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3430r = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: c */
    public boolean mo1830c(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, java.util.List<java.lang.Object> r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lf
            boolean r2 = super.mo1830c(r2, r3)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: f */
    public void mo1833f(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8) {
            r7 = this;
            android.view.View r0 = r8.f3208a
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r1.cancel()
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r1 = r7.f3422j
            int r1 = r1.size()
        Lf:
            int r1 = r1 + (-1)
            r2 = 0
            if (r1 < 0) goto L2f
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r3 = r7.f3422j
            java.lang.Object r3 = r3.get(r1)
            androidx.recyclerview.widget.i$e r3 = (androidx.recyclerview.widget.C0593i.e) r3
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r3.f3443a
            if (r3 != r8) goto Lf
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m1831d(r8)
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r2 = r7.f3422j
            r2.remove(r1)
            goto Lf
        L2f:
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r1 = r7.f3423k
            r7.m2075q(r1, r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r7.f3420h
            boolean r1 = r1.remove(r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            r0.setAlpha(r3)
            r7.m1831d(r8)
        L44:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r7.f3421i
            boolean r1 = r1.remove(r8)
            if (r1 == 0) goto L52
            r0.setAlpha(r3)
            r7.m1831d(r8)
        L52:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r1 = r7.f3426n
            int r1 = r1.size()
        L58:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L73
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r4 = r7.f3426n
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r7.m2075q(r4, r8)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L72
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r4 = r7.f3426n
            r4.remove(r1)
        L72:
            goto L58
        L73:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r1 = r7.f3425m
            int r1 = r1.size()
        L79:
            int r1 = r1 + (-1)
            if (r1 < 0) goto Lb1
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r4 = r7.f3425m
            java.lang.Object r4 = r4.get(r1)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
        L89:
            int r5 = r5 + (-1)
            if (r5 < 0) goto Lb0
            java.lang.Object r6 = r4.get(r5)
            androidx.recyclerview.widget.i$e r6 = (androidx.recyclerview.widget.C0593i.e) r6
            androidx.recyclerview.widget.RecyclerView$b0 r6 = r6.f3443a
            if (r6 != r8) goto Laf
            r0.setTranslationY(r2)
            r0.setTranslationX(r2)
            r7.m1831d(r8)
            r4.remove(r5)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto Lb0
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r4 = r7.f3425m
            r4.remove(r1)
            goto Lb0
        Laf:
            goto L89
        Lb0:
            goto L79
        Lb1:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r1 = r7.f3424l
            int r1 = r1.size()
        Lb7:
            int r1 = r1 + (-1)
            if (r1 < 0) goto Ldb
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r2 = r7.f3424l
            java.lang.Object r2 = r2.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.remove(r8)
            if (r4 == 0) goto Lda
            r0.setAlpha(r3)
            r7.m1831d(r8)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lda
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r2 = r7.f3424l
            r2.remove(r1)
        Lda:
            goto Lb7
        Ldb:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3429q
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3427o
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3430r
            r0.remove(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3428p
            r0.remove(r8)
            r7.m2074p()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: g */
    public void mo1834g() {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r0 = r7.f3422j
            int r0 = r0.size()
        L6:
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L28
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r2 = r7.f3422j
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.i$e r2 = (androidx.recyclerview.widget.C0593i.e) r2
            androidx.recyclerview.widget.RecyclerView$b0 r3 = r2.f3443a
            android.view.View r3 = r3.f3208a
            r3.setTranslationY(r1)
            r3.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.f3443a
            r7.m1831d(r1)
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r1 = r7.f3422j
            r1.remove(r0)
            goto L6
        L28:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3420h
            int r0 = r0.size()
        L2e:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L43
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r7.f3420h
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r2
            r7.m1831d(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r7.f3420h
            r2.remove(r0)
            goto L2e
        L43:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3421i
            int r0 = r0.size()
        L49:
            int r0 = r0 + (-1)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto L65
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r7.f3421i
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r3
            android.view.View r4 = r3.f3208a
            r4.setAlpha(r2)
            r7.m1831d(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r2 = r7.f3421i
            r2.remove(r0)
            goto L49
        L65:
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r0 = r7.f3423k
            int r0 = r0.size()
        L6b:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L86
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r3 = r7.f3423k
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.i$d r3 = (androidx.recyclerview.widget.C0593i.d) r3
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r3.f3437a
            if (r4 == 0) goto L7e
            r7.m2076r(r3, r4)
        L7e:
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r3.f3438b
            if (r4 == 0) goto L85
            r7.m2076r(r3, r4)
        L85:
            goto L6b
        L86:
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r0 = r7.f3423k
            r0.clear()
            boolean r0 = r7.mo1835h()
            if (r0 != 0) goto L92
            return
        L92:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r0 = r7.f3425m
            int r0 = r0.size()
        L98:
            int r0 = r0 + (-1)
            if (r0 < 0) goto Ld1
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r3 = r7.f3425m
            java.lang.Object r3 = r3.get(r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
        La8:
            int r4 = r4 + (-1)
            if (r4 < 0) goto Ld0
            java.lang.Object r5 = r3.get(r4)
            androidx.recyclerview.widget.i$e r5 = (androidx.recyclerview.widget.C0593i.e) r5
            androidx.recyclerview.widget.RecyclerView$b0 r6 = r5.f3443a
            android.view.View r6 = r6.f3208a
            r6.setTranslationY(r1)
            r6.setTranslationX(r1)
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.f3443a
            r7.m1831d(r5)
            r3.remove(r4)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lcf
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r5 = r7.f3425m
            r5.remove(r3)
        Lcf:
            goto La8
        Ld0:
            goto L98
        Ld1:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r0 = r7.f3424l
            int r0 = r0.size()
        Ld7:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L109
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r1 = r7.f3424l
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
        Le7:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L108
            java.lang.Object r4 = r1.get(r3)
            androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r4
            android.view.View r5 = r4.f3208a
            r5.setAlpha(r2)
            r7.m1831d(r4)
            r1.remove(r3)
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L107
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r4 = r7.f3424l
            r4.remove(r1)
        L107:
            goto Le7
        L108:
            goto Ld7
        L109:
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r0 = r7.f3426n
            int r0 = r0.size()
        L10f:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L144
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r1 = r7.f3426n
            java.lang.Object r1 = r1.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L11f:
            int r2 = r2 + (-1)
            if (r2 < 0) goto L143
            java.lang.Object r3 = r1.get(r2)
            androidx.recyclerview.widget.i$d r3 = (androidx.recyclerview.widget.C0593i.d) r3
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r3.f3437a
            if (r4 == 0) goto L130
            r7.m2076r(r3, r4)
        L130:
            androidx.recyclerview.widget.RecyclerView$b0 r4 = r3.f3438b
            if (r4 == 0) goto L137
            r7.m2076r(r3, r4)
        L137:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L142
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r3 = r7.f3426n
            r3.remove(r1)
        L142:
            goto L11f
        L143:
            goto L10f
        L144:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3429q
            r7.m2073o(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3428p
            r7.m2073o(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3427o
            r7.m2073o(r0)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3430r
            r7.m2073o(r0)
            r7.m1832e()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: h */
    public boolean mo1835h() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3421i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r0 = r1.f3423k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r0 = r1.f3422j
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3420h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3428p
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3429q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3427o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3430r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r0 = r1.f3425m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r0 = r1.f3424l
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r0 = r1.f3426n
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            goto L5b
        L59:
            r0 = 0
            goto L5c
        L5b:
            r0 = 1
        L5c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0554j
    /* renamed from: j */
    public void mo1837j() {
            r10 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r10.f3420h
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r1 = r10.f3422j
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r2 = r10.f3423k
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r10.f3421i
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r0 != 0) goto L29
            if (r1 != 0) goto L29
            if (r3 != 0) goto L29
            if (r2 != 0) goto L29
            return
        L29:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r10.f3420h
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r4.next()
            androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r5
            android.view.View r6 = r5.f3208a
            android.view.ViewPropertyAnimator r7 = r6.animate()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r8 = r10.f3429q
            r8.add(r5)
            long r8 = r10.f3234d
            android.view.ViewPropertyAnimator r8 = r7.setDuration(r8)
            r9 = 0
            android.view.ViewPropertyAnimator r8 = r8.alpha(r9)
            androidx.recyclerview.widget.j r9 = new androidx.recyclerview.widget.j
            r9.<init>(r10, r5, r7, r6)
            android.view.ViewPropertyAnimator r5 = r8.setListener(r9)
            r5.start()
            goto L2f
        L5e:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r10.f3420h
            r4.clear()
            r4 = 0
            if (r1 == 0) goto L96
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r6 = r10.f3422j
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$e>> r6 = r10.f3425m
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r6 = r10.f3422j
            r6.clear()
            androidx.recyclerview.widget.i$a r6 = new androidx.recyclerview.widget.i$a
            r6.<init>(r10, r5)
            if (r0 == 0) goto L93
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.i$e r5 = (androidx.recyclerview.widget.C0593i.e) r5
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.f3443a
            android.view.View r5 = r5.f3208a
            long r7 = r10.f3234d
            java.util.WeakHashMap<android.view.View, n0.w> r9 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10566n(r5, r6, r7)
            goto L96
        L93:
            r6.run()
        L96:
            if (r2 == 0) goto Lc8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r6 = r10.f3423k
            r5.addAll(r6)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.i$d>> r6 = r10.f3426n
            r6.add(r5)
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r6 = r10.f3423k
            r6.clear()
            androidx.recyclerview.widget.i$b r6 = new androidx.recyclerview.widget.i$b
            r6.<init>(r10, r5)
            if (r0 == 0) goto Lc5
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.i$d r5 = (androidx.recyclerview.widget.C0593i.d) r5
            androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.f3437a
            android.view.View r5 = r5.f3208a
            long r7 = r10.f3234d
            java.util.WeakHashMap<android.view.View, n0.w> r9 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10566n(r5, r6, r7)
            goto Lc8
        Lc5:
            r6.run()
        Lc8:
            if (r3 == 0) goto L112
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r10.f3421i
            r3.addAll(r5)
            java.util.ArrayList<java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0>> r5 = r10.f3424l
            r5.add(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r10.f3421i
            r5.clear()
            androidx.recyclerview.widget.i$c r5 = new androidx.recyclerview.widget.i$c
            r5.<init>(r10, r3)
            if (r0 != 0) goto Lee
            if (r1 != 0) goto Lee
            if (r2 == 0) goto Lea
            goto Lee
        Lea:
            r5.run()
            goto L112
        Lee:
            r6 = 0
            if (r0 == 0) goto Lf5
            long r8 = r10.f3234d
            goto Lf6
        Lf5:
            r8 = r6
        Lf6:
            if (r1 == 0) goto Lfb
            long r0 = r10.f3235e
            goto Lfc
        Lfb:
            r0 = r6
        Lfc:
            if (r2 == 0) goto L100
            long r6 = r10.f3236f
        L100:
            long r0 = java.lang.Math.max(r0, r6)
            long r0 = r0 + r8
            java.lang.Object r2 = r3.get(r4)
            androidx.recyclerview.widget.RecyclerView$b0 r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r2
            android.view.View r2 = r2.f3208a
            java.util.WeakHashMap<android.view.View, n0.w> r3 = p227n0.C4661t.f18570a
            p227n0.C4661t.c.m10566n(r2, r5, r0)
        L112:
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC0596j0
    /* renamed from: k */
    public boolean mo2069k(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            r2.m2077s(r3)
            android.view.View r0 = r3.f3208a
            r1 = 0
            r0.setAlpha(r1)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r2.f3421i
            r0.add(r3)
            r3 = 1
            return r3
    }

    @Override // androidx.recyclerview.widget.AbstractC0596j0
    /* renamed from: l */
    public boolean mo2070l(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r10, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            if (r10 != r11) goto Ld
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            boolean r10 = r0.mo2071m(r1, r2, r3, r4, r5)
            return r10
        Ld:
            android.view.View r0 = r10.f3208a
            float r0 = r0.getTranslationX()
            android.view.View r1 = r10.f3208a
            float r1 = r1.getTranslationY()
            android.view.View r2 = r10.f3208a
            float r2 = r2.getAlpha()
            r9.m2077s(r10)
            int r3 = r14 - r12
            float r3 = (float) r3
            float r3 = r3 - r0
            int r3 = (int) r3
            int r4 = r15 - r13
            float r4 = (float) r4
            float r4 = r4 - r1
            int r4 = (int) r4
            android.view.View r5 = r10.f3208a
            r5.setTranslationX(r0)
            android.view.View r0 = r10.f3208a
            r0.setTranslationY(r1)
            android.view.View r0 = r10.f3208a
            r0.setAlpha(r2)
            r9.m2077s(r11)
            android.view.View r0 = r11.f3208a
            int r1 = -r3
            float r1 = (float) r1
            r0.setTranslationX(r1)
            android.view.View r0 = r11.f3208a
            int r1 = -r4
            float r1 = (float) r1
            r0.setTranslationY(r1)
            android.view.View r0 = r11.f3208a
            r1 = 0
            r0.setAlpha(r1)
            java.util.ArrayList<androidx.recyclerview.widget.i$d> r0 = r9.f3423k
            androidx.recyclerview.widget.i$d r8 = new androidx.recyclerview.widget.i$d
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r8)
            r10 = 1
            return r10
    }

    @Override // androidx.recyclerview.widget.AbstractC0596j0
    /* renamed from: m */
    public boolean mo2071m(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            android.view.View r0 = r9.f3208a
            float r1 = r0.getTranslationX()
            int r1 = (int) r1
            int r4 = r10 + r1
            android.view.View r10 = r9.f3208a
            float r10 = r10.getTranslationY()
            int r10 = (int) r10
            int r5 = r11 + r10
            r8.m2077s(r9)
            int r10 = r12 - r4
            int r11 = r13 - r5
            if (r10 != 0) goto L22
            if (r11 != 0) goto L22
            r8.m1831d(r9)
            r9 = 0
            return r9
        L22:
            if (r10 == 0) goto L29
            int r10 = -r10
            float r10 = (float) r10
            r0.setTranslationX(r10)
        L29:
            if (r11 == 0) goto L30
            int r10 = -r11
            float r10 = (float) r10
            r0.setTranslationY(r10)
        L30:
            java.util.ArrayList<androidx.recyclerview.widget.i$e> r10 = r8.f3422j
            androidx.recyclerview.widget.i$e r11 = new androidx.recyclerview.widget.i$e
            r2 = r11
            r3 = r9
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r10.add(r11)
            r9 = 1
            return r9
    }

    @Override // androidx.recyclerview.widget.AbstractC0596j0
    /* renamed from: n */
    public boolean mo2072n(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2) {
            r1 = this;
            r1.m2077s(r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r1.f3420h
            r0.add(r2)
            r2 = 1
            return r2
    }

    /* renamed from: o */
    public void m2073o(java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> r3) {
            r2 = this;
            int r0 = r3.size()
        L4:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L18
            java.lang.Object r1 = r3.get(r0)
            androidx.recyclerview.widget.RecyclerView$b0 r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r1
            android.view.View r1 = r1.f3208a
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.cancel()
            goto L4
        L18:
            return
    }

    /* renamed from: p */
    public void m2074p() {
            r1 = this;
            boolean r0 = r1.mo1835h()
            if (r0 != 0) goto L9
            r1.m1832e()
        L9:
            return
    }

    /* renamed from: q */
    public final void m2075q(java.util.List<androidx.recyclerview.widget.C0593i.d> r4, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r5) {
            r3 = this;
            int r0 = r4.size()
        L4:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L20
            java.lang.Object r1 = r4.get(r0)
            androidx.recyclerview.widget.i$d r1 = (androidx.recyclerview.widget.C0593i.d) r1
            boolean r2 = r3.m2076r(r1, r5)
            if (r2 == 0) goto L4
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3437a
            if (r2 != 0) goto L4
            androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.f3438b
            if (r2 != 0) goto L4
            r4.remove(r1)
            goto L4
        L20:
            return
    }

    /* renamed from: r */
    public final boolean m2076r(androidx.recyclerview.widget.C0593i.d r3, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r3.f3438b
            r1 = 0
            if (r0 != r4) goto L8
            r3.f3438b = r1
            goto Le
        L8:
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r3.f3437a
            if (r0 != r4) goto L25
            r3.f3437a = r1
        Le:
            android.view.View r3 = r4.f3208a
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            android.view.View r3 = r4.f3208a
            r0 = 0
            r3.setTranslationX(r0)
            android.view.View r3 = r4.f3208a
            r3.setTranslationY(r0)
            r2.m1831d(r4)
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
    }

    /* renamed from: s */
    public final void m2077s(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3) {
            r2 = this;
            android.animation.TimeInterpolator r0 = androidx.recyclerview.widget.C0593i.f3419s
            if (r0 != 0) goto Lf
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            android.animation.TimeInterpolator r0 = r0.getInterpolator()
            androidx.recyclerview.widget.C0593i.f3419s = r0
        Lf:
            android.view.View r0 = r3.f3208a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.animation.TimeInterpolator r1 = androidx.recyclerview.widget.C0593i.f3419s
            r0.setInterpolator(r1)
            r2.mo1833f(r3)
            return
    }
}
