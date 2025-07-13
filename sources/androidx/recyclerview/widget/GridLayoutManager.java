package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class GridLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: E */
    public boolean f3065E;

    /* renamed from: F */
    public int f3066F;

    /* renamed from: G */
    public int[] f3067G;

    /* renamed from: H */
    public android.view.View[] f3068H;

    /* renamed from: I */
    public final android.util.SparseIntArray f3069I;

    /* renamed from: J */
    public final android.util.SparseIntArray f3070J;

    /* renamed from: K */
    public androidx.recyclerview.widget.GridLayoutManager.AbstractC0538c f3071K;

    /* renamed from: L */
    public final android.graphics.Rect f3072L;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0536a extends androidx.recyclerview.widget.GridLayoutManager.AbstractC0538c {
        public C0536a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0537b extends androidx.recyclerview.widget.RecyclerView.C0558n {

        /* renamed from: e */
        public int f3073e;

        /* renamed from: f */
        public int f3074f;

        public C0537b(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f3073e = r1
                r1 = 0
                r0.f3074f = r1
                return
        }

        public C0537b(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.f3073e = r1
                r1 = 0
                r0.f3074f = r1
                return
        }

        public C0537b(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f3073e = r1
                r1 = 0
                r0.f3074f = r1
                return
        }

        public C0537b(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = -1
                r0.f3073e = r1
                r1 = 0
                r0.f3074f = r1
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0538c {

        /* renamed from: a */
        public final android.util.SparseIntArray f3075a;

        /* renamed from: b */
        public final android.util.SparseIntArray f3076b;

        public AbstractC0538c() {
                r1 = this;
                r1.<init>()
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f3075a = r0
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                r1.f3076b = r0
                return
        }

        /* renamed from: a */
        public int m1660a(int r6, int r7) {
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
            L4:
                r4 = 1
                if (r1 >= r6) goto L17
                int r2 = r2 + 1
                if (r2 != r7) goto Lf
                int r3 = r3 + 1
                r2 = 0
                goto L14
            Lf:
                if (r2 <= r7) goto L14
                int r3 = r3 + 1
                r2 = 1
            L14:
                int r1 = r1 + 1
                goto L4
            L17:
                int r2 = r2 + r4
                if (r2 <= r7) goto L1c
                int r3 = r3 + 1
            L1c:
                return r3
        }
    }

    public GridLayoutManager(android.content.Context r2, int r3) {
            r1 = this;
            r2 = 1
            r0 = 0
            r1.<init>(r2, r0)
            r1.f3065E = r0
            r2 = -1
            r1.f3066F = r2
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r1.f3069I = r2
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            r1.f3070J = r2
            androidx.recyclerview.widget.GridLayoutManager$a r2 = new androidx.recyclerview.widget.GridLayoutManager$a
            r2.<init>()
            r1.f3071K = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.f3072L = r2
            r1.m1626C1(r3)
            return
    }

    public GridLayoutManager(android.content.Context r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>(r3, r4)
            r1 = 0
            r0.f3065E = r1
            r1 = -1
            r0.f3066F = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f3069I = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r0.f3070J = r1
            androidx.recyclerview.widget.GridLayoutManager$a r1 = new androidx.recyclerview.widget.GridLayoutManager$a
            r1.<init>()
            r0.f3071K = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f3072L = r1
            r0.m1626C1(r2)
            return
    }

    public GridLayoutManager(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.f3065E = r0
            r0 = -1
            r1.f3066F = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f3069I = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r1.f3070J = r0
            androidx.recyclerview.widget.GridLayoutManager$a r0 = new androidx.recyclerview.widget.GridLayoutManager$a
            r0.<init>()
            r1.f3071K = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.f3072L = r0
            androidx.recyclerview.widget.RecyclerView$m$d r2 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1843S(r2, r3, r4, r5)
            int r2 = r2.f3258b
            r1.m1626C1(r2)
            return
    }

    /* renamed from: A1 */
    public final void m1622A1(android.view.View r9, int r10, boolean r11) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r0
            android.graphics.Rect r1 = r0.f3262b
            int r2 = r1.top
            int r3 = r1.bottom
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r3 = r1.left
            int r1 = r1.right
            int r3 = r3 + r1
            int r1 = r0.leftMargin
            int r3 = r3 + r1
            int r1 = r0.rightMargin
            int r3 = r3 + r1
            int r1 = r0.f3073e
            int r4 = r0.f3074f
            int r1 = r8.m1654w1(r1, r4)
            int r4 = r8.f3081p
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L41
            int r4 = r0.width
            int r10 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r10, r3, r4, r5)
            androidx.recyclerview.widget.c0 r1 = r8.f3083r
            int r1 = r1.mo2007l()
            int r3 = r8.f3252m
            int r0 = r0.height
            int r0 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r3, r2, r0, r6)
            goto L58
        L41:
            int r4 = r0.height
            int r10 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r10, r2, r4, r5)
            androidx.recyclerview.widget.c0 r1 = r8.f3083r
            int r1 = r1.mo2007l()
            int r2 = r8.f3251l
            int r0 = r0.width
            int r0 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r2, r3, r0, r6)
            r7 = r0
            r0 = r10
            r10 = r7
        L58:
            r8.m1625B1(r9, r10, r0, r11)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: B */
    public int mo1623B(androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4) {
            r2 = this;
            int r0 = r2.f3081p
            r1 = 1
            if (r0 != r1) goto L8
            int r3 = r2.f3066F
            return r3
        L8:
            int r0 = r4.m1930b()
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.m1930b()
            int r0 = r0 - r1
            int r3 = r2.m1656x1(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: B0 */
    public int mo1624B0(int r2, androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4) {
            r1 = this;
            r1.m1627D1()
            r1.m1652v1()
            int r0 = r1.f3081p
            if (r0 != 0) goto Lc
            r2 = 0
            goto L10
        Lc:
            int r2 = r1.m1697n1(r2, r3, r4)
        L10:
            return r2
    }

    /* renamed from: B1 */
    public final void m1625B1(android.view.View r2, int r3, int r4, boolean r5) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r0 = (androidx.recyclerview.widget.RecyclerView.C0558n) r0
            if (r5 == 0) goto Ld
            boolean r5 = r1.m1859J0(r2, r3, r4, r0)
            goto L11
        Ld:
            boolean r5 = r1.m1856H0(r2, r3, r4, r0)
        L11:
            if (r5 == 0) goto L16
            r2.measure(r3, r4)
        L16:
            return
    }

    /* renamed from: C1 */
    public void m1626C1(int r3) {
            r2 = this;
            int r0 = r2.f3066F
            if (r3 != r0) goto L5
            return
        L5:
            r0 = 1
            r2.f3065E = r0
            if (r3 < r0) goto L17
            r2.f3066F = r3
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r2.f3071K
            android.util.SparseIntArray r3 = r3.f3075a
            r3.clear()
            r2.m1890y0()
            return
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Span count should be at least 1. Provided "
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: D1 */
    public final void m1627D1() {
            r2 = this;
            int r0 = r2.f3081p
            r1 = 1
            if (r0 != r1) goto L11
            int r0 = r2.f3253n
            int r1 = r2.m1866P()
            int r0 = r0 - r1
            int r1 = r2.m1865O()
            goto L1c
        L11:
            int r0 = r2.f3254o
            int r1 = r2.m1864N()
            int r0 = r0 - r1
            int r1 = r2.m1867Q()
        L1c:
            int r0 = r0 - r1
            r2.m1650u1(r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: E0 */
    public void mo1628E0(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int[] r0 = r4.f3067G
            if (r0 != 0) goto L7
            super.mo1628E0(r5, r6, r7)
        L7:
            int r0 = r4.m1865O()
            int r1 = r4.m1866P()
            int r1 = r1 + r0
            int r0 = r4.m1867Q()
            int r2 = r4.m1864N()
            int r2 = r2 + r0
            int r0 = r4.f3081p
            r3 = 1
            if (r0 != r3) goto L3b
            int r5 = r5.height()
            int r5 = r5 + r2
            int r0 = r4.m1861L()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r7, r5, r0)
            int[] r7 = r4.f3067G
            int r0 = r7.length
            int r0 = r0 - r3
            r7 = r7[r0]
            int r7 = r7 + r1
            int r0 = r4.m1863M()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r6, r7, r0)
            goto L57
        L3b:
            int r5 = r5.width()
            int r5 = r5 + r1
            int r0 = r4.m1863M()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r6, r5, r0)
            int[] r5 = r4.f3067G
            int r0 = r5.length
            int r0 = r0 - r3
            r5 = r5[r0]
            int r5 = r5 + r2
            int r0 = r4.m1861L()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r7, r5, r0)
        L57:
            androidx.recyclerview.widget.RecyclerView r7 = r4.f3241b
            androidx.recyclerview.widget.RecyclerView.m1722e(r7, r6, r5)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: M0 */
    public boolean mo1629M0() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.f3091z
            if (r0 != 0) goto La
            boolean r0 = r1.f3065E
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: O0 */
    public void mo1630O0(androidx.recyclerview.widget.RecyclerView.C0569y r7, androidx.recyclerview.widget.LinearLayoutManager.C0541c r8, androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c r9) {
            r6 = this;
            int r0 = r6.f3066F
            r1 = 0
            r2 = 0
        L4:
            int r3 = r6.f3066F
            if (r2 >= r3) goto L2f
            boolean r3 = r8.m1712b(r7)
            if (r3 == 0) goto L2f
            if (r0 <= 0) goto L2f
            int r3 = r8.f3104d
            int r4 = r8.f3107g
            int r4 = java.lang.Math.max(r1, r4)
            r5 = r9
            androidx.recyclerview.widget.r$b r5 = (androidx.recyclerview.widget.RunnableC0607r.b) r5
            r5.m2114a(r3, r4)
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r6.f3071K
            java.util.Objects.requireNonNull(r3)
            int r0 = r0 + (-1)
            int r3 = r8.f3104d
            int r4 = r8.f3105e
            int r3 = r3 + r4
            r8.f3104d = r3
            int r2 = r2 + 1
            goto L4
        L2f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: T */
    public int mo1631T(androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4) {
            r2 = this;
            int r0 = r2.f3081p
            if (r0 != 0) goto L7
            int r3 = r2.f3066F
            return r3
        L7:
            int r0 = r4.m1930b()
            r1 = 1
            if (r0 >= r1) goto L10
            r3 = 0
            return r3
        L10:
            int r0 = r4.m1930b()
            int r0 = r0 - r1
            int r3 = r2.m1656x1(r3, r4, r0)
            int r3 = r3 + r1
            return r3
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: b1 */
    public android.view.View mo1632b1(androidx.recyclerview.widget.RecyclerView.C0564t r9, androidx.recyclerview.widget.RecyclerView.C0569y r10, boolean r11, boolean r12) {
            r8 = this;
            int r11 = r8.m1891z()
            r0 = -1
            r1 = 1
            if (r12 == 0) goto Lf
            int r11 = r8.m1891z()
            int r11 = r11 - r1
            r1 = -1
            goto L12
        Lf:
            r12 = 0
            r0 = r11
            r11 = 0
        L12:
            int r12 = r10.m1930b()
            r8.m1669T0()
            androidx.recyclerview.widget.c0 r2 = r8.f3083r
            int r2 = r2.mo2006k()
            androidx.recyclerview.widget.c0 r3 = r8.f3083r
            int r3 = r3.mo2002g()
            r4 = 0
            r5 = r4
        L27:
            if (r11 == r0) goto L63
            android.view.View r6 = r8.m1889y(r11)
            int r7 = r8.m1868R(r6)
            if (r7 < 0) goto L61
            if (r7 >= r12) goto L61
            int r7 = r8.m1657y1(r9, r10, r7)
            if (r7 == 0) goto L3c
            goto L61
        L3c:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r7 = (androidx.recyclerview.widget.RecyclerView.C0558n) r7
            boolean r7 = r7.m1899c()
            if (r7 == 0) goto L4c
            if (r5 != 0) goto L61
            r5 = r6
            goto L61
        L4c:
            androidx.recyclerview.widget.c0 r7 = r8.f3083r
            int r7 = r7.mo2000e(r6)
            if (r7 >= r3) goto L5e
            androidx.recyclerview.widget.c0 r7 = r8.f3083r
            int r7 = r7.mo1997b(r6)
            if (r7 >= r2) goto L5d
            goto L5e
        L5d:
            return r6
        L5e:
            if (r4 != 0) goto L61
            r4 = r6
        L61:
            int r11 = r11 + r1
            goto L27
        L63:
            if (r4 == 0) goto L66
            goto L67
        L66:
            r4 = r5
        L67:
            return r4
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: c0 */
    public android.view.View mo1633c0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C0564t r25, androidx.recyclerview.widget.RecyclerView.C0569y r26) {
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.m1883t(r23)
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r5
            int r6 = r5.f3073e
            int r5 = r5.f3074f
            int r5 = r5 + r6
            android.view.View r7 = super.mo1633c0(r23, r24, r25, r26)
            if (r7 != 0) goto L20
            return r4
        L20:
            r7 = r24
            int r7 = r0.m1668S0(r7)
            r9 = 1
            if (r7 != r9) goto L2b
            r7 = 1
            goto L2c
        L2b:
            r7 = 0
        L2c:
            boolean r10 = r0.f3086u
            if (r7 == r10) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            r10 = -1
            if (r7 == 0) goto L3e
            int r7 = r22.m1891z()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L45
        L3e:
            int r7 = r22.m1891z()
            r11 = r7
            r7 = 0
            r12 = 1
        L45:
            int r13 = r0.f3081p
            if (r13 != r9) goto L51
            boolean r13 = r22.m1688g1()
            if (r13 == 0) goto L51
            r13 = 1
            goto L52
        L51:
            r13 = 0
        L52:
            int r14 = r0.m1656x1(r1, r2, r7)
            r10 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L5e:
            if (r10 == r11) goto L144
            r17 = r11
            int r11 = r0.m1656x1(r1, r2, r10)
            android.view.View r1 = r0.m1889y(r10)
            if (r1 != r3) goto L6e
            goto L144
        L6e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L85
            if (r11 == r14) goto L85
            if (r4 == 0) goto L7a
            goto L144
        L7a:
            r18 = r3
            r21 = r7
            r19 = r9
            r20 = r14
            r14 = 1
            goto L132
        L85:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r11
            int r2 = r11.f3073e
            r18 = r3
            int r3 = r11.f3074f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L9d
            if (r2 != r6) goto L9d
            if (r3 != r5) goto L9d
            return r1
        L9d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto La5
            if (r4 == 0) goto Lad
        La5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lb0
            if (r7 != 0) goto Lb0
        Lad:
            r21 = r7
            goto Lce
        Lb0:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Ld5
            if (r7 <= r9) goto Lc5
            goto Lce
        Lc5:
            if (r7 != r9) goto L102
            if (r2 <= r15) goto Lcb
            r7 = 1
            goto Lcc
        Lcb:
            r7 = 0
        Lcc:
            if (r13 != r7) goto L102
        Lce:
            r19 = r9
            r20 = r14
            r7 = 1
            r14 = 1
            goto L108
        Ld5:
            if (r4 != 0) goto L102
            r19 = r9
            androidx.recyclerview.widget.l0 r9 = r0.f3242c
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r9 = r9.m2084b(r1, r14)
            if (r9 == 0) goto Lef
            androidx.recyclerview.widget.l0 r9 = r0.f3243d
            boolean r9 = r9.m2084b(r1, r14)
            if (r9 == 0) goto Lef
            r9 = 1
            goto Lf0
        Lef:
            r9 = 0
        Lf0:
            r14 = 1
            r9 = r9 ^ r14
            if (r9 == 0) goto L107
            if (r7 <= r12) goto Lf7
            goto L100
        Lf7:
            if (r7 != r12) goto L107
            if (r2 <= r8) goto Lfd
            r7 = 1
            goto Lfe
        Lfd:
            r7 = 0
        Lfe:
            if (r13 != r7) goto L107
        L100:
            r7 = 1
            goto L108
        L102:
            r19 = r9
            r20 = r14
            r14 = 1
        L107:
            r7 = 0
        L108:
            if (r7 == 0) goto L132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L121
            int r4 = r11.f3073e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L136
        L121:
            int r7 = r11.f3073e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r9 = r19
            r7 = r1
            goto L136
        L132:
            r9 = r19
            r7 = r21
        L136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L5e
        L144:
            r21 = r7
            if (r4 == 0) goto L149
            goto L14b
        L149:
            r4 = r21
        L14b:
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: g0 */
    public void mo1634g0(androidx.recyclerview.widget.RecyclerView.C0564t r8, androidx.recyclerview.widget.RecyclerView.C0569y r9, android.view.View r10, p242o0.C4868b r11) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager.C0537b
            if (r1 != 0) goto Lc
            r7.m1878f0(r10, r11)
            return
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r0
            int r10 = r0.m1897a()
            int r8 = r7.m1656x1(r8, r9, r10)
            int r9 = r7.f3081p
            if (r9 != 0) goto L23
            int r1 = r0.f3073e
            int r2 = r0.f3074f
            r4 = 1
            r5 = 0
            r6 = 0
            r3 = r8
            goto L2b
        L23:
            r2 = 1
            int r3 = r0.f3073e
            int r4 = r0.f3074f
            r5 = 0
            r6 = 0
            r1 = r8
        L2b:
            o0.b$c r8 = p242o0.C4868b.c.m11002a(r1, r2, r3, r4, r5, r6)
            r11.m10997j(r8)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: h0 */
    public void mo1635h0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3075a
            r1.clear()
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3076b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: h1 */
    public void mo1636h1(androidx.recyclerview.widget.RecyclerView.C0564t r18, androidx.recyclerview.widget.RecyclerView.C0569y r19, androidx.recyclerview.widget.LinearLayoutManager.C0541c r20, androidx.recyclerview.widget.LinearLayoutManager.C0540b r21) {
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.c0 r3 = r6.f3083r
            int r3 = r3.mo2005j()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r3 == r4) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            int r9 = r17.m1891z()
            if (r9 <= 0) goto L25
            int[] r9 = r6.f3067G
            int r10 = r6.f3066F
            r9 = r9[r10]
            goto L26
        L25:
            r9 = 0
        L26:
            if (r4 == 0) goto L2b
            r17.m1627D1()
        L2b:
            int r10 = r2.f3105e
            if (r10 != r5) goto L31
            r10 = 1
            goto L32
        L31:
            r10 = 0
        L32:
            int r11 = r6.f3066F
            if (r10 != 0) goto L43
            int r11 = r2.f3104d
            int r11 = r6.m1657y1(r0, r1, r11)
            int r12 = r2.f3104d
            int r12 = r6.m1659z1(r0, r1, r12)
            int r11 = r11 + r12
        L43:
            r12 = 0
        L44:
            int r13 = r6.f3066F
            if (r12 >= r13) goto L84
            boolean r13 = r2.m1712b(r1)
            if (r13 == 0) goto L84
            if (r11 <= 0) goto L84
            int r13 = r2.f3104d
            int r14 = r6.m1659z1(r0, r1, r13)
            int r15 = r6.f3066F
            if (r14 > r15) goto L6c
            int r11 = r11 - r14
            if (r11 >= 0) goto L5e
            goto L84
        L5e:
            android.view.View r13 = r2.m1713c(r0)
            if (r13 != 0) goto L65
            goto L84
        L65:
            android.view.View[] r14 = r6.f3068H
            r14[r12] = r13
            int r12 = r12 + 1
            goto L44
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Item at position "
            java.lang.String r2 = " requires "
            java.lang.String r3 = " spans but GridLayoutManager has only "
            java.lang.StringBuilder r1 = androidx.recyclerview.widget.C0608s.m2117a(r1, r13, r2, r14, r3)
            int r2 = r6.f3066F
            java.lang.String r3 = " spans."
            java.lang.String r1 = p381w.C6764e.m13690a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L84:
            if (r12 != 0) goto L89
            r7.f3098b = r5
            return
        L89:
            if (r10 == 0) goto L92
            r5 = 0
            r11 = 0
            r13 = 1
            r11 = r12
            r13 = 0
            r14 = 1
            goto L97
        L92:
            int r5 = r12 + (-1)
            r11 = -1
            r13 = 0
            r14 = -1
        L97:
            if (r5 == r11) goto Lb4
            android.view.View[] r15 = r6.f3068H
            r15 = r15[r5]
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            r8 = r16
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r8
            int r15 = r6.m1868R(r15)
            int r15 = r6.m1659z1(r0, r1, r15)
            r8.f3074f = r15
            r8.f3073e = r13
            int r13 = r13 + r15
            int r5 = r5 + r14
            goto L97
        Lb4:
            r0 = 0
            r1 = 0
            r5 = 0
        Lb7:
            if (r1 >= r12) goto L108
            android.view.View[] r8 = r6.f3068H
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r11 = r2.f3111k
            if (r11 != 0) goto Lcd
            if (r10 == 0) goto Lc8
            r6.m1874c(r8)
            r11 = 0
            goto Lda
        Lc8:
            r11 = 0
            r6.m1875d(r8, r11, r11)
            goto Lda
        Lcd:
            r11 = 0
            if (r10 == 0) goto Ld6
            r13 = -1
            r14 = 1
            r6.m1875d(r8, r13, r14)
            goto Lda
        Ld6:
            r13 = 1
            r6.m1875d(r8, r11, r13)
        Lda:
            android.graphics.Rect r13 = r6.f3072L
            r6.m1877f(r8, r13)
            r6.m1622A1(r8, r3, r11)
            androidx.recyclerview.widget.c0 r11 = r6.f3083r
            int r11 = r11.mo1998c(r8)
            if (r11 <= r5) goto Leb
            r5 = r11
        Leb:
            android.view.ViewGroup$LayoutParams r11 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r11
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.c0 r14 = r6.f3083r
            int r8 = r14.mo1999d(r8)
            float r8 = (float) r8
            float r8 = r8 * r13
            int r11 = r11.f3074f
            float r11 = (float) r11
            float r8 = r8 / r11
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 <= 0) goto L105
            r0 = r8
        L105:
            int r1 = r1 + 1
            goto Lb7
        L108:
            if (r4 == 0) goto L135
            int r1 = r6.f3066F
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r9)
            r6.m1650u1(r0)
            r0 = 0
            r1 = 0
            r5 = 0
        L11d:
            if (r0 >= r12) goto L135
            android.view.View[] r1 = r6.f3068H
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 1
            r6.m1622A1(r1, r3, r4)
            androidx.recyclerview.widget.c0 r3 = r6.f3083r
            int r1 = r3.mo1998c(r1)
            if (r1 <= r5) goto L132
            r5 = r1
        L132:
            int r0 = r0 + 1
            goto L11d
        L135:
            r0 = 0
        L136:
            if (r0 >= r12) goto L197
            android.view.View[] r1 = r6.f3068H
            r1 = r1[r0]
            androidx.recyclerview.widget.c0 r3 = r6.f3083r
            int r3 = r3.mo1998c(r1)
            if (r3 == r5) goto L193
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r3
            android.graphics.Rect r4 = r3.f3262b
            int r8 = r4.top
            int r9 = r4.bottom
            int r8 = r8 + r9
            int r9 = r3.topMargin
            int r8 = r8 + r9
            int r9 = r3.bottomMargin
            int r8 = r8 + r9
            int r9 = r4.left
            int r4 = r4.right
            int r9 = r9 + r4
            int r4 = r3.leftMargin
            int r9 = r9 + r4
            int r4 = r3.rightMargin
            int r9 = r9 + r4
            int r4 = r3.f3073e
            int r10 = r3.f3074f
            int r4 = r6.m1654w1(r4, r10)
            int r10 = r6.f3081p
            r11 = 1
            if (r10 != r11) goto L17f
            int r3 = r3.width
            r10 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            int r3 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r4, r10, r9, r3, r13)
            int r4 = r5 - r8
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r10)
            goto L18f
        L17f:
            r13 = 0
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = r5 - r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r3 = r3.height
            int r4 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r4, r10, r8, r3, r13)
            r3 = r9
        L18f:
            r6.m1625B1(r1, r3, r4, r11)
            goto L194
        L193:
            r13 = 0
        L194:
            int r0 = r0 + 1
            goto L136
        L197:
            r0 = 1
            r7.f3097a = r5
            int r1 = r6.f3081p
            if (r1 != r0) goto L1af
            int r0 = r2.f3106f
            r1 = -1
            if (r0 != r1) goto L1a8
            int r0 = r2.f3102b
            int r1 = r0 - r5
            goto L1ac
        L1a8:
            int r1 = r2.f3102b
            int r0 = r5 + r1
        L1ac:
            r2 = 0
            r3 = 0
            goto L1c2
        L1af:
            r0 = -1
            int r1 = r2.f3106f
            if (r1 != r0) goto L1bb
            int r0 = r2.f3102b
            int r1 = r0 - r5
            r2 = r0
            r3 = r1
            goto L1c0
        L1bb:
            int r0 = r2.f3102b
            int r5 = r5 + r0
            r3 = r0
            r2 = r5
        L1c0:
            r1 = 0
            r0 = 0
        L1c2:
            r4 = 0
            r8 = 0
        L1c4:
            if (r8 >= r12) goto L248
            android.view.View[] r4 = r6.f3068H
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r10
            int r4 = r6.f3081p
            r5 = 1
            if (r4 != r5) goto L208
            boolean r2 = r17.m1688g1()
            if (r2 == 0) goto L1f3
            int r2 = r17.m1865O()
            int[] r3 = r6.f3067G
            int r4 = r6.f3066F
            int r5 = r10.f3073e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r2 = r2 + r3
            androidx.recyclerview.widget.c0 r3 = r6.f3083r
            int r3 = r3.mo1999d(r9)
            int r3 = r2 - r3
            goto L205
        L1f3:
            int r2 = r17.m1865O()
            int[] r3 = r6.f3067G
            int r4 = r10.f3073e
            r3 = r3[r4]
            int r3 = r3 + r2
            androidx.recyclerview.widget.c0 r2 = r6.f3083r
            int r2 = r2.mo1999d(r9)
            int r2 = r2 + r3
        L205:
            r11 = r0
            r13 = r1
            goto L21c
        L208:
            int r0 = r17.m1867Q()
            int[] r1 = r6.f3067G
            int r4 = r10.f3073e
            r1 = r1[r4]
            int r0 = r0 + r1
            androidx.recyclerview.widget.c0 r1 = r6.f3083r
            int r1 = r1.mo1999d(r9)
            int r1 = r1 + r0
            r13 = r0
            r11 = r1
        L21c:
            r14 = r2
            r15 = r3
            r0 = r17
            r1 = r9
            r2 = r15
            r3 = r13
            r4 = r14
            r5 = r11
            r0.m1870X(r1, r2, r3, r4, r5)
            boolean r0 = r10.m1899c()
            if (r0 != 0) goto L234
            boolean r0 = r10.m1898b()
            if (r0 == 0) goto L237
        L234:
            r0 = 1
            r7.f3099c = r0
        L237:
            boolean r0 = r7.f3100d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f3100d = r0
            int r8 = r8 + 1
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            goto L1c4
        L248:
            android.view.View[] r0 = r6.f3068H
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: i */
    public boolean mo1637i(androidx.recyclerview.widget.RecyclerView.C0558n r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.GridLayoutManager.C0537b
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: i0 */
    public void mo1638i0(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3075a
            r1.clear()
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3076b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: i1 */
    public void mo1639i1(androidx.recyclerview.widget.RecyclerView.C0564t r5, androidx.recyclerview.widget.RecyclerView.C0569y r6, androidx.recyclerview.widget.LinearLayoutManager.C0539a r7, int r8) {
            r4 = this;
            r4.m1627D1()
            int r0 = r6.m1930b()
            if (r0 <= 0) goto L40
            boolean r0 = r6.f3302g
            if (r0 != 0) goto L40
            r0 = 1
            if (r8 != r0) goto L12
            r8 = 1
            goto L13
        L12:
            r8 = 0
        L13:
            int r1 = r7.f3093b
            int r1 = r4.m1657y1(r5, r6, r1)
            if (r8 == 0) goto L2a
        L1b:
            if (r1 <= 0) goto L40
            int r8 = r7.f3093b
            if (r8 <= 0) goto L40
            int r8 = r8 + (-1)
            r7.f3093b = r8
            int r1 = r4.m1657y1(r5, r6, r8)
            goto L1b
        L2a:
            int r8 = r6.m1930b()
            int r8 = r8 - r0
            int r0 = r7.f3093b
        L31:
            if (r0 >= r8) goto L3e
            int r2 = r0 + 1
            int r3 = r4.m1657y1(r5, r6, r2)
            if (r3 <= r1) goto L3e
            r0 = r2
            r1 = r3
            goto L31
        L3e:
            r7.f3093b = r0
        L40:
            r4.m1652v1()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: j0 */
    public void mo1640j0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3075a
            r1.clear()
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3076b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: k0 */
    public void mo1641k0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3075a
            r1.clear()
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3076b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: l0 */
    public void mo1642l0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3075a
            r1.clear()
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            android.util.SparseIntArray r1 = r1.f3076b
            r1.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: m0 */
    public void mo1643m0(androidx.recyclerview.widget.RecyclerView.C0564t r7, androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r6 = this;
            boolean r0 = r8.f3302g
            if (r0 == 0) goto L2a
            int r0 = r6.m1891z()
            r1 = 0
        L9:
            if (r1 >= r0) goto L2a
            android.view.View r2 = r6.m1889y(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r2 = (androidx.recyclerview.widget.GridLayoutManager.C0537b) r2
            int r3 = r2.m1897a()
            android.util.SparseIntArray r4 = r6.f3069I
            int r5 = r2.f3074f
            r4.put(r3, r5)
            android.util.SparseIntArray r4 = r6.f3070J
            int r2 = r2.f3073e
            r4.put(r3, r2)
            int r1 = r1 + 1
            goto L9
        L2a:
            super.mo1643m0(r7, r8)
            android.util.SparseIntArray r7 = r6.f3069I
            r7.clear()
            android.util.SparseIntArray r7 = r6.f3070J
            r7.clear()
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: n */
    public int mo1644n(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1666Q0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: n0 */
    public void mo1645n0(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            r1 = 0
            r0.f3091z = r1
            r1 = -1
            r0.f3089x = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3090y = r1
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f3077A
            r1.m1710d()
            r1 = 0
            r0.f3065E = r1
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: o */
    public int mo1646o(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1667R0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: q */
    public int mo1647q(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1666Q0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: q1 */
    public void mo1648q1(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L12
            r2 = 0
            r0 = 0
            r1.mo1684e(r0)
            boolean r0 = r1.f3087v
            if (r0 != 0) goto Lc
            goto L11
        Lc:
            r1.f3087v = r2
            r1.m1890y0()
        L11:
            return
        L12:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "GridLayoutManager does not support stack from end. Consider using reverse layout"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: r */
    public int mo1649r(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1667R0(r1)
            return r1
    }

    /* renamed from: u1 */
    public final void m1650u1(int r8) {
            r7 = this;
            int[] r0 = r7.f3067G
            int r1 = r7.f3066F
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r0.length
            int r4 = r1 + 1
            if (r3 != r4) goto L12
            int r3 = r0.length
            int r3 = r3 - r2
            r3 = r0[r3]
            if (r3 == r8) goto L16
        L12:
            int r0 = r1 + 1
            int[] r0 = new int[r0]
        L16:
            r3 = 0
            r0[r3] = r3
            int r4 = r8 / r1
            int r8 = r8 % r1
            r5 = 0
        L1d:
            if (r2 > r1) goto L31
            int r3 = r3 + r8
            if (r3 <= 0) goto L2a
            int r6 = r1 - r3
            if (r6 >= r8) goto L2a
            int r6 = r4 + 1
            int r3 = r3 - r1
            goto L2b
        L2a:
            r6 = r4
        L2b:
            int r5 = r5 + r6
            r0[r2] = r5
            int r2 = r2 + 1
            goto L1d
        L31:
            r7.f3067G = r0
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: v */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1651v() {
            r3 = this;
            int r0 = r3.f3081p
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r1, r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: v1 */
    public final void m1652v1() {
            r2 = this;
            android.view.View[] r0 = r2.f3068H
            if (r0 == 0) goto L9
            int r0 = r0.length
            int r1 = r2.f3066F
            if (r0 == r1) goto Lf
        L9:
            int r0 = r2.f3066F
            android.view.View[] r0 = new android.view.View[r0]
            r2.f3068H = r0
        Lf:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: w */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1653w(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: w1 */
    public int m1654w1(int r4, int r5) {
            r3 = this;
            int r0 = r3.f3081p
            r1 = 1
            if (r0 != r1) goto L19
            boolean r0 = r3.m1688g1()
            if (r0 == 0) goto L19
            int[] r0 = r3.f3067G
            int r1 = r3.f3066F
            int r2 = r1 - r4
            r2 = r0[r2]
            int r1 = r1 - r4
            int r1 = r1 - r5
            r4 = r0[r1]
            int r2 = r2 - r4
            return r2
        L19:
            int[] r0 = r3.f3067G
            int r5 = r5 + r4
            r5 = r0[r5]
            r4 = r0[r4]
            int r5 = r5 - r4
            return r5
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: x */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1655x(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.GridLayoutManager$b r0 = new androidx.recyclerview.widget.GridLayoutManager$b
            r0.<init>(r2)
            return r0
    }

    /* renamed from: x1 */
    public final int m1656x1(androidx.recyclerview.widget.RecyclerView.C0564t r1, androidx.recyclerview.widget.RecyclerView.C0569y r2, int r3) {
            r0 = this;
            boolean r2 = r2.f3302g
            if (r2 != 0) goto Ld
            androidx.recyclerview.widget.GridLayoutManager$c r1 = r0.f3071K
            int r2 = r0.f3066F
            int r1 = r1.m1660a(r3, r2)
            return r1
        Ld:
            int r1 = r1.m1911c(r3)
            r2 = -1
            if (r1 != r2) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot find span size for pre layout position. "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "GridLayoutManager"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
        L2c:
            androidx.recyclerview.widget.GridLayoutManager$c r2 = r0.f3071K
            int r3 = r0.f3066F
            int r1 = r2.m1660a(r1, r3)
            return r1
    }

    /* renamed from: y1 */
    public final int m1657y1(androidx.recyclerview.widget.RecyclerView.C0564t r2, androidx.recyclerview.widget.RecyclerView.C0569y r3, int r4) {
            r1 = this;
            boolean r3 = r3.f3302g
            if (r3 != 0) goto Ld
            androidx.recyclerview.widget.GridLayoutManager$c r2 = r1.f3071K
            int r3 = r1.f3066F
            java.util.Objects.requireNonNull(r2)
            int r4 = r4 % r3
            return r4
        Ld:
            android.util.SparseIntArray r3 = r1.f3070J
            r0 = -1
            int r3 = r3.get(r4, r0)
            if (r3 == r0) goto L17
            return r3
        L17:
            int r2 = r2.m1911c(r4)
            if (r2 != r0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "GridLayoutManager"
            android.util.Log.w(r3, r2)
            r2 = 0
            return r2
        L35:
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r1.f3071K
            int r4 = r1.f3066F
            java.util.Objects.requireNonNull(r3)
            int r2 = r2 % r4
            return r2
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: z0 */
    public int mo1658z0(int r3, androidx.recyclerview.widget.RecyclerView.C0564t r4, androidx.recyclerview.widget.RecyclerView.C0569y r5) {
            r2 = this;
            r2.m1627D1()
            r2.m1652v1()
            int r0 = r2.f3081p
            r1 = 1
            if (r0 != r1) goto Ld
            r3 = 0
            goto L11
        Ld:
            int r3 = r2.m1697n1(r3, r4, r5)
        L11:
            return r3
    }

    /* renamed from: z1 */
    public final int m1659z1(androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, int r5) {
            r2 = this;
            boolean r4 = r4.f3302g
            r0 = 1
            if (r4 != 0) goto Lb
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r2.f3071K
            java.util.Objects.requireNonNull(r3)
            return r0
        Lb:
            android.util.SparseIntArray r4 = r2.f3069I
            r1 = -1
            int r4 = r4.get(r5, r1)
            if (r4 == r1) goto L15
            return r4
        L15:
            int r3 = r3.m1911c(r5)
            if (r3 != r1) goto L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "GridLayoutManager"
            android.util.Log.w(r4, r3)
            return r0
        L32:
            androidx.recyclerview.widget.GridLayoutManager$c r3 = r2.f3071K
            java.util.Objects.requireNonNull(r3)
            return r0
    }
}
