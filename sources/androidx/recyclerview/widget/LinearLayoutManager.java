package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class LinearLayoutManager extends androidx.recyclerview.widget.RecyclerView.AbstractC0557m implements androidx.recyclerview.widget.C0609t.h, androidx.recyclerview.widget.RecyclerView.AbstractC0568x.b {

    /* renamed from: A */
    public final androidx.recyclerview.widget.LinearLayoutManager.C0539a f3077A;

    /* renamed from: B */
    public final androidx.recyclerview.widget.LinearLayoutManager.C0540b f3078B;

    /* renamed from: C */
    public int f3079C;

    /* renamed from: D */
    public int[] f3080D;

    /* renamed from: p */
    public int f3081p;

    /* renamed from: q */
    public androidx.recyclerview.widget.LinearLayoutManager.C0541c f3082q;

    /* renamed from: r */
    public androidx.recyclerview.widget.AbstractC0582c0 f3083r;

    /* renamed from: s */
    public boolean f3084s;

    /* renamed from: t */
    public boolean f3085t;

    /* renamed from: u */
    public boolean f3086u;

    /* renamed from: v */
    public boolean f3087v;

    /* renamed from: w */
    public boolean f3088w;

    /* renamed from: x */
    public int f3089x;

    /* renamed from: y */
    public int f3090y;

    /* renamed from: z */
    public androidx.recyclerview.widget.LinearLayoutManager.C0542d f3091z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0539a {

        /* renamed from: a */
        public androidx.recyclerview.widget.AbstractC0582c0 f3092a;

        /* renamed from: b */
        public int f3093b;

        /* renamed from: c */
        public int f3094c;

        /* renamed from: d */
        public boolean f3095d;

        /* renamed from: e */
        public boolean f3096e;

        public C0539a() {
                r0 = this;
                r0.<init>()
                r0.m1710d()
                return
        }

        /* renamed from: a */
        public void m1707a() {
                r1 = this;
                boolean r0 = r1.f3095d
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.c0 r0 = r1.f3092a
                int r0 = r0.mo2002g()
                goto L11
            Lb:
                androidx.recyclerview.widget.c0 r0 = r1.f3092a
                int r0 = r0.mo2006k()
            L11:
                r1.f3094c = r0
                return
        }

        /* renamed from: b */
        public void m1708b(android.view.View r2, int r3) {
                r1 = this;
                boolean r0 = r1.f3095d
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.c0 r0 = r1.f3092a
                int r2 = r0.mo1997b(r2)
                androidx.recyclerview.widget.c0 r0 = r1.f3092a
                int r0 = r0.m2016m()
                int r0 = r0 + r2
                r1.f3094c = r0
                goto L1c
            L14:
                androidx.recyclerview.widget.c0 r0 = r1.f3092a
                int r2 = r0.mo2000e(r2)
                r1.f3094c = r2
            L1c:
                r1.f3093b = r3
                return
        }

        /* renamed from: c */
        public void m1709c(android.view.View r5, int r6) {
                r4 = this;
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r0 = r0.m2016m()
                if (r0 < 0) goto Lc
                r4.m1708b(r5, r6)
                return
            Lc:
                r4.f3093b = r6
                boolean r6 = r4.f3095d
                r1 = 0
                if (r6 == 0) goto L53
                androidx.recyclerview.widget.c0 r6 = r4.f3092a
                int r6 = r6.mo2002g()
                int r6 = r6 - r0
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r0 = r0.mo1997b(r5)
                int r6 = r6 - r0
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r0 = r0.mo2002g()
                int r0 = r0 - r6
                r4.f3094c = r0
                if (r6 <= 0) goto L92
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r0 = r0.mo1998c(r5)
                int r2 = r4.f3094c
                int r2 = r2 - r0
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r0 = r0.mo2006k()
                androidx.recyclerview.widget.c0 r3 = r4.f3092a
                int r5 = r3.mo2000e(r5)
                int r5 = r5 - r0
                int r5 = java.lang.Math.min(r5, r1)
                int r5 = r5 + r0
                int r2 = r2 - r5
                if (r2 >= 0) goto L92
                int r5 = r4.f3094c
                int r0 = -r2
                int r6 = java.lang.Math.min(r6, r0)
                int r6 = r6 + r5
                goto L90
            L53:
                androidx.recyclerview.widget.c0 r6 = r4.f3092a
                int r6 = r6.mo2000e(r5)
                androidx.recyclerview.widget.c0 r2 = r4.f3092a
                int r2 = r2.mo2006k()
                int r2 = r6 - r2
                r4.f3094c = r6
                if (r2 <= 0) goto L92
                androidx.recyclerview.widget.c0 r3 = r4.f3092a
                int r3 = r3.mo1998c(r5)
                int r3 = r3 + r6
                androidx.recyclerview.widget.c0 r6 = r4.f3092a
                int r6 = r6.mo2002g()
                int r6 = r6 - r0
                androidx.recyclerview.widget.c0 r0 = r4.f3092a
                int r5 = r0.mo1997b(r5)
                int r6 = r6 - r5
                androidx.recyclerview.widget.c0 r5 = r4.f3092a
                int r5 = r5.mo2002g()
                int r6 = java.lang.Math.min(r1, r6)
                int r5 = r5 - r6
                int r5 = r5 - r3
                if (r5 >= 0) goto L92
                int r6 = r4.f3094c
                int r5 = -r5
                int r5 = java.lang.Math.min(r2, r5)
                int r6 = r6 - r5
            L90:
                r4.f3094c = r6
            L92:
                return
        }

        /* renamed from: d */
        public void m1710d() {
                r1 = this;
                r0 = -1
                r1.f3093b = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.f3094c = r0
                r0 = 0
                r1.f3095d = r0
                r1.f3096e = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "AnchorInfo{mPosition="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                int r1 = r2.f3093b
                r0.append(r1)
                java.lang.String r1 = ", mCoordinate="
                r0.append(r1)
                int r1 = r2.f3094c
                r0.append(r1)
                java.lang.String r1 = ", mLayoutFromEnd="
                r0.append(r1)
                boolean r1 = r2.f3095d
                r0.append(r1)
                java.lang.String r1 = ", mValid="
                r0.append(r1)
                boolean r1 = r2.f3096e
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0540b {

        /* renamed from: a */
        public int f3097a;

        /* renamed from: b */
        public boolean f3098b;

        /* renamed from: c */
        public boolean f3099c;

        /* renamed from: d */
        public boolean f3100d;

        public C0540b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0541c {

        /* renamed from: a */
        public boolean f3101a;

        /* renamed from: b */
        public int f3102b;

        /* renamed from: c */
        public int f3103c;

        /* renamed from: d */
        public int f3104d;

        /* renamed from: e */
        public int f3105e;

        /* renamed from: f */
        public int f3106f;

        /* renamed from: g */
        public int f3107g;

        /* renamed from: h */
        public int f3108h;

        /* renamed from: i */
        public int f3109i;

        /* renamed from: j */
        public int f3110j;

        /* renamed from: k */
        public java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> f3111k;

        /* renamed from: l */
        public boolean f3112l;

        public C0541c() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f3101a = r0
                r0 = 0
                r1.f3108h = r0
                r1.f3109i = r0
                r0 = 0
                r1.f3111k = r0
                return
        }

        /* renamed from: a */
        public void m1711a(android.view.View r8) {
                r7 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r0 = r7.f3111k
                int r0 = r0.size()
                r1 = 0
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
            Lb:
                if (r3 >= r0) goto L3e
                java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r4 = r7.f3111k
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r4
                android.view.View r4 = r4.f3208a
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r5 = (androidx.recyclerview.widget.RecyclerView.C0558n) r5
                if (r4 == r8) goto L3b
                boolean r6 = r5.m1899c()
                if (r6 == 0) goto L26
                goto L3b
            L26:
                int r5 = r5.m1897a()
                int r6 = r7.f3104d
                int r5 = r5 - r6
                int r6 = r7.f3105e
                int r5 = r5 * r6
                if (r5 >= 0) goto L34
                goto L3b
            L34:
                if (r5 >= r2) goto L3b
                r1 = r4
                if (r5 != 0) goto L3a
                goto L3e
            L3a:
                r2 = r5
            L3b:
                int r3 = r3 + 1
                goto Lb
            L3e:
                if (r1 != 0) goto L42
                r8 = -1
                goto L4c
            L42:
                android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r8 = (androidx.recyclerview.widget.RecyclerView.C0558n) r8
                int r8 = r8.m1897a()
            L4c:
                r7.f3104d = r8
                return
        }

        /* renamed from: b */
        public boolean m1712b(androidx.recyclerview.widget.RecyclerView.C0569y r2) {
                r1 = this;
                int r0 = r1.f3104d
                if (r0 < 0) goto Lc
                int r2 = r2.m1930b()
                if (r0 >= r2) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        /* renamed from: c */
        public android.view.View m1713c(androidx.recyclerview.widget.RecyclerView.C0564t r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f3111k
                r1 = 0
                if (r0 == 0) goto L33
                int r5 = r0.size()
            L9:
                if (r1 >= r5) goto L31
                java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r0 = r4.f3111k
                java.lang.Object r0 = r0.get(r1)
                androidx.recyclerview.widget.RecyclerView$b0 r0 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r0
                android.view.View r0 = r0.f3208a
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$n r2 = (androidx.recyclerview.widget.RecyclerView.C0558n) r2
                boolean r3 = r2.m1899c()
                if (r3 == 0) goto L22
                goto L2e
            L22:
                int r3 = r4.f3104d
                int r2 = r2.m1897a()
                if (r3 != r2) goto L2e
                r4.m1711a(r0)
                goto L32
            L2e:
                int r1 = r1 + 1
                goto L9
            L31:
                r0 = 0
            L32:
                return r0
            L33:
                int r0 = r4.f3104d
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$b0 r5 = r5.m1918j(r0, r1, r2)
                android.view.View r5 = r5.f3208a
                int r0 = r4.f3104d
                int r1 = r4.f3105e
                int r0 = r0 + r1
                r4.f3104d = r0
                return r5
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0542d implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C0542d> CREATOR = null;

        /* renamed from: Y */
        public int f3113Y;

        /* renamed from: Z */
        public int f3114Z;

        /* renamed from: a0 */
        public boolean f3115a0;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public class a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.LinearLayoutManager.C0542d> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.LinearLayoutManager.C0542d createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.LinearLayoutManager.C0542d[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.LinearLayoutManager$d[] r1 = new androidx.recyclerview.widget.LinearLayoutManager.C0542d[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.LinearLayoutManager$d$a r0 = new androidx.recyclerview.widget.LinearLayoutManager$d$a
                r0.<init>()
                androidx.recyclerview.widget.LinearLayoutManager.C0542d.CREATOR = r0
                return
        }

        public C0542d() {
                r0 = this;
                r0.<init>()
                return
        }

        public C0542d(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.f3113Y = r0
                int r0 = r2.readInt()
                r1.f3114Z = r0
                int r2 = r2.readInt()
                r0 = 1
                if (r2 != r0) goto L17
                goto L18
            L17:
                r0 = 0
            L18:
                r1.f3115a0 = r0
                return
        }

        public C0542d(androidx.recyclerview.widget.LinearLayoutManager.C0542d r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f3113Y
                r1.f3113Y = r0
                int r0 = r2.f3114Z
                r1.f3114Z = r0
                boolean r2 = r2.f3115a0
                r1.f3115a0 = r2
                return
        }

        /* renamed from: a */
        public boolean m1714a() {
                r1 = this;
                int r0 = r1.f3113Y
                if (r0 < 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.f3113Y
                r1.writeInt(r2)
                int r2 = r0.f3114Z
                r1.writeInt(r2)
                boolean r2 = r0.f3115a0
                r1.writeInt(r2)
                return
        }
    }

    public LinearLayoutManager(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f3081p = r0
            r1 = 0
            r2.f3085t = r1
            r2.f3086u = r1
            r2.f3087v = r1
            r2.f3088w = r0
            r0 = -1
            r2.f3089x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f3090y = r0
            r0 = 0
            r2.f3091z = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r1.<init>()
            r2.f3077A = r1
            androidx.recyclerview.widget.LinearLayoutManager$b r1 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r1.<init>()
            r2.f3078B = r1
            r1 = 2
            r2.f3079C = r1
            int[] r1 = new int[r1]
            r2.f3080D = r1
            r2.m1702p1(r3)
            r2.mo1684e(r0)
            boolean r3 = r2.f3085t
            if (r4 != r3) goto L39
            goto L3e
        L39:
            r2.f3085t = r4
            r2.m1890y0()
        L3e:
            return
    }

    public LinearLayoutManager(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutManager(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f3081p = r0
            r1 = 0
            r2.f3085t = r1
            r2.f3086u = r1
            r2.f3087v = r1
            r2.f3088w = r0
            r0 = -1
            r2.f3089x = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f3090y = r0
            r0 = 0
            r2.f3091z = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = new androidx.recyclerview.widget.LinearLayoutManager$a
            r1.<init>()
            r2.f3077A = r1
            androidx.recyclerview.widget.LinearLayoutManager$b r1 = new androidx.recyclerview.widget.LinearLayoutManager$b
            r1.<init>()
            r2.f3078B = r1
            r1 = 2
            r2.f3079C = r1
            int[] r1 = new int[r1]
            r2.f3080D = r1
            androidx.recyclerview.widget.RecyclerView$m$d r3 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1843S(r3, r4, r5, r6)
            int r4 = r3.f3257a
            r2.m1702p1(r4)
            boolean r4 = r3.f3259c
            r2.mo1684e(r0)
            boolean r5 = r2.f3085t
            if (r4 != r5) goto L41
            goto L46
        L41:
            r2.f3085t = r4
            r2.m1890y0()
        L46:
            boolean r3 = r3.f3260d
            r2.mo1648q1(r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: A0 */
    public void mo1661A0(int r2) {
            r1 = this;
            r1.f3089x = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f3090y = r2
            androidx.recyclerview.widget.LinearLayoutManager$d r2 = r1.f3091z
            if (r2 == 0) goto Ld
            r0 = -1
            r2.f3113Y = r0
        Ld:
            r1.m1890y0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: B0 */
    public int mo1624B0(int r2, androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4) {
            r1 = this;
            int r0 = r1.f3081p
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.m1697n1(r2, r3, r4)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: I0 */
    public boolean mo1662I0() {
            r6 = this;
            int r0 = r6.f3252m
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L2c
            int r0 = r6.f3251l
            if (r0 == r1) goto L2c
            int r0 = r6.m1891z()
            r1 = 0
        L11:
            if (r1 >= r0) goto L28
            android.view.View r4 = r6.m1889y(r1)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r5 = r4.width
            if (r5 >= 0) goto L25
            int r4 = r4.height
            if (r4 >= 0) goto L25
            r0 = 1
            goto L29
        L25:
            int r1 = r1 + 1
            goto L11
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: K0 */
    public void mo1663K0(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C0569y r2, int r3) {
            r0 = this;
            androidx.recyclerview.widget.w r2 = new androidx.recyclerview.widget.w
            android.content.Context r1 = r1.getContext()
            r2.<init>(r1)
            r2.f3281a = r3
            r0.m1862L0(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: M0 */
    public boolean mo1629M0() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r2.f3091z
            if (r0 != 0) goto Lc
            boolean r0 = r2.f3084s
            boolean r1 = r2.f3087v
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    /* renamed from: N0 */
    public void mo1664N0(androidx.recyclerview.widget.RecyclerView.C0569y r5, int[] r6) {
            r4 = this;
            int r5 = r5.f3296a
            r0 = 1
            r1 = -1
            r2 = 0
            if (r5 == r1) goto L9
            r5 = 1
            goto La
        L9:
            r5 = 0
        La:
            if (r5 == 0) goto L13
            androidx.recyclerview.widget.c0 r5 = r4.f3083r
            int r5 = r5.mo2007l()
            goto L14
        L13:
            r5 = 0
        L14:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r4.f3082q
            int r3 = r3.f3106f
            if (r3 != r1) goto L1c
            r1 = 0
            goto L1e
        L1c:
            r1 = r5
            r5 = 0
        L1e:
            r6[r2] = r5
            r6[r0] = r1
            return
    }

    /* renamed from: O0 */
    public void mo1630O0(androidx.recyclerview.widget.RecyclerView.C0569y r2, androidx.recyclerview.widget.LinearLayoutManager.C0541c r3, androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c r4) {
            r1 = this;
            int r0 = r3.f3104d
            if (r0 < 0) goto L16
            int r2 = r2.m1930b()
            if (r0 >= r2) goto L16
            r2 = 0
            int r3 = r3.f3107g
            int r2 = java.lang.Math.max(r2, r3)
            androidx.recyclerview.widget.r$b r4 = (androidx.recyclerview.widget.RunnableC0607r.b) r4
            r4.m2114a(r0, r2)
        L16:
            return
    }

    /* renamed from: P0 */
    public final int m1665P0(androidx.recyclerview.widget.RecyclerView.C0569y r7) {
            r6 = this;
            int r0 = r6.m1891z()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.m1669T0()
            androidx.recyclerview.widget.c0 r1 = r6.f3083r
            boolean r0 = r6.f3088w
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.m1673W0(r0, r2)
            boolean r0 = r6.f3088w
            r0 = r0 ^ r2
            android.view.View r4 = r6.m1672V0(r0, r2)
            boolean r5 = r6.f3088w
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0594i0.m2078a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: Q0 */
    public final int m1666Q0(androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r7 = this;
            int r0 = r7.m1891z()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            r7.m1669T0()
            androidx.recyclerview.widget.c0 r1 = r7.f3083r
            boolean r0 = r7.f3088w
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r7.m1673W0(r0, r2)
            boolean r0 = r7.f3088w
            r0 = r0 ^ r2
            android.view.View r4 = r7.m1672V0(r0, r2)
            boolean r5 = r7.f3088w
            boolean r6 = r7.f3086u
            r0 = r8
            r2 = r3
            r3 = r4
            r4 = r7
            int r8 = androidx.recyclerview.widget.C0594i0.m2079b(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: R0 */
    public final int m1667R0(androidx.recyclerview.widget.RecyclerView.C0569y r7) {
            r6 = this;
            int r0 = r6.m1891z()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r6.m1669T0()
            androidx.recyclerview.widget.c0 r1 = r6.f3083r
            boolean r0 = r6.f3088w
            r2 = 1
            r0 = r0 ^ r2
            android.view.View r3 = r6.m1673W0(r0, r2)
            boolean r0 = r6.f3088w
            r0 = r0 ^ r2
            android.view.View r4 = r6.m1672V0(r0, r2)
            boolean r5 = r6.f3088w
            r0 = r7
            r2 = r3
            r3 = r4
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0594i0.m2080c(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: S0 */
    public int m1668S0(int r5) {
            r4 = this;
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L47
            r2 = 2
            if (r5 == r2) goto L3a
            r2 = 17
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r2) goto L32
            r2 = 33
            if (r5 == r2) goto L2a
            r0 = 66
            if (r5 == r0) goto L22
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L1a
            return r3
        L1a:
            int r5 = r4.f3081p
            if (r5 != r1) goto L1f
            goto L21
        L1f:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L21:
            return r1
        L22:
            int r5 = r4.f3081p
            if (r5 != 0) goto L27
            goto L29
        L27:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L29:
            return r1
        L2a:
            int r5 = r4.f3081p
            if (r5 != r1) goto L2f
            goto L31
        L2f:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L31:
            return r0
        L32:
            int r5 = r4.f3081p
            if (r5 != 0) goto L37
            goto L39
        L37:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L39:
            return r0
        L3a:
            int r5 = r4.f3081p
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r4.m1688g1()
            if (r5 == 0) goto L46
            return r0
        L46:
            return r1
        L47:
            int r5 = r4.f3081p
            if (r5 != r1) goto L4c
            return r0
        L4c:
            boolean r5 = r4.m1688g1()
            if (r5 == 0) goto L53
            return r1
        L53:
            return r0
    }

    /* renamed from: T0 */
    public void m1669T0() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r1.f3082q
            if (r0 != 0) goto Lb
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = new androidx.recyclerview.widget.LinearLayoutManager$c
            r0.<init>()
            r1.f3082q = r0
        Lb:
            return
    }

    /* renamed from: U0 */
    public int m1670U0(androidx.recyclerview.widget.RecyclerView.C0564t r8, androidx.recyclerview.widget.LinearLayoutManager.C0541c r9, androidx.recyclerview.widget.RecyclerView.C0569y r10, boolean r11) {
            r7 = this;
            int r0 = r9.f3103c
            int r1 = r9.f3107g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L10
            if (r0 >= 0) goto Ld
            int r1 = r1 + r0
            r9.f3107g = r1
        Ld:
            r7.m1690j1(r8, r9)
        L10:
            int r1 = r9.f3103c
            int r3 = r9.f3108h
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$b r3 = r7.f3078B
        L17:
            boolean r4 = r9.f3112l
            if (r4 != 0) goto L1d
            if (r1 <= 0) goto L68
        L1d:
            boolean r4 = r9.m1712b(r10)
            if (r4 == 0) goto L68
            r4 = 0
            r3.f3097a = r4
            r3.f3098b = r4
            r3.f3099c = r4
            r3.f3100d = r4
            r7.mo1636h1(r8, r10, r9, r3)
            boolean r4 = r3.f3098b
            if (r4 == 0) goto L34
            goto L68
        L34:
            int r4 = r9.f3102b
            int r5 = r3.f3097a
            int r6 = r9.f3106f
            int r6 = r6 * r5
            int r6 = r6 + r4
            r9.f3102b = r6
            boolean r4 = r3.f3099c
            if (r4 == 0) goto L4b
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r4 = r9.f3111k
            if (r4 != 0) goto L4b
            boolean r4 = r10.f3302g
            if (r4 != 0) goto L51
        L4b:
            int r4 = r9.f3103c
            int r4 = r4 - r5
            r9.f3103c = r4
            int r1 = r1 - r5
        L51:
            int r4 = r9.f3107g
            if (r4 == r2) goto L62
            int r4 = r4 + r5
            r9.f3107g = r4
            int r5 = r9.f3103c
            if (r5 >= 0) goto L5f
            int r4 = r4 + r5
            r9.f3107g = r4
        L5f:
            r7.m1690j1(r8, r9)
        L62:
            if (r11 == 0) goto L17
            boolean r4 = r3.f3100d
            if (r4 == 0) goto L17
        L68:
            int r8 = r9.f3103c
            int r0 = r0 - r8
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: V */
    public boolean mo1671V() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: V0 */
    public android.view.View m1672V0(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f3086u
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.m1891z()
        L9:
            android.view.View r3 = r2.m1678a1(r0, r1, r3, r4)
            return r3
        Le:
            int r0 = r2.m1891z()
            int r0 = r0 + (-1)
            r1 = -1
            goto L9
    }

    /* renamed from: W0 */
    public android.view.View m1673W0(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = r2.f3086u
            if (r0 == 0) goto L10
            int r0 = r2.m1891z()
            int r0 = r0 + (-1)
            r1 = -1
        Lb:
            android.view.View r3 = r2.m1678a1(r0, r1, r3, r4)
            return r3
        L10:
            r0 = 0
            int r1 = r2.m1891z()
            goto Lb
    }

    /* renamed from: X0 */
    public int m1674X0() {
            r3 = this;
            int r0 = r3.m1891z()
            r1 = 0
            r2 = 1
            android.view.View r0 = r3.m1678a1(r1, r0, r1, r2)
            if (r0 != 0) goto Le
            r0 = -1
            goto L12
        Le:
            int r0 = r3.m1868R(r0)
        L12:
            return r0
    }

    /* renamed from: Y0 */
    public int m1675Y0() {
            r4 = this;
            int r0 = r4.m1891z()
            r1 = 1
            int r0 = r0 - r1
            r2 = -1
            r3 = 0
            android.view.View r0 = r4.m1678a1(r0, r2, r3, r1)
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            int r2 = r4.m1868R(r0)
        L13:
            return r2
    }

    /* renamed from: Z0 */
    public android.view.View m1676Z0(int r4, int r5) {
            r3 = this;
            r3.m1669T0()
            if (r5 <= r4) goto L7
            r0 = 1
            goto Lc
        L7:
            if (r5 >= r4) goto Lb
            r0 = -1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L13
            android.view.View r4 = r3.m1889y(r4)
            return r4
        L13:
            androidx.recyclerview.widget.c0 r0 = r3.f3083r
            android.view.View r1 = r3.m1889y(r4)
            int r0 = r0.mo2000e(r1)
            androidx.recyclerview.widget.c0 r1 = r3.f3083r
            int r1 = r1.mo2006k()
            if (r0 >= r1) goto L2a
            r0 = 16644(0x4104, float:2.3323E-41)
            r1 = 16388(0x4004, float:2.2964E-41)
            goto L2e
        L2a:
            r0 = 4161(0x1041, float:5.831E-42)
            r1 = 4097(0x1001, float:5.741E-42)
        L2e:
            int r2 = r3.f3081p
            if (r2 != 0) goto L35
            androidx.recyclerview.widget.l0 r2 = r3.f3242c
            goto L37
        L35:
            androidx.recyclerview.widget.l0 r2 = r3.f3243d
        L37:
            android.view.View r4 = r2.m2083a(r4, r5, r0, r1)
            return r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0568x.b
    /* renamed from: a */
    public android.graphics.PointF mo1677a(int r4) {
            r3 = this;
            int r0 = r3.m1891z()
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            android.view.View r1 = r3.m1889y(r0)
            int r1 = r3.m1868R(r1)
            r2 = 1
            if (r4 >= r1) goto L15
            r0 = 1
        L15:
            boolean r4 = r3.f3086u
            if (r0 == r4) goto L1a
            r2 = -1
        L1a:
            int r4 = r3.f3081p
            r0 = 0
            if (r4 != 0) goto L26
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r1, r0)
            return r4
        L26:
            android.graphics.PointF r4 = new android.graphics.PointF
            float r1 = (float) r2
            r4.<init>(r0, r1)
            return r4
    }

    /* renamed from: a1 */
    public android.view.View m1678a1(int r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            r1.m1669T0()
            r0 = 320(0x140, float:4.48E-43)
            if (r4 == 0) goto La
            r4 = 24579(0x6003, float:3.4443E-41)
            goto Lc
        La:
            r4 = 320(0x140, float:4.48E-43)
        Lc:
            if (r5 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            int r5 = r1.f3081p
            if (r5 != 0) goto L17
            androidx.recyclerview.widget.l0 r5 = r1.f3242c
            goto L19
        L17:
            androidx.recyclerview.widget.l0 r5 = r1.f3243d
        L19:
            android.view.View r2 = r5.m2083a(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.recyclerview.widget.C0609t.h
    /* renamed from: b */
    public void mo1679b(android.view.View r4, android.view.View r5, int r6, int r7) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r3.f3091z
            if (r6 != 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r6 = r3.f3241b
            if (r6 == 0) goto Ld
            java.lang.String r7 = "Cannot drop a view during a scroll or layout calculation"
            r6.m1758i(r7)
        Ld:
            r3.m1669T0()
            r3.m1696m1()
            int r6 = r3.m1868R(r4)
            int r7 = r3.m1868R(r5)
            r0 = 1
            r1 = -1
            if (r6 >= r7) goto L21
            r6 = 1
            goto L22
        L21:
            r6 = -1
        L22:
            boolean r2 = r3.f3086u
            if (r2 == 0) goto L4e
            if (r6 != r0) goto L40
            androidx.recyclerview.widget.c0 r6 = r3.f3083r
            int r6 = r6.mo2002g()
            androidx.recyclerview.widget.c0 r0 = r3.f3083r
            int r5 = r0.mo2000e(r5)
            androidx.recyclerview.widget.c0 r0 = r3.f3083r
            int r4 = r0.mo1998c(r4)
            int r4 = r4 + r5
            int r6 = r6 - r4
            r3.m1699o1(r7, r6)
            goto L6a
        L40:
            androidx.recyclerview.widget.c0 r4 = r3.f3083r
            int r4 = r4.mo2002g()
            androidx.recyclerview.widget.c0 r6 = r3.f3083r
            int r5 = r6.mo1997b(r5)
            int r4 = r4 - r5
            goto L56
        L4e:
            if (r6 != r1) goto L5a
            androidx.recyclerview.widget.c0 r4 = r3.f3083r
            int r4 = r4.mo2000e(r5)
        L56:
            r3.m1699o1(r7, r4)
            goto L6a
        L5a:
            androidx.recyclerview.widget.c0 r6 = r3.f3083r
            int r5 = r6.mo1997b(r5)
            androidx.recyclerview.widget.c0 r6 = r3.f3083r
            int r4 = r6.mo1998c(r4)
            int r5 = r5 - r4
            r3.m1699o1(r7, r5)
        L6a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: b0 */
    public void mo1680b0(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C0564t r2) {
            r0 = this;
            return
    }

    /* renamed from: b1 */
    public android.view.View mo1632b1(androidx.recyclerview.widget.RecyclerView.C0564t r17, androidx.recyclerview.widget.RecyclerView.C0569y r18, boolean r19, boolean r20) {
            r16 = this;
            r0 = r16
            r16.m1669T0()
            int r1 = r16.m1891z()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r20 == 0) goto L15
            int r1 = r16.m1891z()
            int r1 = r1 - r4
            r5 = -1
            goto L18
        L15:
            r2 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.m1930b()
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2006k()
            androidx.recyclerview.widget.c0 r8 = r0.f3083r
            int r8 = r8.mo2002g()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r2) goto L7a
            android.view.View r12 = r0.m1889y(r1)
            int r13 = r0.m1868R(r12)
            androidx.recyclerview.widget.c0 r14 = r0.f3083r
            int r14 = r14.mo2000e(r12)
            androidx.recyclerview.widget.c0 r15 = r0.f3083r
            int r15 = r15.mo1997b(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r13 = (androidx.recyclerview.widget.RecyclerView.C0558n) r13
            boolean r13 = r13.m1899c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: c0 */
    public android.view.View mo1633c0(android.view.View r4, int r5, androidx.recyclerview.widget.RecyclerView.C0564t r6, androidx.recyclerview.widget.RecyclerView.C0569y r7) {
            r3 = this;
            r3.m1696m1()
            int r4 = r3.m1891z()
            r0 = 0
            if (r4 != 0) goto Lb
            return r0
        Lb:
            int r4 = r3.m1668S0(r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r5) goto L14
            return r0
        L14:
            r3.m1669T0()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.c0 r2 = r3.f3083r
            int r2 = r2.mo2007l()
            float r2 = (float) r2
            float r2 = r2 * r1
            int r1 = (int) r2
            r2 = 0
            r3.m1703r1(r4, r1, r2, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r3.f3082q
            r1.f3107g = r5
            r1.f3101a = r2
            r5 = 1
            r3.m1670U0(r6, r1, r7, r5)
            r5 = -1
            if (r4 != r5) goto L4c
            boolean r6 = r3.f3086u
            if (r6 == 0) goto L43
            int r6 = r3.m1891z()
            int r6 = r6 + r5
            android.view.View r6 = r3.m1676Z0(r6, r5)
            goto L62
        L43:
            int r6 = r3.m1891z()
            android.view.View r6 = r3.m1676Z0(r2, r6)
            goto L62
        L4c:
            boolean r6 = r3.f3086u
            if (r6 == 0) goto L59
            int r6 = r3.m1891z()
            android.view.View r6 = r3.m1676Z0(r2, r6)
            goto L62
        L59:
            int r6 = r3.m1891z()
            int r6 = r6 + r5
            android.view.View r6 = r3.m1676Z0(r6, r5)
        L62:
            if (r4 != r5) goto L69
            android.view.View r4 = r3.m1686f1()
            goto L6d
        L69:
            android.view.View r4 = r3.m1685e1()
        L6d:
            boolean r5 = r4.hasFocusable()
            if (r5 == 0) goto L77
            if (r6 != 0) goto L76
            return r0
        L76:
            return r4
        L77:
            return r6
    }

    /* renamed from: c1 */
    public final int m1681c1(int r2, androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.c0 r0 = r1.f3083r
            int r0 = r0.mo2002g()
            int r0 = r0 - r2
            if (r0 <= 0) goto L23
            int r0 = -r0
            int r3 = r1.m1697n1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.c0 r4 = r1.f3083r
            int r4 = r4.mo2002g()
            int r4 = r4 - r2
            if (r4 <= 0) goto L22
            androidx.recyclerview.widget.c0 r2 = r1.f3083r
            r2.mo2010p(r4)
            int r4 = r4 + r3
            return r4
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: d0 */
    public void mo1682d0(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.mo1682d0(r2)
            int r0 = r1.m1891z()
            if (r0 <= 0) goto L17
            int r0 = r1.m1674X0()
            r2.setFromIndex(r0)
            int r0 = r1.m1675Y0()
            r2.setToIndex(r0)
        L17:
            return
    }

    /* renamed from: d1 */
    public final int m1683d1(int r2, androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, boolean r5) {
            r1 = this;
            androidx.recyclerview.widget.c0 r0 = r1.f3083r
            int r0 = r0.mo2006k()
            int r0 = r2 - r0
            if (r0 <= 0) goto L23
            int r3 = r1.m1697n1(r0, r3, r4)
            int r3 = -r3
            int r2 = r2 + r3
            if (r5 == 0) goto L22
            androidx.recyclerview.widget.c0 r4 = r1.f3083r
            int r4 = r4.mo2006k()
            int r2 = r2 - r4
            if (r2 <= 0) goto L22
            androidx.recyclerview.widget.c0 r4 = r1.f3083r
            int r5 = -r2
            r4.mo2010p(r5)
            int r3 = r3 - r2
        L22:
            return r3
        L23:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: e */
    public void mo1684e(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r1.f3091z
            if (r0 != 0) goto Lb
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3241b
            if (r0 == 0) goto Lb
            r0.m1758i(r2)
        Lb:
            return
    }

    /* renamed from: e1 */
    public final android.view.View m1685e1() {
            r1 = this;
            boolean r0 = r1.f3086u
            if (r0 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            int r0 = r1.m1891z()
            int r0 = r0 + (-1)
        Lc:
            android.view.View r0 = r1.m1889y(r0)
            return r0
    }

    /* renamed from: f1 */
    public final android.view.View m1686f1() {
            r1 = this;
            boolean r0 = r1.f3086u
            if (r0 == 0) goto Lb
            int r0 = r1.m1891z()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            android.view.View r0 = r1.m1889y(r0)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: g */
    public boolean mo1687g() {
            r1 = this;
            int r0 = r1.f3081p
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: g1 */
    public boolean m1688g1() {
            r2 = this;
            int r0 = r2.m1860K()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: h */
    public boolean mo1689h() {
            r2 = this;
            int r0 = r2.f3081p
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    /* renamed from: h1 */
    public void mo1636h1(androidx.recyclerview.widget.RecyclerView.C0564t r10, androidx.recyclerview.widget.RecyclerView.C0569y r11, androidx.recyclerview.widget.LinearLayoutManager.C0541c r12, androidx.recyclerview.widget.LinearLayoutManager.C0540b r13) {
            r9 = this;
            android.view.View r10 = r12.m1713c(r10)
            r11 = 1
            if (r10 != 0) goto La
            r13.f3098b = r11
            return
        La:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            r6 = r0
            androidx.recyclerview.widget.RecyclerView$n r6 = (androidx.recyclerview.widget.RecyclerView.C0558n) r6
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r0 = r12.f3111k
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L2a
            boolean r0 = r9.f3086u
            int r3 = r12.f3106f
            if (r3 != r1) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            if (r0 != r3) goto L26
            r9.m1875d(r10, r1, r2)
            goto L3c
        L26:
            r9.m1875d(r10, r2, r2)
            goto L3c
        L2a:
            boolean r0 = r9.f3086u
            int r3 = r12.f3106f
            if (r3 != r1) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            if (r0 != r3) goto L39
            r9.m1875d(r10, r1, r11)
            goto L3c
        L39:
            r9.m1875d(r10, r2, r11)
        L3c:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r0 = (androidx.recyclerview.widget.RecyclerView.C0558n) r0
            androidx.recyclerview.widget.RecyclerView r3 = r9.f3241b
            android.graphics.Rect r3 = r3.m1734M(r10)
            int r4 = r3.left
            int r5 = r3.right
            int r4 = r4 + r5
            int r4 = r4 + r2
            int r5 = r3.top
            int r3 = r3.bottom
            int r5 = r5 + r3
            int r5 = r5 + r2
            int r2 = r9.f3253n
            int r3 = r9.f3251l
            int r7 = r9.m1865O()
            int r8 = r9.m1866P()
            int r8 = r8 + r7
            int r7 = r0.leftMargin
            int r8 = r8 + r7
            int r7 = r0.rightMargin
            int r8 = r8 + r7
            int r8 = r8 + r4
            int r4 = r0.width
            boolean r7 = r9.mo1687g()
            int r2 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r2, r3, r8, r4, r7)
            int r3 = r9.f3254o
            int r4 = r9.f3252m
            int r7 = r9.m1867Q()
            int r8 = r9.m1864N()
            int r8 = r8 + r7
            int r7 = r0.topMargin
            int r8 = r8 + r7
            int r7 = r0.bottomMargin
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r5 = r0.height
            boolean r7 = r9.mo1689h()
            int r3 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r3, r4, r8, r5, r7)
            boolean r0 = r9.m1856H0(r10, r2, r3, r0)
            if (r0 == 0) goto L99
            r10.measure(r2, r3)
        L99:
            androidx.recyclerview.widget.c0 r0 = r9.f3083r
            int r0 = r0.mo1998c(r10)
            r13.f3097a = r0
            int r0 = r9.f3081p
            if (r0 != r11) goto Ldb
            boolean r0 = r9.m1688g1()
            if (r0 == 0) goto Lbb
            int r0 = r9.f3253n
            int r2 = r9.m1866P()
            int r0 = r0 - r2
            androidx.recyclerview.widget.c0 r2 = r9.f3083r
            int r2 = r2.mo1999d(r10)
            int r2 = r0 - r2
            goto Lc6
        Lbb:
            int r2 = r9.m1865O()
            androidx.recyclerview.widget.c0 r0 = r9.f3083r
            int r0 = r0.mo1999d(r10)
            int r0 = r0 + r2
        Lc6:
            int r3 = r12.f3106f
            int r12 = r12.f3102b
            if (r3 != r1) goto Ld4
            int r1 = r13.f3097a
            int r1 = r12 - r1
            r5 = r12
            r4 = r0
            r3 = r1
            goto Lfc
        Ld4:
            int r1 = r13.f3097a
            int r1 = r1 + r12
            r3 = r12
            r4 = r0
            r5 = r1
            goto Lfc
        Ldb:
            int r0 = r9.m1867Q()
            androidx.recyclerview.widget.c0 r2 = r9.f3083r
            int r2 = r2.mo1999d(r10)
            int r2 = r2 + r0
            int r3 = r12.f3106f
            int r12 = r12.f3102b
            if (r3 != r1) goto Lf5
            int r1 = r13.f3097a
            int r1 = r12 - r1
            r4 = r12
            r3 = r0
            r5 = r2
            r2 = r1
            goto Lfc
        Lf5:
            int r1 = r13.f3097a
            int r1 = r1 + r12
            r3 = r0
            r4 = r1
            r5 = r2
            r2 = r12
        Lfc:
            r0 = r9
            r1 = r10
            r0.m1870X(r1, r2, r3, r4, r5)
            boolean r12 = r6.m1899c()
            if (r12 != 0) goto L10d
            boolean r12 = r6.m1898b()
            if (r12 == 0) goto L10f
        L10d:
            r13.f3099c = r11
        L10f:
            boolean r10 = r10.hasFocusable()
            r13.f3100d = r10
            return
    }

    /* renamed from: i1 */
    public void mo1639i1(androidx.recyclerview.widget.RecyclerView.C0564t r1, androidx.recyclerview.widget.RecyclerView.C0569y r2, androidx.recyclerview.widget.LinearLayoutManager.C0539a r3, int r4) {
            r0 = this;
            return
    }

    /* renamed from: j1 */
    public final void m1690j1(androidx.recyclerview.widget.RecyclerView.C0564t r6, androidx.recyclerview.widget.LinearLayoutManager.C0541c r7) {
            r5 = this;
            boolean r0 = r7.f3101a
            if (r0 == 0) goto Lb2
            boolean r0 = r7.f3112l
            if (r0 == 0) goto La
            goto Lb2
        La:
            int r0 = r7.f3107g
            int r1 = r7.f3109i
            int r7 = r7.f3106f
            r2 = -1
            r3 = 0
            if (r7 != r2) goto L68
            int r7 = r5.m1891z()
            if (r0 >= 0) goto L1c
            goto Lb2
        L1c:
            androidx.recyclerview.widget.c0 r4 = r5.f3083r
            int r4 = r4.mo2001f()
            int r4 = r4 - r0
            int r4 = r4 + r1
            boolean r0 = r5.f3086u
            if (r0 == 0) goto L48
            r0 = 0
        L29:
            if (r0 >= r7) goto Lb2
            android.view.View r1 = r5.m1889y(r0)
            androidx.recyclerview.widget.c0 r2 = r5.f3083r
            int r2 = r2.mo2000e(r1)
            if (r2 < r4) goto L43
            androidx.recyclerview.widget.c0 r2 = r5.f3083r
            int r1 = r2.mo2009o(r1)
            if (r1 >= r4) goto L40
            goto L43
        L40:
            int r0 = r0 + 1
            goto L29
        L43:
            r5.m1692k1(r6, r3, r0)
            goto Lb2
        L48:
            int r7 = r7 + r2
            r0 = r7
        L4a:
            if (r0 < 0) goto Lb2
            android.view.View r1 = r5.m1889y(r0)
            androidx.recyclerview.widget.c0 r2 = r5.f3083r
            int r2 = r2.mo2000e(r1)
            if (r2 < r4) goto L64
            androidx.recyclerview.widget.c0 r2 = r5.f3083r
            int r1 = r2.mo2009o(r1)
            if (r1 >= r4) goto L61
            goto L64
        L61:
            int r0 = r0 + (-1)
            goto L4a
        L64:
            r5.m1692k1(r6, r7, r0)
            goto Lb2
        L68:
            if (r0 >= 0) goto L6b
            goto Lb2
        L6b:
            int r0 = r0 - r1
            int r7 = r5.m1891z()
            boolean r1 = r5.f3086u
            if (r1 == 0) goto L94
            int r7 = r7 + r2
            r1 = r7
        L76:
            if (r1 < 0) goto Lb2
            android.view.View r2 = r5.m1889y(r1)
            androidx.recyclerview.widget.c0 r3 = r5.f3083r
            int r3 = r3.mo1997b(r2)
            if (r3 > r0) goto L90
            androidx.recyclerview.widget.c0 r3 = r5.f3083r
            int r2 = r3.mo2008n(r2)
            if (r2 <= r0) goto L8d
            goto L90
        L8d:
            int r1 = r1 + (-1)
            goto L76
        L90:
            r5.m1692k1(r6, r7, r1)
            goto Lb2
        L94:
            r1 = 0
        L95:
            if (r1 >= r7) goto Lb2
            android.view.View r2 = r5.m1889y(r1)
            androidx.recyclerview.widget.c0 r4 = r5.f3083r
            int r4 = r4.mo1997b(r2)
            if (r4 > r0) goto Laf
            androidx.recyclerview.widget.c0 r4 = r5.f3083r
            int r2 = r4.mo2008n(r2)
            if (r2 <= r0) goto Lac
            goto Laf
        Lac:
            int r1 = r1 + 1
            goto L95
        Laf:
            r5.m1692k1(r6, r3, r1)
        Lb2:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: k */
    public void mo1691k(int r2, int r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c r5) {
            r1 = this;
            int r0 = r1.f3081p
            if (r0 != 0) goto L5
            goto L6
        L5:
            r2 = r3
        L6:
            int r3 = r1.m1891z()
            if (r3 == 0) goto L24
            if (r2 != 0) goto Lf
            goto L24
        Lf:
            r1.m1669T0()
            r3 = 1
            if (r2 <= 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = -1
        L18:
            int r2 = java.lang.Math.abs(r2)
            r1.m1703r1(r0, r2, r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r1.f3082q
            r1.mo1630O0(r4, r2, r5)
        L24:
            return
    }

    /* renamed from: k1 */
    public final void m1692k1(androidx.recyclerview.widget.RecyclerView.C0564t r1, int r2, int r3) {
            r0 = this;
            if (r2 != r3) goto L3
            return
        L3:
            if (r3 <= r2) goto Lf
            int r3 = r3 + (-1)
        L7:
            if (r3 < r2) goto L17
            r0.m1886v0(r3, r1)
            int r3 = r3 + (-1)
            goto L7
        Lf:
            if (r2 <= r3) goto L17
            r0.m1886v0(r2, r1)
            int r2 = r2 + (-1)
            goto Lf
        L17:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: l */
    public void mo1693l(int r6, androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c r7) {
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r5.f3091z
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L13
            boolean r0 = r0.m1714a()
            if (r0 == 0) goto L13
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r5.f3091z
            boolean r3 = r0.f3115a0
            int r0 = r0.f3113Y
            goto L22
        L13:
            r5.m1696m1()
            boolean r3 = r5.f3086u
            int r0 = r5.f3089x
            if (r0 != r1) goto L22
            if (r3 == 0) goto L21
            int r0 = r6 + (-1)
            goto L22
        L21:
            r0 = 0
        L22:
            if (r3 == 0) goto L25
            goto L26
        L25:
            r1 = 1
        L26:
            r3 = 0
        L27:
            int r4 = r5.f3079C
            if (r3 >= r4) goto L39
            if (r0 < 0) goto L39
            if (r0 >= r6) goto L39
            r4 = r7
            androidx.recyclerview.widget.r$b r4 = (androidx.recyclerview.widget.RunnableC0607r.b) r4
            r4.m2114a(r0, r2)
            int r0 = r0 + r1
            int r3 = r3 + 1
            goto L27
        L39:
            return
    }

    /* renamed from: l1 */
    public boolean m1694l1() {
            r1 = this;
            androidx.recyclerview.widget.c0 r0 = r1.f3083r
            int r0 = r0.mo2004i()
            if (r0 != 0) goto L12
            androidx.recyclerview.widget.c0 r0 = r1.f3083r
            int r0 = r0.mo2001f()
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: m */
    public int mo1695m(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1665P0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: m0 */
    public void mo1643m0(androidx.recyclerview.widget.RecyclerView.C0564t r17, androidx.recyclerview.widget.RecyclerView.C0569y r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f3091z
            r4 = -1
            if (r3 != 0) goto Lf
            int r3 = r0.f3089x
            if (r3 == r4) goto L19
        Lf:
            int r3 = r18.m1930b()
            if (r3 != 0) goto L19
            r16.m1882s0(r17)
            return
        L19:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f3091z
            if (r3 == 0) goto L29
            boolean r3 = r3.m1714a()
            if (r3 == 0) goto L29
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f3091z
            int r3 = r3.f3113Y
            r0.f3089x = r3
        L29:
            r16.m1669T0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r5 = 0
            r3.f3101a = r5
            r16.m1696m1()
            android.view.View r3 = r16.m1857I()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f3077A
            boolean r7 = r6.f3096e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L73
            int r7 = r0.f3089x
            if (r7 != r4) goto L73
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f3091z
            if (r7 == 0) goto L4a
            goto L73
        L4a:
            if (r3 == 0) goto L217
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2000e(r3)
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2002g()
            if (r6 >= r7) goto L68
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo1997b(r3)
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2006k()
            if (r6 > r7) goto L217
        L68:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.f3077A
            int r7 = r0.m1868R(r3)
            r6.m1709c(r3, r7)
            goto L217
        L73:
            r6.m1710d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            boolean r6 = r0.f3086u
            boolean r7 = r0.f3087v
            r6 = r6 ^ r7
            r3.f3095d = r6
            boolean r6 = r2.f3302g
            if (r6 != 0) goto L170
            int r6 = r0.f3089x
            if (r6 != r4) goto L89
            goto L170
        L89:
            if (r6 < 0) goto L16c
            int r7 = r18.m1930b()
            if (r6 < r7) goto L93
            goto L16c
        L93:
            int r6 = r0.f3089x
            r3.f3093b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f3091z
            if (r6 == 0) goto Lc1
            boolean r6 = r6.m1714a()
            if (r6 == 0) goto Lc1
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f3091z
            boolean r6 = r6.f3115a0
            r3.f3095d = r6
            if (r6 == 0) goto Lb5
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2002g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f3091z
            int r7 = r7.f3114Z
            goto L15d
        Lb5:
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2006k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f3091z
            int r7 = r7.f3114Z
            goto L167
        Lc1:
            int r6 = r0.f3090y
            if (r6 != r8) goto L14f
            int r6 = r0.f3089x
            android.view.View r6 = r0.mo1706u(r6)
            if (r6 == 0) goto L12d
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo1998c(r6)
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r10 = r10.mo2007l()
            if (r7 <= r10) goto Ldd
            goto L14b
        Ldd:
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2000e(r6)
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r10 = r10.mo2006k()
            int r7 = r7 - r10
            if (r7 >= 0) goto Lf8
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2006k()
            r3.f3094c = r6
            r3.f3095d = r5
            goto L16a
        Lf8:
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2002g()
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r10 = r10.mo1997b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L112
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2002g()
            r3.f3094c = r6
            r3.f3095d = r9
            goto L16a
        L112:
            boolean r7 = r3.f3095d
            if (r7 == 0) goto L124
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r6 = r7.mo1997b(r6)
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.m2016m()
            int r7 = r7 + r6
            goto L12a
        L124:
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2000e(r6)
        L12a:
            r3.f3094c = r7
            goto L16a
        L12d:
            int r6 = r16.m1891z()
            if (r6 <= 0) goto L14b
            android.view.View r6 = r0.m1889y(r5)
            int r6 = r0.m1868R(r6)
            int r7 = r0.f3089x
            if (r7 >= r6) goto L141
            r6 = 1
            goto L142
        L141:
            r6 = 0
        L142:
            boolean r7 = r0.f3086u
            if (r6 != r7) goto L148
            r6 = 1
            goto L149
        L148:
            r6 = 0
        L149:
            r3.f3095d = r6
        L14b:
            r3.m1707a()
            goto L16a
        L14f:
            boolean r6 = r0.f3086u
            r3.f3095d = r6
            if (r6 == 0) goto L15f
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2002g()
            int r7 = r0.f3090y
        L15d:
            int r6 = r6 - r7
            goto L168
        L15f:
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2006k()
            int r7 = r0.f3090y
        L167:
            int r6 = r6 + r7
        L168:
            r3.f3094c = r6
        L16a:
            r6 = 1
            goto L171
        L16c:
            r0.f3089x = r4
            r0.f3090y = r8
        L170:
            r6 = 0
        L171:
            if (r6 == 0) goto L175
            goto L213
        L175:
            int r6 = r16.m1891z()
            if (r6 != 0) goto L17d
            goto L1ff
        L17d:
            android.view.View r6 = r16.m1857I()
            if (r6 == 0) goto L1ac
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$n r7 = (androidx.recyclerview.widget.RecyclerView.C0558n) r7
            boolean r10 = r7.m1899c()
            if (r10 != 0) goto L1a1
            int r10 = r7.m1897a()
            if (r10 < 0) goto L1a1
            int r7 = r7.m1897a()
            int r10 = r18.m1930b()
            if (r7 >= r10) goto L1a1
            r7 = 1
            goto L1a2
        L1a1:
            r7 = 0
        L1a2:
            if (r7 == 0) goto L1ac
            int r7 = r0.m1868R(r6)
            r3.m1709c(r6, r7)
            goto L1fd
        L1ac:
            boolean r6 = r0.f3084s
            boolean r7 = r0.f3087v
            if (r6 == r7) goto L1b3
            goto L1ff
        L1b3:
            boolean r6 = r3.f3095d
            android.view.View r6 = r0.mo1632b1(r1, r2, r6, r7)
            if (r6 == 0) goto L1ff
            int r7 = r0.m1868R(r6)
            r3.m1708b(r6, r7)
            boolean r7 = r2.f3302g
            if (r7 != 0) goto L1fd
            boolean r7 = r16.mo1629M0()
            if (r7 == 0) goto L1fd
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2000e(r6)
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r6 = r10.mo1997b(r6)
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r10 = r10.mo2006k()
            androidx.recyclerview.widget.c0 r11 = r0.f3083r
            int r11 = r11.mo2002g()
            if (r6 > r10) goto L1ea
            if (r7 >= r10) goto L1ea
            r12 = 1
            goto L1eb
        L1ea:
            r12 = 0
        L1eb:
            if (r7 < r11) goto L1f1
            if (r6 <= r11) goto L1f1
            r6 = 1
            goto L1f2
        L1f1:
            r6 = 0
        L1f2:
            if (r12 != 0) goto L1f6
            if (r6 == 0) goto L1fd
        L1f6:
            boolean r6 = r3.f3095d
            if (r6 == 0) goto L1fb
            r10 = r11
        L1fb:
            r3.f3094c = r10
        L1fd:
            r6 = 1
            goto L200
        L1ff:
            r6 = 0
        L200:
            if (r6 == 0) goto L203
            goto L213
        L203:
            r3.m1707a()
            boolean r6 = r0.f3087v
            if (r6 == 0) goto L210
            int r6 = r18.m1930b()
            int r6 = r6 + r4
            goto L211
        L210:
            r6 = 0
        L211:
            r3.f3093b = r6
        L213:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            r3.f3096e = r9
        L217:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r6 = r3.f3110j
            if (r6 < 0) goto L21f
            r6 = 1
            goto L220
        L21f:
            r6 = -1
        L220:
            r3.f3106f = r6
            int[] r3 = r0.f3080D
            r3[r5] = r5
            r3[r9] = r5
            r0.mo1664N0(r2, r3)
            int[] r3 = r0.f3080D
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.c0 r6 = r0.f3083r
            int r6 = r6.mo2006k()
            int r6 = r6 + r3
            int[] r3 = r0.f3080D
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.c0 r7 = r0.f3083r
            int r7 = r7.mo2003h()
            int r7 = r7 + r3
            boolean r3 = r2.f3302g
            if (r3 == 0) goto L284
            int r3 = r0.f3089x
            if (r3 == r4) goto L284
            int r10 = r0.f3090y
            if (r10 == r8) goto L284
            android.view.View r3 = r0.mo1706u(r3)
            if (r3 == 0) goto L284
            boolean r8 = r0.f3086u
            if (r8 == 0) goto L26f
            androidx.recyclerview.widget.c0 r8 = r0.f3083r
            int r8 = r8.mo2002g()
            androidx.recyclerview.widget.c0 r10 = r0.f3083r
            int r3 = r10.mo1997b(r3)
            int r8 = r8 - r3
            int r3 = r0.f3090y
            goto L27e
        L26f:
            androidx.recyclerview.widget.c0 r8 = r0.f3083r
            int r3 = r8.mo2000e(r3)
            androidx.recyclerview.widget.c0 r8 = r0.f3083r
            int r8 = r8.mo2006k()
            int r3 = r3 - r8
            int r8 = r0.f3090y
        L27e:
            int r8 = r8 - r3
            if (r8 <= 0) goto L283
            int r6 = r6 + r8
            goto L284
        L283:
            int r7 = r7 - r8
        L284:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            boolean r8 = r3.f3095d
            if (r8 == 0) goto L28f
            boolean r8 = r0.f3086u
            if (r8 == 0) goto L293
            goto L295
        L28f:
            boolean r8 = r0.f3086u
            if (r8 == 0) goto L295
        L293:
            r8 = -1
            goto L296
        L295:
            r8 = 1
        L296:
            r0.mo1639i1(r1, r2, r3, r8)
            r16.m1881s(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            boolean r8 = r16.m1694l1()
            r3.f3112l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r3.f3109i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            boolean r8 = r3.f3095d
            if (r8 == 0) goto L2fa
            int r8 = r3.f3093b
            int r3 = r3.f3094c
            r0.m1705t1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r3.f3108h = r6
            r0.m1670U0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r6 = r3.f3102b
            int r8 = r3.f3104d
            int r3 = r3.f3103c
            if (r3 <= 0) goto L2cc
            int r7 = r7 + r3
        L2cc:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            int r10 = r3.f3093b
            int r3 = r3.f3094c
            r0.m1704s1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r3.f3108h = r7
            int r7 = r3.f3104d
            int r10 = r3.f3105e
            int r7 = r7 + r10
            r3.f3104d = r7
            r0.m1670U0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r7 = r3.f3102b
            int r3 = r3.f3103c
            if (r3 <= 0) goto L340
            r0.m1705t1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f3082q
            r6.f3108h = r3
            r0.m1670U0(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r6 = r3.f3102b
            goto L340
        L2fa:
            int r8 = r3.f3093b
            int r3 = r3.f3094c
            r0.m1704s1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r3.f3108h = r7
            r0.m1670U0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r7 = r3.f3102b
            int r8 = r3.f3104d
            int r3 = r3.f3103c
            if (r3 <= 0) goto L313
            int r6 = r6 + r3
        L313:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f3077A
            int r10 = r3.f3093b
            int r3 = r3.f3094c
            r0.m1705t1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            r3.f3108h = r6
            int r6 = r3.f3104d
            int r10 = r3.f3105e
            int r6 = r6 + r10
            r3.f3104d = r6
            r0.m1670U0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r6 = r3.f3102b
            int r3 = r3.f3103c
            if (r3 <= 0) goto L340
            r0.m1704s1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f3082q
            r7.f3108h = r3
            r0.m1670U0(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f3082q
            int r7 = r3.f3102b
        L340:
            int r3 = r16.m1891z()
            if (r3 <= 0) goto L364
            boolean r3 = r0.f3086u
            boolean r8 = r0.f3087v
            r3 = r3 ^ r8
            if (r3 == 0) goto L358
            int r3 = r0.m1681c1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.m1683d1(r6, r1, r2, r5)
            goto L362
        L358:
            int r3 = r0.m1683d1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.m1681c1(r7, r1, r2, r5)
        L362:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L364:
            boolean r3 = r2.f3306k
            if (r3 == 0) goto L3fa
            int r3 = r16.m1891z()
            if (r3 == 0) goto L3fa
            boolean r3 = r2.f3302g
            if (r3 != 0) goto L3fa
            boolean r3 = r16.mo1629M0()
            if (r3 != 0) goto L37a
            goto L3fa
        L37a:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f3274d
            int r8 = r3.size()
            android.view.View r10 = r0.m1889y(r5)
            int r10 = r0.m1868R(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L38b:
            if (r11 >= r8) goto L3bb
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$b0 r14 = (androidx.recyclerview.widget.RecyclerView.AbstractC0546b0) r14
            boolean r15 = r14.m1797n()
            if (r15 == 0) goto L39a
            goto L3b7
        L39a:
            int r15 = r14.m1790g()
            if (r15 >= r10) goto L3a2
            r15 = 1
            goto L3a3
        L3a2:
            r15 = 0
        L3a3:
            boolean r9 = r0.f3086u
            if (r15 == r9) goto L3a9
            r9 = -1
            goto L3aa
        L3a9:
            r9 = 1
        L3aa:
            androidx.recyclerview.widget.c0 r15 = r0.f3083r
            android.view.View r14 = r14.f3208a
            int r14 = r15.mo1998c(r14)
            if (r9 != r4) goto L3b6
            int r12 = r12 + r14
            goto L3b7
        L3b6:
            int r13 = r13 + r14
        L3b7:
            int r11 = r11 + 1
            r9 = 1
            goto L38b
        L3bb:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f3082q
            r4.f3111k = r3
            r3 = 0
            if (r12 <= 0) goto L3db
            android.view.View r4 = r16.m1686f1()
            int r4 = r0.m1868R(r4)
            r0.m1705t1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f3082q
            r4.f3108h = r12
            r4.f3103c = r5
            r4.m1711a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f3082q
            r0.m1670U0(r1, r4, r2, r5)
        L3db:
            if (r13 <= 0) goto L3f6
            android.view.View r4 = r16.m1685e1()
            int r4 = r0.m1868R(r4)
            r0.m1704s1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f3082q
            r4.f3108h = r13
            r4.f3103c = r5
            r4.m1711a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f3082q
            r0.m1670U0(r1, r4, r2, r5)
        L3f6:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f3082q
            r1.f3111k = r3
        L3fa:
            boolean r1 = r2.f3302g
            if (r1 != 0) goto L407
            androidx.recyclerview.widget.c0 r1 = r0.f3083r
            int r2 = r1.mo2007l()
            r1.f3381b = r2
            goto L40c
        L407:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f3077A
            r1.m1710d()
        L40c:
            boolean r1 = r0.f3087v
            r0.f3084s = r1
            return
    }

    /* renamed from: m1 */
    public final void m1696m1() {
            r2 = this;
            int r0 = r2.f3081p
            r1 = 1
            if (r0 == r1) goto L10
            boolean r0 = r2.m1688g1()
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            boolean r0 = r2.f3085t
            r0 = r0 ^ r1
            goto L12
        L10:
            boolean r0 = r2.f3085t
        L12:
            r2.f3086u = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: n */
    public int mo1644n(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1666Q0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
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
            return
    }

    /* renamed from: n1 */
    public int m1697n1(int r6, androidx.recyclerview.widget.RecyclerView.C0564t r7, androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r5 = this;
            int r0 = r5.m1891z()
            r1 = 0
            if (r0 == 0) goto L39
            if (r6 != 0) goto La
            goto L39
        La:
            r5.m1669T0()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r5.f3082q
            r2 = 1
            r0.f3101a = r2
            if (r6 <= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = -1
        L17:
            int r3 = java.lang.Math.abs(r6)
            r5.m1703r1(r0, r3, r2, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r2 = r5.f3082q
            int r4 = r2.f3107g
            int r7 = r5.m1670U0(r7, r2, r8, r1)
            int r7 = r7 + r4
            if (r7 >= 0) goto L2a
            return r1
        L2a:
            if (r3 <= r7) goto L2e
            int r6 = r0 * r7
        L2e:
            androidx.recyclerview.widget.c0 r7 = r5.f3083r
            int r8 = -r6
            r7.mo2010p(r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r5.f3082q
            r7.f3110j = r6
            return r6
        L39:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: o */
    public int mo1646o(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1667R0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: o0 */
    public void mo1698o0(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager.C0542d
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = (androidx.recyclerview.widget.LinearLayoutManager.C0542d) r3
            r2.f3091z = r3
            int r0 = r2.f3089x
            r1 = -1
            if (r0 == r1) goto Lf
            r3.f3113Y = r1
        Lf:
            r2.m1890y0()
        L12:
            return
    }

    /* renamed from: o1 */
    public void m1699o1(int r1, int r2) {
            r0 = this;
            r0.f3089x = r1
            r0.f3090y = r2
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = r0.f3091z
            if (r1 == 0) goto Lb
            r2 = -1
            r1.f3113Y = r2
        Lb:
            r0.m1890y0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: p */
    public int mo1700p(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1665P0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: p0 */
    public android.os.Parcelable mo1701p0() {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = r4.f3091z
            if (r0 == 0) goto La
            androidx.recyclerview.widget.LinearLayoutManager$d r1 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r1.<init>(r0)
            return r1
        La:
            androidx.recyclerview.widget.LinearLayoutManager$d r0 = new androidx.recyclerview.widget.LinearLayoutManager$d
            r0.<init>()
            int r1 = r4.m1891z()
            if (r1 <= 0) goto L55
            r4.m1669T0()
            boolean r1 = r4.f3084s
            boolean r2 = r4.f3086u
            r1 = r1 ^ r2
            r0.f3115a0 = r1
            if (r1 == 0) goto L3b
            android.view.View r1 = r4.m1685e1()
            androidx.recyclerview.widget.c0 r2 = r4.f3083r
            int r2 = r2.mo2002g()
            androidx.recyclerview.widget.c0 r3 = r4.f3083r
            int r3 = r3.mo1997b(r1)
            int r2 = r2 - r3
            r0.f3114Z = r2
            int r1 = r4.m1868R(r1)
            r0.f3113Y = r1
            goto L58
        L3b:
            android.view.View r1 = r4.m1686f1()
            int r2 = r4.m1868R(r1)
            r0.f3113Y = r2
            androidx.recyclerview.widget.c0 r2 = r4.f3083r
            int r1 = r2.mo2000e(r1)
            androidx.recyclerview.widget.c0 r2 = r4.f3083r
            int r2 = r2.mo2006k()
            int r1 = r1 - r2
            r0.f3114Z = r1
            goto L58
        L55:
            r1 = -1
            r0.f3113Y = r1
        L58:
            return r0
    }

    /* renamed from: p1 */
    public void m1702p1(int r3) {
            r2 = this;
            if (r3 == 0) goto L12
            r0 = 1
            if (r3 != r0) goto L6
            goto L12
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid orientation:"
            java.lang.String r3 = android.support.v4.media.C0142a.m254a(r1, r3)
            r0.<init>(r3)
            throw r0
        L12:
            r0 = 0
            r2.mo1684e(r0)
            int r0 = r2.f3081p
            if (r3 != r0) goto L1e
            androidx.recyclerview.widget.c0 r0 = r2.f3083r
            if (r0 != 0) goto L2d
        L1e:
            androidx.recyclerview.widget.c0 r0 = androidx.recyclerview.widget.AbstractC0582c0.m2015a(r2, r3)
            r2.f3083r = r0
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r2.f3077A
            r1.f3092a = r0
            r2.f3081p = r3
            r2.m1890y0()
        L2d:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: q */
    public int mo1647q(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1666Q0(r1)
            return r1
    }

    /* renamed from: q1 */
    public void mo1648q1(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mo1684e(r0)
            boolean r0 = r1.f3087v
            if (r0 != r2) goto L9
            return
        L9:
            r1.f3087v = r2
            r1.m1890y0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: r */
    public int mo1649r(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1667R0(r1)
            return r1
    }

    /* renamed from: r1 */
    public final void m1703r1(int r5, int r6, boolean r7, androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r4 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f3082q
            boolean r1 = r4.m1694l1()
            r0.f3112l = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f3082q
            r0.f3106f = r5
            int[] r0 = r4.f3080D
            r1 = 0
            r0[r1] = r1
            r2 = 1
            r0[r2] = r1
            r4.mo1664N0(r8, r0)
            int[] r8 = r4.f3080D
            r8 = r8[r1]
            int r8 = java.lang.Math.max(r1, r8)
            int[] r0 = r4.f3080D
            r0 = r0[r2]
            int r0 = java.lang.Math.max(r1, r0)
            if (r5 != r2) goto L2a
            r1 = 1
        L2a:
            androidx.recyclerview.widget.LinearLayoutManager$c r5 = r4.f3082q
            if (r1 == 0) goto L30
            r3 = r0
            goto L31
        L30:
            r3 = r8
        L31:
            r5.f3108h = r3
            if (r1 == 0) goto L36
            goto L37
        L36:
            r8 = r0
        L37:
            r5.f3109i = r8
            r8 = -1
            if (r1 == 0) goto L73
            androidx.recyclerview.widget.c0 r0 = r4.f3083r
            int r0 = r0.mo2003h()
            int r0 = r0 + r3
            r5.f3108h = r0
            android.view.View r5 = r4.m1685e1()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f3082q
            boolean r1 = r4.f3086u
            if (r1 == 0) goto L50
            r2 = -1
        L50:
            r0.f3105e = r2
            int r8 = r4.m1868R(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.f3082q
            int r2 = r1.f3105e
            int r8 = r8 + r2
            r0.f3104d = r8
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r8 = r8.mo1997b(r5)
            r1.f3102b = r8
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r5 = r8.mo1997b(r5)
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r8 = r8.mo2002g()
            int r5 = r5 - r8
            goto Laf
        L73:
            android.view.View r5 = r4.m1686f1()
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f3082q
            int r1 = r0.f3108h
            androidx.recyclerview.widget.c0 r3 = r4.f3083r
            int r3 = r3.mo2006k()
            int r3 = r3 + r1
            r0.f3108h = r3
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r4.f3082q
            boolean r1 = r4.f3086u
            if (r1 == 0) goto L8b
            goto L8c
        L8b:
            r2 = -1
        L8c:
            r0.f3105e = r2
            int r8 = r4.m1868R(r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r4.f3082q
            int r2 = r1.f3105e
            int r8 = r8 + r2
            r0.f3104d = r8
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r8 = r8.mo2000e(r5)
            r1.f3102b = r8
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r5 = r8.mo2000e(r5)
            int r5 = -r5
            androidx.recyclerview.widget.c0 r8 = r4.f3083r
            int r8 = r8.mo2006k()
            int r5 = r5 + r8
        Laf:
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r4.f3082q
            r8.f3103c = r6
            if (r7 == 0) goto Lb8
            int r6 = r6 - r5
            r8.f3103c = r6
        Lb8:
            r8.f3107g = r5
            return
    }

    /* renamed from: s1 */
    public final void m1704s1(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.f3082q
            androidx.recyclerview.widget.c0 r1 = r3.f3083r
            int r1 = r1.mo2002g()
            int r1 = r1 - r5
            r0.f3103c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r3.f3082q
            boolean r1 = r3.f3086u
            r2 = 1
            if (r1 == 0) goto L14
            r1 = -1
            goto L15
        L14:
            r1 = 1
        L15:
            r0.f3105e = r1
            r0.f3104d = r4
            r0.f3106f = r2
            r0.f3102b = r5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3107g = r4
            return
    }

    /* renamed from: t1 */
    public final void m1705t1(int r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.f3082q
            androidx.recyclerview.widget.c0 r1 = r2.f3083r
            int r1 = r1.mo2006k()
            int r1 = r4 - r1
            r0.f3103c = r1
            androidx.recyclerview.widget.LinearLayoutManager$c r0 = r2.f3082q
            r0.f3104d = r3
            boolean r3 = r2.f3086u
            r1 = -1
            if (r3 == 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = -1
        L18:
            r0.f3105e = r3
            r0.f3106f = r1
            r0.f3102b = r4
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3107g = r3
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: u */
    public android.view.View mo1706u(int r3) {
            r2 = this;
            int r0 = r2.m1891z()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r1 = 0
            android.view.View r1 = r2.m1889y(r1)
            int r1 = r2.m1868R(r1)
            int r1 = r3 - r1
            if (r1 < 0) goto L22
            if (r1 >= r0) goto L22
            android.view.View r0 = r2.m1889y(r1)
            int r1 = r2.m1868R(r0)
            if (r1 != r3) goto L22
            return r0
        L22:
            android.view.View r3 = super.mo1706u(r3)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: v */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1651v() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = new androidx.recyclerview.widget.RecyclerView$n
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: z0 */
    public int mo1658z0(int r3, androidx.recyclerview.widget.RecyclerView.C0564t r4, androidx.recyclerview.widget.RecyclerView.C0569y r5) {
            r2 = this;
            int r0 = r2.f3081p
            r1 = 1
            if (r0 != r1) goto L7
            r3 = 0
            return r3
        L7:
            int r3 = r2.m1697n1(r3, r4, r5)
            return r3
    }
}
