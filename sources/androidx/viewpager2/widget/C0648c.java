package androidx.viewpager2.widget;

/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes.dex */
public final class C0648c extends androidx.recyclerview.widget.RecyclerView.AbstractC0562r {

    /* renamed from: a */
    public androidx.viewpager2.widget.ViewPager2.AbstractC0639e f3772a;

    /* renamed from: b */
    public final androidx.viewpager2.widget.ViewPager2 f3773b;

    /* renamed from: c */
    public final androidx.recyclerview.widget.RecyclerView f3774c;

    /* renamed from: d */
    public final androidx.recyclerview.widget.LinearLayoutManager f3775d;

    /* renamed from: e */
    public int f3776e;

    /* renamed from: f */
    public int f3777f;

    /* renamed from: g */
    public androidx.viewpager2.widget.C0648c.a f3778g;

    /* renamed from: h */
    public int f3779h;

    /* renamed from: i */
    public int f3780i;

    /* renamed from: j */
    public boolean f3781j;

    /* renamed from: k */
    public boolean f3782k;

    /* renamed from: l */
    public boolean f3783l;

    /* renamed from: m */
    public boolean f3784m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    public static final class a {

        /* renamed from: a */
        public int f3785a;

        /* renamed from: b */
        public float f3786b;

        /* renamed from: c */
        public int f3787c;

        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m2195a() {
                r1 = this;
                r0 = -1
                r1.f3785a = r0
                r0 = 0
                r1.f3786b = r0
                r0 = 0
                r1.f3787c = r0
                return
        }
    }

    public C0648c(androidx.viewpager2.widget.ViewPager2 r1) {
            r0 = this;
            r0.<init>()
            r0.f3773b = r1
            androidx.recyclerview.widget.RecyclerView r1 = r1.f3742j0
            r0.f3774c = r1
            androidx.recyclerview.widget.RecyclerView$m r1 = r1.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0.f3775d = r1
            androidx.viewpager2.widget.c$a r1 = new androidx.viewpager2.widget.c$a
            r1.<init>()
            r0.f3778g = r1
            r0.m2193e()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
    /* renamed from: a */
    public void mo1905a(androidx.recyclerview.widget.RecyclerView r7, int r8) {
            r6 = this;
            int r7 = r6.f3776e
            r0 = 1
            r1 = 0
            r2 = -1
            if (r7 != r0) goto Lb
            int r3 = r6.f3777f
            if (r3 == r0) goto L2a
        Lb:
            if (r8 != r0) goto L2a
            r6.f3784m = r1
            r6.f3776e = r0
            int r7 = r6.f3780i
            if (r7 == r2) goto L1a
            r6.f3779h = r7
            r6.f3780i = r2
            goto L26
        L1a:
            int r7 = r6.f3779h
            if (r7 != r2) goto L26
            androidx.recyclerview.widget.LinearLayoutManager r7 = r6.f3775d
            int r7 = r7.m1674X0()
            r6.f3779h = r7
        L26:
            r6.m2192d(r0)
            return
        L2a:
            r3 = 4
            if (r7 == r0) goto L32
            if (r7 != r3) goto L30
            goto L32
        L30:
            r4 = 0
            goto L33
        L32:
            r4 = 1
        L33:
            r5 = 2
            if (r4 == 0) goto L42
            if (r8 != r5) goto L42
            boolean r7 = r6.f3782k
            if (r7 == 0) goto L41
            r6.m2192d(r5)
            r6.f3781j = r0
        L41:
            return
        L42:
            if (r7 == r0) goto L49
            if (r7 != r3) goto L47
            goto L49
        L47:
            r7 = 0
            goto L4a
        L49:
            r7 = 1
        L4a:
            if (r7 == 0) goto L7d
            if (r8 != 0) goto L7d
            r6.m2194f()
            boolean r7 = r6.f3782k
            if (r7 != 0) goto L64
            androidx.viewpager2.widget.c$a r7 = r6.f3778g
            int r7 = r7.f3785a
            if (r7 == r2) goto L75
            r3 = 0
            androidx.viewpager2.widget.ViewPager2$e r4 = r6.f3772a
            if (r4 == 0) goto L75
            r4.mo2185b(r7, r3, r1)
            goto L75
        L64:
            androidx.viewpager2.widget.c$a r7 = r6.f3778g
            int r3 = r7.f3787c
            if (r3 != 0) goto L74
            int r3 = r6.f3779h
            int r7 = r7.f3785a
            if (r3 == r7) goto L75
            r6.m2191c(r7)
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 == 0) goto L7d
            r6.m2192d(r1)
            r6.m2193e()
        L7d:
            int r7 = r6.f3776e
            if (r7 != r5) goto La2
            if (r8 != 0) goto La2
            boolean r7 = r6.f3783l
            if (r7 == 0) goto La2
            r6.m2194f()
            androidx.viewpager2.widget.c$a r7 = r6.f3778g
            int r8 = r7.f3787c
            if (r8 != 0) goto La2
            int r8 = r6.f3780i
            int r7 = r7.f3785a
            if (r8 == r7) goto L9c
            if (r7 != r2) goto L99
            r7 = 0
        L99:
            r6.m2191c(r7)
        L9c:
            r6.m2192d(r1)
            r6.m2193e()
        La2:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562r
    /* renamed from: b */
    public void mo1906b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
            r4 = this;
            r5 = 1
            r4.f3782k = r5
            r4.m2194f()
            boolean r0 = r4.f3781j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L3a
            r4.f3781j = r1
            if (r7 > 0) goto L22
            if (r7 != 0) goto L20
            if (r6 >= 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f3773b
            boolean r7 = r7.m2177a()
            if (r6 != r7) goto L20
            goto L22
        L20:
            r6 = 0
            goto L23
        L22:
            r6 = 1
        L23:
            if (r6 == 0) goto L2f
            androidx.viewpager2.widget.c$a r6 = r4.f3778g
            int r7 = r6.f3787c
            if (r7 == 0) goto L2f
            int r6 = r6.f3785a
            int r6 = r6 + r5
            goto L33
        L2f:
            androidx.viewpager2.widget.c$a r6 = r4.f3778g
            int r6 = r6.f3785a
        L33:
            r4.f3780i = r6
            int r7 = r4.f3779h
            if (r7 == r6) goto L48
            goto L45
        L3a:
            int r6 = r4.f3776e
            if (r6 != 0) goto L48
            androidx.viewpager2.widget.c$a r6 = r4.f3778g
            int r6 = r6.f3785a
            if (r6 != r2) goto L45
            r6 = 0
        L45:
            r4.m2191c(r6)
        L48:
            androidx.viewpager2.widget.c$a r6 = r4.f3778g
            int r7 = r6.f3785a
            if (r7 != r2) goto L4f
            r7 = 0
        L4f:
            float r0 = r6.f3786b
            int r6 = r6.f3787c
            androidx.viewpager2.widget.ViewPager2$e r3 = r4.f3772a
            if (r3 == 0) goto L5a
            r3.mo2185b(r7, r0, r6)
        L5a:
            androidx.viewpager2.widget.c$a r6 = r4.f3778g
            int r7 = r6.f3785a
            int r0 = r4.f3780i
            if (r7 == r0) goto L64
            if (r0 != r2) goto L72
        L64:
            int r6 = r6.f3787c
            if (r6 != 0) goto L72
            int r6 = r4.f3777f
            if (r6 == r5) goto L72
            r4.m2192d(r1)
            r4.m2193e()
        L72:
            return
    }

    /* renamed from: c */
    public final void m2191c(int r2) {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$e r0 = r1.f3772a
            if (r0 == 0) goto L7
            r0.mo2186c(r2)
        L7:
            return
    }

    /* renamed from: d */
    public final void m2192d(int r3) {
            r2 = this;
            int r0 = r2.f3776e
            r1 = 3
            if (r0 != r1) goto La
            int r0 = r2.f3777f
            if (r0 != 0) goto La
            return
        La:
            int r0 = r2.f3777f
            if (r0 != r3) goto Lf
            return
        Lf:
            r2.f3777f = r3
            androidx.viewpager2.widget.ViewPager2$e r0 = r2.f3772a
            if (r0 == 0) goto L18
            r0.mo2184a(r3)
        L18:
            return
    }

    /* renamed from: e */
    public final void m2193e() {
            r2 = this;
            r0 = 0
            r2.f3776e = r0
            r2.f3777f = r0
            androidx.viewpager2.widget.c$a r1 = r2.f3778g
            r1.m2195a()
            r1 = -1
            r2.f3779h = r1
            r2.f3780i = r1
            r2.f3781j = r0
            r2.f3782k = r0
            r2.f3784m = r0
            r2.f3783l = r0
            return
    }

    /* renamed from: f */
    public final void m2194f() {
            r13 = this;
            androidx.viewpager2.widget.c$a r0 = r13.f3778g
            androidx.recyclerview.widget.LinearLayoutManager r1 = r13.f3775d
            int r1 = r1.m1674X0()
            r0.f3785a = r1
            r2 = -1
            if (r1 != r2) goto L11
            r0.m2195a()
            return
        L11:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f3775d
            android.view.View r1 = r2.mo1706u(r1)
            if (r1 != 0) goto L1d
            r0.m2195a()
            return
        L1d:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f3775d
            java.util.Objects.requireNonNull(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r2 = (androidx.recyclerview.widget.RecyclerView.C0558n) r2
            android.graphics.Rect r2 = r2.f3262b
            int r2 = r2.left
            androidx.recyclerview.widget.LinearLayoutManager r3 = r13.f3775d
            java.util.Objects.requireNonNull(r3)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r3 = (androidx.recyclerview.widget.RecyclerView.C0558n) r3
            android.graphics.Rect r3 = r3.f3262b
            int r3 = r3.right
            androidx.recyclerview.widget.LinearLayoutManager r4 = r13.f3775d
            java.util.Objects.requireNonNull(r4)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r4 = (androidx.recyclerview.widget.RecyclerView.C0558n) r4
            android.graphics.Rect r4 = r4.f3262b
            int r4 = r4.top
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f3775d
            java.util.Objects.requireNonNull(r5)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r5 = (androidx.recyclerview.widget.RecyclerView.C0558n) r5
            android.graphics.Rect r5 = r5.f3262b
            int r5 = r5.bottom
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L6f
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r7 = r6.leftMargin
            int r2 = r2 + r7
            int r7 = r6.rightMargin
            int r3 = r3 + r7
            int r7 = r6.topMargin
            int r4 = r4 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
        L6f:
            int r6 = r1.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r5 = r1.getWidth()
            int r5 = r5 + r2
            int r5 = r5 + r3
            androidx.recyclerview.widget.LinearLayoutManager r3 = r13.f3775d
            int r3 = r3.f3081p
            r7 = 0
            r8 = 1
            if (r3 != 0) goto L85
            r3 = 1
            goto L86
        L85:
            r3 = 0
        L86:
            if (r3 == 0) goto L9f
            int r1 = r1.getLeft()
            int r1 = r1 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r13.f3774c
            int r2 = r2.getPaddingLeft()
            int r1 = r1 - r2
            androidx.viewpager2.widget.ViewPager2 r2 = r13.f3773b
            boolean r2 = r2.m2177a()
            if (r2 == 0) goto L9d
            int r1 = -r1
        L9d:
            r6 = r5
            goto Lab
        L9f:
            int r1 = r1.getTop()
            int r1 = r1 - r4
            androidx.recyclerview.widget.RecyclerView r2 = r13.f3774c
            int r2 = r2.getPaddingTop()
            int r1 = r1 - r2
        Lab:
            int r1 = -r1
            r0.f3787c = r1
            if (r1 >= 0) goto L1a3
            z1.b r1 = new z1.b
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f3775d
            r1.<init>(r2)
            int r2 = r2.m1891z()
            if (r2 != 0) goto Lbf
            goto L154
        Lbf:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r1.f27798a
            int r3 = r3.f3081p
            if (r3 != 0) goto Lc7
            r3 = 1
            goto Lc8
        Lc7:
            r3 = 0
        Lc8:
            r4 = 2
            int[] r5 = new int[r4]
            r5[r8] = r4
            r5[r7] = r2
            java.lang.Class<int> r4 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
            int[][] r4 = (int[][]) r4
            r5 = 0
        Ld8:
            if (r5 >= r2) goto L122
            androidx.recyclerview.widget.LinearLayoutManager r6 = r1.f27798a
            android.view.View r6 = r6.m1889y(r5)
            if (r6 == 0) goto L11a
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto Led
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            goto Lef
        Led:
            android.view.ViewGroup$MarginLayoutParams r9 = p444z1.C7225b.f27797b
        Lef:
            r10 = r4[r5]
            if (r3 == 0) goto Lfa
            int r11 = r6.getLeft()
            int r12 = r9.leftMargin
            goto L100
        Lfa:
            int r11 = r6.getTop()
            int r12 = r9.topMargin
        L100:
            int r11 = r11 - r12
            r10[r7] = r11
            r10 = r4[r5]
            if (r3 == 0) goto L10e
            int r6 = r6.getRight()
            int r9 = r9.rightMargin
            goto L114
        L10e:
            int r6 = r6.getBottom()
            int r9 = r9.bottomMargin
        L114:
            int r6 = r6 + r9
            r10[r8] = r6
            int r5 = r5 + 1
            goto Ld8
        L11a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L122:
            z1.a r3 = new z1.a
            r3.<init>(r1)
            java.util.Arrays.sort(r4, r3)
            r3 = 1
        L12b:
            if (r3 >= r2) goto L13d
            int r5 = r3 + (-1)
            r5 = r4[r5]
            r5 = r5[r8]
            r6 = r4[r3]
            r6 = r6[r7]
            if (r5 == r6) goto L13a
            goto L156
        L13a:
            int r3 = r3 + 1
            goto L12b
        L13d:
            r3 = r4[r7]
            r3 = r3[r8]
            r5 = r4[r7]
            r5 = r5[r7]
            int r3 = r3 - r5
            r5 = r4[r7]
            r5 = r5[r7]
            if (r5 > 0) goto L156
            int r2 = r2 - r8
            r2 = r4[r2]
            r2 = r2[r8]
            if (r2 >= r3) goto L154
            goto L156
        L154:
            r2 = 1
            goto L157
        L156:
            r2 = 0
        L157:
            if (r2 == 0) goto L161
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f27798a
            int r2 = r2.m1891z()
            if (r2 > r8) goto L180
        L161:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f27798a
            int r2 = r2.m1891z()
            r3 = 0
        L168:
            if (r3 >= r2) goto L17b
            androidx.recyclerview.widget.LinearLayoutManager r4 = r1.f27798a
            android.view.View r4 = r4.m1889y(r3)
            boolean r4 = p444z1.C7225b.m14287a(r4)
            if (r4 == 0) goto L178
            r1 = 1
            goto L17c
        L178:
            int r3 = r3 + 1
            goto L168
        L17b:
            r1 = 0
        L17c:
            if (r1 == 0) goto L180
            r1 = 1
            goto L181
        L180:
            r1 = 0
        L181:
            if (r1 == 0) goto L18b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L18b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r0 = r0.f3787c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r7] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L1a3:
            if (r6 != 0) goto L1a7
            r1 = 0
            goto L1aa
        L1a7:
            float r1 = (float) r1
            float r2 = (float) r6
            float r1 = r1 / r2
        L1aa:
            r0.f3786b = r1
            return
    }
}
