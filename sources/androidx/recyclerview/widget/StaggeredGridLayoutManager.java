package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView.AbstractC0557m implements androidx.recyclerview.widget.RecyclerView.AbstractC0568x.b {

    /* renamed from: A */
    public int f3310A;

    /* renamed from: B */
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d f3311B;

    /* renamed from: C */
    public int f3312C;

    /* renamed from: D */
    public boolean f3313D;

    /* renamed from: E */
    public boolean f3314E;

    /* renamed from: F */
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e f3315F;

    /* renamed from: G */
    public final android.graphics.Rect f3316G;

    /* renamed from: H */
    public final androidx.recyclerview.widget.StaggeredGridLayoutManager.C0572b f3317H;

    /* renamed from: I */
    public boolean f3318I;

    /* renamed from: J */
    public int[] f3319J;

    /* renamed from: K */
    public final java.lang.Runnable f3320K;

    /* renamed from: p */
    public int f3321p;

    /* renamed from: q */
    public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0576f[] f3322q;

    /* renamed from: r */
    public androidx.recyclerview.widget.AbstractC0582c0 f3323r;

    /* renamed from: s */
    public androidx.recyclerview.widget.AbstractC0582c0 f3324s;

    /* renamed from: t */
    public int f3325t;

    /* renamed from: u */
    public int f3326u;

    /* renamed from: v */
    public final androidx.recyclerview.widget.C0611v f3327v;

    /* renamed from: w */
    public boolean f3328w;

    /* renamed from: x */
    public boolean f3329x;

    /* renamed from: y */
    public java.util.BitSet f3330y;

    /* renamed from: z */
    public int f3331z;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0571a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f3332Y;

        public RunnableC0571a(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.f3332Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f3332Y
                r0.m1932O0()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0572b {

        /* renamed from: a */
        public int f3333a;

        /* renamed from: b */
        public int f3334b;

        /* renamed from: c */
        public boolean f3335c;

        /* renamed from: d */
        public boolean f3336d;

        /* renamed from: e */
        public boolean f3337e;

        /* renamed from: f */
        public int[] f3338f;

        /* renamed from: g */
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f3339g;

        public C0572b(androidx.recyclerview.widget.StaggeredGridLayoutManager r1) {
                r0 = this;
                r0.f3339g = r1
                r0.<init>()
                r0.m1963b()
                return
        }

        /* renamed from: a */
        public void m1962a() {
                r1 = this;
                boolean r0 = r1.f3335c
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f3339g
                androidx.recyclerview.widget.c0 r0 = r0.f3323r
                int r0 = r0.mo2002g()
                goto L15
            Ld:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r1.f3339g
                androidx.recyclerview.widget.c0 r0 = r0.f3323r
                int r0 = r0.mo2006k()
            L15:
                r1.f3334b = r0
                return
        }

        /* renamed from: b */
        public void m1963b() {
                r2 = this;
                r0 = -1
                r2.f3333a = r0
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.f3334b = r1
                r1 = 0
                r2.f3335c = r1
                r2.f3336d = r1
                r2.f3337e = r1
                int[] r1 = r2.f3338f
                if (r1 == 0) goto L15
                java.util.Arrays.fill(r1, r0)
            L15:
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0573c extends androidx.recyclerview.widget.RecyclerView.C0558n {

        /* renamed from: e */
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0576f f3340e;

        public C0573c(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0573c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public C0573c(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C0573c(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0574d {

        /* renamed from: a */
        public int[] f3341a;

        /* renamed from: b */
        public java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a> f3342b;

        @android.annotation.SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class a implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a> CREATOR = null;

            /* renamed from: Y */
            public int f3343Y;

            /* renamed from: Z */
            public int f3344Z;

            /* renamed from: a0 */
            public int[] f3345a0;

            /* renamed from: b0 */
            public boolean f3346b0;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C7365a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a> {
                public C7365a() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // android.os.Parcelable.Creator
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a createFromParcel(android.os.Parcel r2) {
                        r1 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
                        r0.<init>(r2)
                        return r0
                }

                @Override // android.os.Parcelable.Creator
                public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a[] newArray(int r1) {
                        r0 = this;
                        androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a[r1]
                        return r1
                }
            }

            static {
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a
                    r0.<init>()
                    androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a.CREATOR = r0
                    return
            }

            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public a(android.os.Parcel r3) {
                    r2 = this;
                    r2.<init>()
                    int r0 = r3.readInt()
                    r2.f3343Y = r0
                    int r0 = r3.readInt()
                    r2.f3344Z = r0
                    int r0 = r3.readInt()
                    r1 = 1
                    if (r0 != r1) goto L17
                    goto L18
                L17:
                    r1 = 0
                L18:
                    r2.f3346b0 = r1
                    int r0 = r3.readInt()
                    if (r0 <= 0) goto L27
                    int[] r0 = new int[r0]
                    r2.f3345a0 = r0
                    r3.readIntArray(r0)
                L27:
                    return
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.String r0 = "FullSpanItem{mPosition="
                    java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                    int r1 = r2.f3343Y
                    r0.append(r1)
                    java.lang.String r1 = ", mGapDir="
                    r0.append(r1)
                    int r1 = r2.f3344Z
                    r0.append(r1)
                    java.lang.String r1 = ", mHasUnwantedGapAfter="
                    r0.append(r1)
                    boolean r1 = r2.f3346b0
                    r0.append(r1)
                    java.lang.String r1 = ", mGapPerSpan="
                    r0.append(r1)
                    int[] r1 = r2.f3345a0
                    java.lang.String r1 = java.util.Arrays.toString(r1)
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r3 = r1.f3343Y
                    r2.writeInt(r3)
                    int r3 = r1.f3344Z
                    r2.writeInt(r3)
                    boolean r3 = r1.f3346b0
                    r2.writeInt(r3)
                    int[] r3 = r1.f3345a0
                    if (r3 == 0) goto L20
                    int r0 = r3.length
                    if (r0 <= 0) goto L20
                    int r3 = r3.length
                    r2.writeInt(r3)
                    int[] r3 = r1.f3345a0
                    r2.writeIntArray(r3)
                    goto L24
                L20:
                    r3 = 0
                    r2.writeInt(r3)
                L24:
                    return
            }
        }

        public C0574d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m1964a() {
                r2 = this;
                int[] r0 = r2.f3341a
                if (r0 == 0) goto L8
                r1 = -1
                java.util.Arrays.fill(r0, r1)
            L8:
                r0 = 0
                r2.f3342b = r0
                return
        }

        /* renamed from: b */
        public void m1965b(int r5) {
                r4 = this;
                int[] r0 = r4.f3341a
                r1 = -1
                if (r0 != 0) goto L15
                r0 = 10
                int r5 = java.lang.Math.max(r5, r0)
                int r5 = r5 + 1
                int[] r5 = new int[r5]
                r4.f3341a = r5
                java.util.Arrays.fill(r5, r1)
                goto L2e
            L15:
                int r2 = r0.length
                if (r5 < r2) goto L2e
                int r2 = r0.length
            L19:
                if (r2 > r5) goto L1e
                int r2 = r2 * 2
                goto L19
            L1e:
                int[] r5 = new int[r2]
                r4.f3341a = r5
                int r2 = r0.length
                r3 = 0
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int[] r5 = r4.f3341a
                int r0 = r0.length
                int r2 = r5.length
                java.util.Arrays.fill(r5, r0, r2, r1)
            L2e:
                return
        }

        /* renamed from: c */
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a m1966c(int r5) {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3342b
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            Lc:
                if (r0 < 0) goto L1e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f3342b
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a) r2
                int r3 = r2.f3343Y
                if (r3 != r5) goto L1b
                return r2
            L1b:
                int r0 = r0 + (-1)
                goto Lc
            L1e:
                return r1
        }

        /* renamed from: d */
        public int m1967d(int r5) {
                r4 = this;
                int[] r0 = r4.f3341a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3342b
                if (r0 != 0) goto L10
            Le:
                r0 = -1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.m1966c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f3342b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3342b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3342b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a) r3
                int r3 = r3.f3343Y
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = -1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f3342b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f3342b
                r3.remove(r2)
                int r0 = r0.f3343Y
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f3341a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f3341a
                int r5 = r5.length
                return r5
            L52:
                int r0 = r0 + 1
                int[] r2 = r4.f3341a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f3341a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
        }

        /* renamed from: e */
        public void m1968e(int r4, int r5) {
                r3 = this;
                int[] r0 = r3.f3341a
                if (r0 == 0) goto L3a
                int r0 = r0.length
                if (r4 < r0) goto L8
                goto L3a
            L8:
                int r0 = r4 + r5
                r3.m1965b(r0)
                int[] r1 = r3.f3341a
                int r2 = r1.length
                int r2 = r2 - r4
                int r2 = r2 - r5
                java.lang.System.arraycopy(r1, r4, r1, r0, r2)
                int[] r1 = r3.f3341a
                r2 = -1
                java.util.Arrays.fill(r1, r4, r0, r2)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r3.f3342b
                if (r0 != 0) goto L20
                goto L3a
            L20:
                int r0 = r0.size()
                int r0 = r0 + r2
            L25:
                if (r0 < 0) goto L3a
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r3.f3342b
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a) r1
                int r2 = r1.f3343Y
                if (r2 >= r4) goto L34
                goto L37
            L34:
                int r2 = r2 + r5
                r1.f3343Y = r2
            L37:
                int r0 = r0 + (-1)
                goto L25
            L3a:
                return
        }

        /* renamed from: f */
        public void m1969f(int r6, int r7) {
                r5 = this;
                int[] r0 = r5.f3341a
                if (r0 == 0) goto L45
                int r0 = r0.length
                if (r6 < r0) goto L8
                goto L45
            L8:
                int r0 = r6 + r7
                r5.m1965b(r0)
                int[] r1 = r5.f3341a
                int r2 = r1.length
                int r2 = r2 - r6
                int r2 = r2 - r7
                java.lang.System.arraycopy(r1, r0, r1, r6, r2)
                int[] r1 = r5.f3341a
                int r2 = r1.length
                int r2 = r2 - r7
                int r3 = r1.length
                r4 = -1
                java.util.Arrays.fill(r1, r2, r3, r4)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r5.f3342b
                if (r1 != 0) goto L23
                goto L45
            L23:
                int r1 = r1.size()
                int r1 = r1 + r4
            L28:
                if (r1 < 0) goto L45
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r5.f3342b
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a) r2
                int r3 = r2.f3343Y
                if (r3 >= r6) goto L37
                goto L42
            L37:
                if (r3 >= r0) goto L3f
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r5.f3342b
                r2.remove(r1)
                goto L42
            L3f:
                int r3 = r3 - r7
                r2.f3343Y = r3
            L42:
                int r1 = r1 + (-1)
                goto L28
            L45:
                return
        }
    }

    @android.annotation.SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0575e implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e> CREATOR = null;

        /* renamed from: Y */
        public int f3347Y;

        /* renamed from: Z */
        public int f3348Z;

        /* renamed from: a0 */
        public int f3349a0;

        /* renamed from: b0 */
        public int[] f3350b0;

        /* renamed from: c0 */
        public int f3351c0;

        /* renamed from: d0 */
        public int[] f3352d0;

        /* renamed from: e0 */
        public java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a> f3353e0;

        /* renamed from: f0 */
        public boolean f3354f0;

        /* renamed from: g0 */
        public boolean f3355g0;

        /* renamed from: h0 */
        public boolean f3356h0;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public class a implements android.os.Parcelable.Creator<androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e createFromParcel(android.os.Parcel r2) {
                    r1 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
                    r0.<init>(r2)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.StaggeredGridLayoutManager$e[] r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a
                r0.<init>()
                androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e.CREATOR = r0
                return
        }

        public C0575e() {
                r0 = this;
                r0.<init>()
                return
        }

        public C0575e(android.os.Parcel r4) {
                r3 = this;
                r3.<init>()
                int r0 = r4.readInt()
                r3.f3347Y = r0
                int r0 = r4.readInt()
                r3.f3348Z = r0
                int r0 = r4.readInt()
                r3.f3349a0 = r0
                if (r0 <= 0) goto L1e
                int[] r0 = new int[r0]
                r3.f3350b0 = r0
                r4.readIntArray(r0)
            L1e:
                int r0 = r4.readInt()
                r3.f3351c0 = r0
                if (r0 <= 0) goto L2d
                int[] r0 = new int[r0]
                r3.f3352d0 = r0
                r4.readIntArray(r0)
            L2d:
                int r0 = r4.readInt()
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L37
                r0 = 1
                goto L38
            L37:
                r0 = 0
            L38:
                r3.f3354f0 = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L42
                r0 = 1
                goto L43
            L42:
                r0 = 0
            L43:
                r3.f3355g0 = r0
                int r0 = r4.readInt()
                if (r0 != r2) goto L4c
                r1 = 1
            L4c:
                r3.f3356h0 = r1
                java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C0574d.a.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r4 = r4.readArrayList(r0)
                r3.f3353e0 = r4
                return
        }

        public C0575e(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.f3349a0
                r1.f3349a0 = r0
                int r0 = r2.f3347Y
                r1.f3347Y = r0
                int r0 = r2.f3348Z
                r1.f3348Z = r0
                int[] r0 = r2.f3350b0
                r1.f3350b0 = r0
                int r0 = r2.f3351c0
                r1.f3351c0 = r0
                int[] r0 = r2.f3352d0
                r1.f3352d0 = r0
                boolean r0 = r2.f3354f0
                r1.f3354f0 = r0
                boolean r0 = r2.f3355g0
                r1.f3355g0 = r0
                boolean r0 = r2.f3356h0
                r1.f3356h0 = r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r2.f3353e0
                r1.f3353e0 = r2
                return
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
                int r2 = r0.f3347Y
                r1.writeInt(r2)
                int r2 = r0.f3348Z
                r1.writeInt(r2)
                int r2 = r0.f3349a0
                r1.writeInt(r2)
                int r2 = r0.f3349a0
                if (r2 <= 0) goto L18
                int[] r2 = r0.f3350b0
                r1.writeIntArray(r2)
            L18:
                int r2 = r0.f3351c0
                r1.writeInt(r2)
                int r2 = r0.f3351c0
                if (r2 <= 0) goto L26
                int[] r2 = r0.f3352d0
                r1.writeIntArray(r2)
            L26:
                boolean r2 = r0.f3354f0
                r1.writeInt(r2)
                boolean r2 = r0.f3355g0
                r1.writeInt(r2)
                boolean r2 = r0.f3356h0
                r1.writeInt(r2)
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r0.f3353e0
                r1.writeList(r2)
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0576f {

        /* renamed from: a */
        public java.util.ArrayList<android.view.View> f3357a;

        /* renamed from: b */
        public int f3358b;

        /* renamed from: c */
        public int f3359c;

        /* renamed from: d */
        public int f3360d;

        /* renamed from: e */
        public final int f3361e;

        /* renamed from: f */
        public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f3362f;

        public C0576f(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
                r0 = this;
                r0.f3362f = r1
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f3357a = r1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0.f3358b = r1
                r0.f3359c = r1
                r1 = 0
                r0.f3360d = r1
                r0.f3361e = r2
                return
        }

        /* renamed from: a */
        public void m1970a(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r4.m1979j(r5)
                r0.f3340e = r4
                java.util.ArrayList<android.view.View> r1 = r4.f3357a
                r1.add(r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.f3359c = r1
                java.util.ArrayList<android.view.View> r2 = r4.f3357a
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1a
                r4.f3358b = r1
            L1a:
                boolean r1 = r0.m1899c()
                if (r1 != 0) goto L26
                boolean r0 = r0.m1898b()
                if (r0 == 0) goto L33
            L26:
                int r0 = r4.f3360d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.f3362f
                androidx.recyclerview.widget.c0 r1 = r1.f3323r
                int r5 = r1.mo1998c(r5)
                int r5 = r5 + r0
                r4.f3360d = r5
            L33:
                return
        }

        /* renamed from: b */
        public void m1971b() {
                r3 = this;
                java.util.ArrayList<android.view.View> r0 = r3.f3357a
                int r1 = r0.size()
                int r1 = r1 + (-1)
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r3.m1979j(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f3362f
                androidx.recyclerview.widget.c0 r2 = r2.f3323r
                int r0 = r2.mo1997b(r0)
                r3.f3359c = r0
                java.util.Objects.requireNonNull(r1)
                return
        }

        /* renamed from: c */
        public void m1972c() {
                r3 = this;
                java.util.ArrayList<android.view.View> r0 = r3.f3357a
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r3.m1979j(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f3362f
                androidx.recyclerview.widget.c0 r2 = r2.f3323r
                int r0 = r2.mo2000e(r0)
                r3.f3358b = r0
                java.util.Objects.requireNonNull(r1)
                return
        }

        /* renamed from: d */
        public void m1973d() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.f3357a
                r0.clear()
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.f3358b = r0
                r1.f3359c = r0
                r0 = 0
                r1.f3360d = r0
                return
        }

        /* renamed from: e */
        public int m1974e() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.f3362f
                boolean r0 = r0.f3328w
                r1 = 1
                if (r0 == 0) goto L10
                java.util.ArrayList<android.view.View> r0 = r3.f3357a
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
                goto L17
            L10:
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.f3357a
                int r2 = r2.size()
            L17:
                int r0 = r3.m1976g(r0, r2, r1)
                return r0
        }

        /* renamed from: f */
        public int m1975f() {
                r3 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r3.f3362f
                boolean r0 = r0.f3328w
                r1 = 1
                if (r0 == 0) goto Lf
                r0 = 0
                java.util.ArrayList<android.view.View> r2 = r3.f3357a
                int r2 = r2.size()
                goto L17
            Lf:
                java.util.ArrayList<android.view.View> r0 = r3.f3357a
                int r0 = r0.size()
                int r0 = r0 - r1
                r2 = -1
            L17:
                int r0 = r3.m1976g(r0, r2, r1)
                return r0
        }

        /* renamed from: g */
        public int m1976g(int r11, int r12, boolean r13) {
                r10 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = r10.f3362f
                androidx.recyclerview.widget.c0 r0 = r0.f3323r
                int r0 = r0.mo2006k()
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r10.f3362f
                androidx.recyclerview.widget.c0 r1 = r1.f3323r
                int r1 = r1.mo2002g()
                r2 = -1
                r3 = 1
                if (r12 <= r11) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = -1
            L17:
                if (r11 == r12) goto L55
                java.util.ArrayList<android.view.View> r5 = r10.f3357a
                java.lang.Object r5 = r5.get(r11)
                android.view.View r5 = (android.view.View) r5
                androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r10.f3362f
                androidx.recyclerview.widget.c0 r6 = r6.f3323r
                int r6 = r6.mo2000e(r5)
                androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r10.f3362f
                androidx.recyclerview.widget.c0 r7 = r7.f3323r
                int r7 = r7.mo1997b(r5)
                r8 = 0
                if (r13 == 0) goto L37
                if (r6 > r1) goto L3b
                goto L39
            L37:
                if (r6 >= r1) goto L3b
            L39:
                r9 = 1
                goto L3c
            L3b:
                r9 = 0
            L3c:
                if (r13 == 0) goto L41
                if (r7 < r0) goto L44
                goto L43
            L41:
                if (r7 <= r0) goto L44
            L43:
                r8 = 1
            L44:
                if (r9 == 0) goto L53
                if (r8 == 0) goto L53
                if (r6 < r0) goto L4c
                if (r7 <= r1) goto L53
            L4c:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = r10.f3362f
                int r2 = r11.m1868R(r5)
                goto L55
            L53:
                int r11 = r11 + r4
                goto L17
            L55:
                return r2
        }

        /* renamed from: h */
        public int m1977h(int r3) {
                r2 = this;
                int r0 = r2.f3359c
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.f3357a
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.m1971b()
                int r3 = r2.f3359c
                return r3
        }

        /* renamed from: i */
        public android.view.View m1978i(int r6, int r7) {
                r5 = this;
                r0 = -1
                r1 = 0
                if (r7 != r0) goto L38
                java.util.ArrayList<android.view.View> r7 = r5.f3357a
                int r7 = r7.size()
                r0 = 0
            Lb:
                if (r0 >= r7) goto L6d
                java.util.ArrayList<android.view.View> r2 = r5.f3357a
                java.lang.Object r2 = r2.get(r0)
                android.view.View r2 = (android.view.View) r2
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.f3362f
                boolean r4 = r3.f3328w
                if (r4 == 0) goto L21
                int r3 = r3.m1868R(r2)
                if (r3 <= r6) goto L6d
            L21:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r5.f3362f
                boolean r4 = r3.f3328w
                if (r4 != 0) goto L2e
                int r3 = r3.m1868R(r2)
                if (r3 < r6) goto L2e
                goto L6d
            L2e:
                boolean r3 = r2.hasFocusable()
                if (r3 == 0) goto L6d
                int r0 = r0 + 1
                r1 = r2
                goto Lb
            L38:
                java.util.ArrayList<android.view.View> r7 = r5.f3357a
                int r7 = r7.size()
                int r7 = r7 + (-1)
            L40:
                if (r7 < 0) goto L6d
                java.util.ArrayList<android.view.View> r0 = r5.f3357a
                java.lang.Object r0 = r0.get(r7)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.f3362f
                boolean r3 = r2.f3328w
                if (r3 == 0) goto L56
                int r2 = r2.m1868R(r0)
                if (r2 >= r6) goto L6d
            L56:
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r5.f3362f
                boolean r3 = r2.f3328w
                if (r3 != 0) goto L63
                int r2 = r2.m1868R(r0)
                if (r2 > r6) goto L63
                goto L6d
            L63:
                boolean r2 = r0.hasFocusable()
                if (r2 == 0) goto L6d
                int r7 = r7 + (-1)
                r1 = r0
                goto L40
            L6d:
                return r1
        }

        /* renamed from: j */
        public androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c m1979j(android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r1
                return r1
        }

        /* renamed from: k */
        public int m1980k(int r3) {
                r2 = this;
                int r0 = r2.f3358b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L7
                return r0
            L7:
                java.util.ArrayList<android.view.View> r0 = r2.f3357a
                int r0 = r0.size()
                if (r0 != 0) goto L10
                return r3
            L10:
                r2.m1972c()
                int r3 = r2.f3358b
                return r3
        }

        /* renamed from: l */
        public void m1981l() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.f3357a
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r4.f3357a
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r4.m1979j(r1)
                r3 = 0
                r2.f3340e = r3
                boolean r3 = r2.m1899c()
                if (r3 != 0) goto L23
                boolean r2 = r2.m1898b()
                if (r2 == 0) goto L30
            L23:
                int r2 = r4.f3360d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r4.f3362f
                androidx.recyclerview.widget.c0 r3 = r3.f3323r
                int r1 = r3.mo1998c(r1)
                int r2 = r2 - r1
                r4.f3360d = r2
            L30:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 != r2) goto L37
                r4.f3358b = r1
            L37:
                r4.f3359c = r1
                return
        }

        /* renamed from: m */
        public void m1982m() {
                r4 = this;
                java.util.ArrayList<android.view.View> r0 = r4.f3357a
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r4.m1979j(r0)
                r2 = 0
                r1.f3340e = r2
                java.util.ArrayList<android.view.View> r2 = r4.f3357a
                int r2 = r2.size()
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 != 0) goto L1c
                r4.f3359c = r3
            L1c:
                boolean r2 = r1.m1899c()
                if (r2 != 0) goto L28
                boolean r1 = r1.m1898b()
                if (r1 == 0) goto L35
            L28:
                int r1 = r4.f3360d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r4.f3362f
                androidx.recyclerview.widget.c0 r2 = r2.f3323r
                int r0 = r2.mo1998c(r0)
                int r1 = r1 - r0
                r4.f3360d = r1
            L35:
                r4.f3358b = r3
                return
        }

        /* renamed from: n */
        public void m1983n(android.view.View r5) {
                r4 = this;
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r4.m1979j(r5)
                r0.f3340e = r4
                java.util.ArrayList<android.view.View> r1 = r4.f3357a
                r2 = 0
                r1.add(r2, r5)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r4.f3358b = r1
                java.util.ArrayList<android.view.View> r2 = r4.f3357a
                int r2 = r2.size()
                r3 = 1
                if (r2 != r3) goto L1b
                r4.f3359c = r1
            L1b:
                boolean r1 = r0.m1899c()
                if (r1 != 0) goto L27
                boolean r0 = r0.m1898b()
                if (r0 == 0) goto L34
            L27:
                int r0 = r4.f3360d
                androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r4.f3362f
                androidx.recyclerview.widget.c0 r1 = r1.f3323r
                int r5 = r1.mo1998c(r5)
                int r5 = r5 + r0
                r4.f3360d = r5
            L34:
                return
        }
    }

    public StaggeredGridLayoutManager(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f3321p = r0
            r1 = 0
            r3.f3328w = r1
            r3.f3329x = r1
            r3.f3331z = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f3310A = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d
            r0.<init>()
            r3.f3311B = r0
            r0 = 2
            r3.f3312C = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f3316G = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$b
            r0.<init>(r3)
            r3.f3317H = r0
            r0 = 1
            r3.f3318I = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r2 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$a
            r2.<init>(r3)
            r3.f3320K = r2
            androidx.recyclerview.widget.RecyclerView$m$d r4 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1843S(r4, r5, r6, r7)
            int r5 = r4.f3257a
            if (r5 == 0) goto L46
            if (r5 != r0) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "invalid orientation."
            r4.<init>(r5)
            throw r4
        L46:
            r6 = 0
            r3.mo1684e(r6)
            int r7 = r3.f3325t
            if (r5 != r7) goto L4f
            goto L5c
        L4f:
            r3.f3325t = r5
            androidx.recyclerview.widget.c0 r5 = r3.f3323r
            androidx.recyclerview.widget.c0 r7 = r3.f3324s
            r3.f3323r = r7
            r3.f3324s = r5
            r3.m1890y0()
        L5c:
            int r5 = r4.f3258b
            r3.mo1684e(r6)
            int r7 = r3.f3321p
            if (r5 == r7) goto L91
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r3.f3311B
            r7.m1964a()
            r3.m1890y0()
            r3.f3321p = r5
            java.util.BitSet r5 = new java.util.BitSet
            int r7 = r3.f3321p
            r5.<init>(r7)
            r3.f3330y = r5
            int r5 = r3.f3321p
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = new androidx.recyclerview.widget.StaggeredGridLayoutManager.C0576f[r5]
            r3.f3322q = r5
        L7e:
            int r5 = r3.f3321p
            if (r1 >= r5) goto L8e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r3.f3322q
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$f
            r7.<init>(r3, r1)
            r5[r1] = r7
            int r1 = r1 + 1
            goto L7e
        L8e:
            r3.m1890y0()
        L91:
            boolean r4 = r4.f3259c
            r3.mo1684e(r6)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r3.f3315F
            if (r5 == 0) goto La0
            boolean r6 = r5.f3354f0
            if (r6 == r4) goto La0
            r5.f3354f0 = r4
        La0:
            r3.f3328w = r4
            r3.m1890y0()
            androidx.recyclerview.widget.v r4 = new androidx.recyclerview.widget.v
            r4.<init>()
            r3.f3327v = r4
            int r4 = r3.f3325t
            androidx.recyclerview.widget.c0 r4 = androidx.recyclerview.widget.AbstractC0582c0.m2015a(r3, r4)
            r3.f3323r = r4
            int r4 = r3.f3325t
            int r0 = r0 - r4
            androidx.recyclerview.widget.c0 r4 = androidx.recyclerview.widget.AbstractC0582c0.m2015a(r3, r0)
            r3.f3324s = r4
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: A0 */
    public void mo1661A0(int r3) {
            r2 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r2.f3315F
            if (r0 == 0) goto L13
            int r1 = r0.f3347Y
            if (r1 == r3) goto L13
            r1 = 0
            r0.f3350b0 = r1
            r1 = 0
            r0.f3349a0 = r1
            r1 = -1
            r0.f3347Y = r1
            r0.f3348Z = r1
        L13:
            r2.f3331z = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.f3310A = r3
            r2.m1890y0()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: B0 */
    public int mo1624B0(int r1, androidx.recyclerview.widget.RecyclerView.C0564t r2, androidx.recyclerview.widget.RecyclerView.C0569y r3) {
            r0 = this;
            int r1 = r0.m1956m1(r1, r2, r3)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: E0 */
    public void mo1628E0(android.graphics.Rect r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.m1865O()
            int r1 = r4.m1866P()
            int r1 = r1 + r0
            int r0 = r4.m1867Q()
            int r2 = r4.m1864N()
            int r2 = r2 + r0
            int r0 = r4.f3325t
            r3 = 1
            if (r0 != r3) goto L34
            int r5 = r5.height()
            int r5 = r5 + r2
            int r0 = r4.m1861L()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r7, r5, r0)
            int r7 = r4.f3326u
            int r0 = r4.f3321p
            int r7 = r7 * r0
            int r7 = r7 + r1
            int r0 = r4.m1863M()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r6, r7, r0)
            goto L50
        L34:
            int r5 = r5.width()
            int r5 = r5 + r1
            int r0 = r4.m1863M()
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r6, r5, r0)
            int r5 = r4.f3326u
            int r0 = r4.f3321p
            int r5 = r5 * r0
            int r5 = r5 + r2
            int r0 = r4.m1861L()
            int r5 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1845j(r7, r5, r0)
        L50:
            androidx.recyclerview.widget.RecyclerView r7 = r4.f3241b
            androidx.recyclerview.widget.RecyclerView.m1722e(r7, r6, r5)
            return
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
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.f3315F
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: N0 */
    public final int m1931N0(int r4) {
            r3 = this;
            int r0 = r3.m1891z()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f3329x
            if (r4 == 0) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            int r0 = r3.m1941X0()
            if (r4 >= r0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f3329x
            if (r4 == r0) goto L1c
            goto L1d
        L1c:
            r1 = 1
        L1d:
            return r1
    }

    /* renamed from: O0 */
    public boolean m1932O0() {
            r3 = this;
            int r0 = r3.m1891z()
            r1 = 0
            if (r0 == 0) goto L37
            int r0 = r3.f3312C
            if (r0 == 0) goto L37
            boolean r0 = r3.f3246g
            if (r0 != 0) goto L10
            goto L37
        L10:
            boolean r0 = r3.f3329x
            if (r0 == 0) goto L1c
            int r0 = r3.m1942Y0()
            r3.m1941X0()
            goto L23
        L1c:
            int r0 = r3.m1941X0()
            r3.m1942Y0()
        L23:
            r2 = 1
            if (r0 != 0) goto L37
            android.view.View r0 = r3.m1946c1()
            if (r0 == 0) goto L37
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r3.f3311B
            r0.m1964a()
            r3.f3245f = r2
            r3.m1890y0()
            return r2
        L37:
            return r1
    }

    /* renamed from: P0 */
    public final int m1933P0(androidx.recyclerview.widget.RecyclerView.C0569y r7) {
            r6 = this;
            int r0 = r6.m1891z()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.c0 r1 = r6.f3323r
            boolean r0 = r6.f3318I
            r0 = r0 ^ 1
            android.view.View r2 = r6.m1938U0(r0)
            boolean r0 = r6.f3318I
            r0 = r0 ^ 1
            android.view.View r3 = r6.m1937T0(r0)
            boolean r5 = r6.f3318I
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0594i0.m2078a(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: Q0 */
    public final int m1934Q0(androidx.recyclerview.widget.RecyclerView.C0569y r8) {
            r7 = this;
            int r0 = r7.m1891z()
            if (r0 != 0) goto L8
            r8 = 0
            return r8
        L8:
            androidx.recyclerview.widget.c0 r1 = r7.f3323r
            boolean r0 = r7.f3318I
            r0 = r0 ^ 1
            android.view.View r2 = r7.m1938U0(r0)
            boolean r0 = r7.f3318I
            r0 = r0 ^ 1
            android.view.View r3 = r7.m1937T0(r0)
            boolean r5 = r7.f3318I
            boolean r6 = r7.f3329x
            r0 = r8
            r4 = r7
            int r8 = androidx.recyclerview.widget.C0594i0.m2079b(r0, r1, r2, r3, r4, r5, r6)
            return r8
    }

    /* renamed from: R0 */
    public final int m1935R0(androidx.recyclerview.widget.RecyclerView.C0569y r7) {
            r6 = this;
            int r0 = r6.m1891z()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            androidx.recyclerview.widget.c0 r1 = r6.f3323r
            boolean r0 = r6.f3318I
            r0 = r0 ^ 1
            android.view.View r2 = r6.m1938U0(r0)
            boolean r0 = r6.f3318I
            r0 = r0 ^ 1
            android.view.View r3 = r6.m1937T0(r0)
            boolean r5 = r6.f3318I
            r0 = r7
            r4 = r6
            int r7 = androidx.recyclerview.widget.C0594i0.m2080c(r0, r1, r2, r3, r4, r5)
            return r7
    }

    /* renamed from: S0 */
    public final int m1936S0(androidx.recyclerview.widget.RecyclerView.C0564t r18, androidx.recyclerview.widget.C0611v r19, androidx.recyclerview.widget.RecyclerView.C0569y r20) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            java.util.BitSet r0 = r6.f3330y
            int r1 = r6.f3321p
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.v r0 = r6.f3327v
            boolean r0 = r0.f3631i
            if (r0 == 0) goto L20
            int r0 = r8.f3627e
            if (r0 != r10) goto L1d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L30
        L1d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L30
        L20:
            int r0 = r8.f3627e
            if (r0 != r10) goto L2a
            int r0 = r8.f3629g
            int r1 = r8.f3624b
            int r0 = r0 + r1
            goto L2f
        L2a:
            int r0 = r8.f3628f
            int r1 = r8.f3624b
            int r0 = r0 - r1
        L2f:
            r13 = r0
        L30:
            int r0 = r8.f3627e
            r6.m1958o1(r0, r13)
            boolean r0 = r6.f3329x
            if (r0 == 0) goto L40
            androidx.recyclerview.widget.c0 r0 = r6.f3323r
            int r0 = r0.mo2002g()
            goto L46
        L40:
            androidx.recyclerview.widget.c0 r0 = r6.f3323r
            int r0 = r0.mo2006k()
        L46:
            r14 = r0
            r0 = 0
        L48:
            int r1 = r8.f3625c
            if (r1 < 0) goto L54
            int r2 = r20.m1930b()
            if (r1 >= r2) goto L54
            r1 = 1
            goto L55
        L54:
            r1 = 0
        L55:
            r2 = -1
            if (r1 == 0) goto L1e7
            androidx.recyclerview.widget.v r1 = r6.f3327v
            boolean r1 = r1.f3631i
            if (r1 != 0) goto L66
            java.util.BitSet r1 = r6.f3330y
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1e7
        L66:
            int r0 = r8.f3625c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r7.m1918j(r0, r9, r3)
            android.view.View r15 = r0.f3208a
            int r0 = r8.f3625c
            int r1 = r8.f3626d
            int r0 = r0 + r1
            r8.f3625c = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r0
            int r1 = r0.m1897a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r3 = r6.f3311B
            int[] r3 = r3.f3341a
            if (r3 == 0) goto L91
            int r4 = r3.length
            if (r1 < r4) goto L8e
            goto L91
        L8e:
            r3 = r3[r1]
            goto L92
        L91:
            r3 = -1
        L92:
            if (r3 != r2) goto L96
            r4 = 1
            goto L97
        L96:
            r4 = 0
        L97:
            if (r4 == 0) goto Lf5
            int r3 = r8.f3627e
            boolean r3 = r6.m1950g1(r3)
            if (r3 == 0) goto La7
            int r3 = r6.f3321p
            int r3 = r3 - r10
            r4 = -1
            r5 = -1
            goto Lac
        La7:
            int r3 = r6.f3321p
            r4 = r3
            r3 = 0
            r5 = 1
        Lac:
            int r11 = r8.f3627e
            r16 = 0
            if (r11 != r10) goto Lce
            androidx.recyclerview.widget.c0 r11 = r6.f3323r
            int r11 = r11.mo2006k()
            r12 = 2147483647(0x7fffffff, float:NaN)
        Lbb:
            if (r3 == r4) goto Le7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r6.f3322q
            r2 = r2[r3]
            int r9 = r2.m1977h(r11)
            if (r9 >= r12) goto Lca
            r16 = r2
            r12 = r9
        Lca:
            int r3 = r3 + r5
            r2 = -1
            r9 = 0
            goto Lbb
        Lce:
            androidx.recyclerview.widget.c0 r2 = r6.f3323r
            int r2 = r2.mo2002g()
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        Ld6:
            if (r3 == r4) goto Le7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r6.f3322q
            r11 = r11[r3]
            int r12 = r11.m1980k(r2)
            if (r12 <= r9) goto Le5
            r16 = r11
            r9 = r12
        Le5:
            int r3 = r3 + r5
            goto Ld6
        Le7:
            r2 = r16
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r3 = r6.f3311B
            r3.m1965b(r1)
            int[] r3 = r3.f3341a
            int r4 = r2.f3361e
            r3[r1] = r4
            goto Lf9
        Lf5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f3322q
            r2 = r1[r3]
        Lf9:
            r9 = r2
            r0.f3340e = r9
            int r1 = r8.f3627e
            if (r1 != r10) goto L106
            r1 = -1
            r2 = 0
            r6.m1875d(r15, r1, r2)
            goto L10a
        L106:
            r2 = 0
            r6.m1875d(r15, r2, r2)
        L10a:
            int r1 = r6.f3325t
            if (r1 != r10) goto L12d
            int r1 = r6.f3326u
            int r3 = r6.f3251l
            int r4 = r0.width
            int r1 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r3, r2, r4, r2)
            int r2 = r6.f3254o
            int r3 = r6.f3252m
            int r4 = r17.m1867Q()
            int r5 = r17.m1864N()
            int r5 = r5 + r4
            int r4 = r0.height
            int r2 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r2, r3, r5, r4, r10)
            r5 = 0
            goto L14b
        L12d:
            int r1 = r6.f3253n
            int r2 = r6.f3251l
            int r3 = r17.m1865O()
            int r4 = r17.m1866P()
            int r4 = r4 + r3
            int r3 = r0.width
            int r1 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r1, r2, r4, r3, r10)
            int r2 = r6.f3326u
            int r3 = r6.f3252m
            int r4 = r0.height
            r5 = 0
            int r2 = androidx.recyclerview.widget.RecyclerView.AbstractC0557m.m1842A(r2, r3, r5, r4, r5)
        L14b:
            r6.m1948e1(r15, r1, r2, r5)
            int r1 = r8.f3627e
            if (r1 != r10) goto L15e
            int r1 = r9.m1977h(r14)
            androidx.recyclerview.widget.c0 r2 = r6.f3323r
            int r2 = r2.mo1998c(r15)
            int r2 = r2 + r1
            goto L16a
        L15e:
            int r2 = r9.m1980k(r14)
            androidx.recyclerview.widget.c0 r1 = r6.f3323r
            int r1 = r1.mo1998c(r15)
            int r1 = r2 - r1
        L16a:
            int r3 = r8.f3627e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f3340e
            if (r3 != r10) goto L174
            r0.m1970a(r15)
            goto L177
        L174:
            r0.m1983n(r15)
        L177:
            boolean r0 = r17.m1947d1()
            if (r0 == 0) goto L19b
            int r0 = r6.f3325t
            if (r0 != r10) goto L19b
            androidx.recyclerview.widget.c0 r0 = r6.f3324s
            int r0 = r0.mo2002g()
            int r3 = r6.f3321p
            int r3 = r3 - r10
            int r4 = r9.f3361e
            int r3 = r3 - r4
            int r4 = r6.f3326u
            int r3 = r3 * r4
            int r0 = r0 - r3
            androidx.recyclerview.widget.c0 r3 = r6.f3324s
            int r3 = r3.mo1998c(r15)
            int r3 = r0 - r3
            goto L1af
        L19b:
            int r0 = r9.f3361e
            int r3 = r6.f3326u
            int r0 = r0 * r3
            androidx.recyclerview.widget.c0 r3 = r6.f3324s
            int r3 = r3.mo2006k()
            int r3 = r3 + r0
            androidx.recyclerview.widget.c0 r0 = r6.f3324s
            int r0 = r0.mo1998c(r15)
            int r0 = r0 + r3
        L1af:
            int r4 = r6.f3325t
            if (r4 != r10) goto L1b8
            r4 = r0
            r5 = r2
            r2 = r3
            r3 = r1
            goto L1bb
        L1b8:
            r5 = r0
            r4 = r2
            r2 = r1
        L1bb:
            r0 = r17
            r1 = r15
            r0.m1870X(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.v r0 = r6.f3327v
            int r0 = r0.f3627e
            r6.m1960q1(r9, r0, r13)
            androidx.recyclerview.widget.v r0 = r6.f3327v
            r6.m1952i1(r7, r0)
            androidx.recyclerview.widget.v r0 = r6.f3327v
            boolean r0 = r0.f3630h
            if (r0 == 0) goto L1e2
            boolean r0 = r15.hasFocusable()
            if (r0 == 0) goto L1e2
            java.util.BitSet r0 = r6.f3330y
            int r1 = r9.f3361e
            r2 = 0
            r0.set(r1, r2)
            goto L1e3
        L1e2:
            r2 = 0
        L1e3:
            r0 = 1
            r9 = 0
            goto L48
        L1e7:
            r2 = 0
            if (r0 != 0) goto L1ef
            androidx.recyclerview.widget.v r0 = r6.f3327v
            r6.m1952i1(r7, r0)
        L1ef:
            androidx.recyclerview.widget.v r0 = r6.f3327v
            int r0 = r0.f3627e
            r1 = -1
            if (r0 != r1) goto L208
            androidx.recyclerview.widget.c0 r0 = r6.f3323r
            int r0 = r0.mo2006k()
            int r0 = r6.m1944a1(r0)
            androidx.recyclerview.widget.c0 r1 = r6.f3323r
            int r1 = r1.mo2006k()
            int r1 = r1 - r0
            goto L21a
        L208:
            androidx.recyclerview.widget.c0 r0 = r6.f3323r
            int r0 = r0.mo2002g()
            int r0 = r6.m1943Z0(r0)
            androidx.recyclerview.widget.c0 r1 = r6.f3323r
            int r1 = r1.mo2002g()
            int r1 = r0 - r1
        L21a:
            if (r1 <= 0) goto L223
            int r0 = r8.f3624b
            int r9 = java.lang.Math.min(r0, r1)
            goto L224
        L223:
            r9 = 0
        L224:
            return r9
    }

    /* renamed from: T0 */
    public android.view.View m1937T0(boolean r8) {
            r7 = this;
            androidx.recyclerview.widget.c0 r0 = r7.f3323r
            int r0 = r0.mo2006k()
            androidx.recyclerview.widget.c0 r1 = r7.f3323r
            int r1 = r1.mo2002g()
            int r2 = r7.m1891z()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.m1889y(r2)
            androidx.recyclerview.widget.c0 r5 = r7.f3323r
            int r5 = r5.mo2000e(r4)
            androidx.recyclerview.widget.c0 r6 = r7.f3323r
            int r6 = r6.mo1997b(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    /* renamed from: U0 */
    public android.view.View m1938U0(boolean r9) {
            r8 = this;
            androidx.recyclerview.widget.c0 r0 = r8.f3323r
            int r0 = r0.mo2006k()
            androidx.recyclerview.widget.c0 r1 = r8.f3323r
            int r1 = r1.mo2002g()
            int r2 = r8.m1891z()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.m1889y(r4)
            androidx.recyclerview.widget.c0 r6 = r8.f3323r
            int r6 = r6.mo2000e(r5)
            androidx.recyclerview.widget.c0 r7 = r8.f3323r
            int r7 = r7.mo1997b(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: V */
    public boolean mo1671V() {
            r1 = this;
            int r0 = r1.f3312C
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: V0 */
    public final void m1939V0(androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, boolean r5) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r2.m1943Z0(r0)
            if (r1 != r0) goto L9
            return
        L9:
            androidx.recyclerview.widget.c0 r0 = r2.f3323r
            int r0 = r0.mo2002g()
            int r0 = r0 - r1
            if (r0 <= 0) goto L22
            int r1 = -r0
            int r3 = r2.m1956m1(r1, r3, r4)
            int r3 = -r3
            int r0 = r0 - r3
            if (r5 == 0) goto L22
            if (r0 <= 0) goto L22
            androidx.recyclerview.widget.c0 r3 = r2.f3323r
            r3.mo2010p(r0)
        L22:
            return
    }

    /* renamed from: W0 */
    public final void m1940W0(androidx.recyclerview.widget.RecyclerView.C0564t r3, androidx.recyclerview.widget.RecyclerView.C0569y r4, boolean r5) {
            r2 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r2.m1944a1(r0)
            if (r1 != r0) goto La
            return
        La:
            androidx.recyclerview.widget.c0 r0 = r2.f3323r
            int r0 = r0.mo2006k()
            int r1 = r1 - r0
            if (r1 <= 0) goto L22
            int r3 = r2.m1956m1(r1, r3, r4)
            int r1 = r1 - r3
            if (r5 == 0) goto L22
            if (r1 <= 0) goto L22
            androidx.recyclerview.widget.c0 r3 = r2.f3323r
            int r4 = -r1
            r3.mo2010p(r4)
        L22:
            return
    }

    /* renamed from: X0 */
    public int m1941X0() {
            r2 = this;
            int r0 = r2.m1891z()
            r1 = 0
            if (r0 != 0) goto L8
            goto L10
        L8:
            android.view.View r0 = r2.m1889y(r1)
            int r1 = r2.m1868R(r0)
        L10:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: Y */
    public void mo1871Y(int r5) {
            r4 = this;
            super.mo1871Y(r5)
            r0 = 0
        L4:
            int r1 = r4.f3321p
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3322q
            r1 = r1[r0]
            int r2 = r1.f3358b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f3358b = r2
        L15:
            int r2 = r1.f3359c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f3359c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    /* renamed from: Y0 */
    public int m1942Y0() {
            r1 = this;
            int r0 = r1.m1891z()
            if (r0 != 0) goto L8
            r0 = 0
            goto L12
        L8:
            int r0 = r0 + (-1)
            android.view.View r0 = r1.m1889y(r0)
            int r0 = r1.m1868R(r0)
        L12:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: Z */
    public void mo1872Z(int r5) {
            r4 = this;
            super.mo1872Z(r5)
            r0 = 0
        L4:
            int r1 = r4.f3321p
            if (r0 >= r1) goto L1f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3322q
            r1 = r1[r0]
            int r2 = r1.f3358b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f3358b = r2
        L15:
            int r2 = r1.f3359c
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f3359c = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    /* renamed from: Z0 */
    public final int m1943Z0(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f3322q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1977h(r4)
            r1 = 1
        La:
            int r2 = r3.f3321p
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f3322q
            r2 = r2[r1]
            int r2 = r2.m1977h(r4)
            if (r2 <= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0568x.b
    /* renamed from: a */
    public android.graphics.PointF mo1677a(int r4) {
            r3 = this;
            int r4 = r3.m1931N0(r4)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            int r1 = r3.f3325t
            r2 = 0
            if (r1 != 0) goto L18
            float r4 = (float) r4
            r0.x = r4
            r0.y = r2
            goto L1d
        L18:
            r0.x = r2
            float r4 = (float) r4
            r0.y = r4
        L1d:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: a0 */
    public void mo1873a0(androidx.recyclerview.widget.RecyclerView.AbstractC0549e r1, androidx.recyclerview.widget.RecyclerView.AbstractC0549e r2) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r0.f3311B
            r1.m1964a()
            r1 = 0
        L6:
            int r2 = r0.f3321p
            if (r1 >= r2) goto L14
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r0.f3322q
            r2 = r2[r1]
            r2.m1973d()
            int r1 = r1 + 1
            goto L6
        L14:
            return
    }

    /* renamed from: a1 */
    public final int m1944a1(int r4) {
            r3 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r3.f3322q
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.m1980k(r4)
            r1 = 1
        La:
            int r2 = r3.f3321p
            if (r1 >= r2) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r3.f3322q
            r2 = r2[r1]
            int r2 = r2.m1980k(r4)
            if (r2 >= r0) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto La
        L1c:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: b0 */
    public void mo1680b0(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.C0564t r3) {
            r1 = this;
            java.lang.Runnable r3 = r1.f3320K
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3241b
            if (r0 == 0) goto L9
            r0.removeCallbacks(r3)
        L9:
            r3 = 0
        La:
            int r0 = r1.f3321p
            if (r3 >= r0) goto L18
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r0 = r1.f3322q
            r0 = r0[r3]
            r0.m1973d()
            int r3 = r3 + 1
            goto La
        L18:
            r2.requestLayout()
            return
    }

    /* renamed from: b1 */
    public final void m1945b1(int r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r6.f3329x
            if (r0 == 0) goto L9
            int r0 = r6.m1942Y0()
            goto Ld
        L9:
            int r0 = r6.m1941X0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3311B
            r4.m1967d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3311B
            r9.m1969f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3311B
            r7.m1968e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3311B
            r9.m1969f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3311B
            r9.m1968e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f3329x
            if (r7 == 0) goto L4d
            int r7 = r6.m1941X0()
            goto L51
        L4d:
            int r7 = r6.m1942Y0()
        L51:
            if (r3 > r7) goto L56
            r6.m1890y0()
        L56:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: c0 */
    public android.view.View mo1633c0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C0564t r11, androidx.recyclerview.widget.RecyclerView.C0569y r12) {
            r8 = this;
            int r0 = r8.m1891z()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r9 = r8.m1883t(r9)
            if (r9 != 0) goto Lf
            return r1
        Lf:
            r8.m1955l1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L4f
            r4 = 2
            if (r10 == r4) goto L43
            r4 = 17
            if (r10 == r4) goto L3b
            r4 = 33
            if (r10 == r4) goto L36
            r4 = 66
            if (r10 == r4) goto L31
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L2c
            goto L40
        L2c:
            int r10 = r8.f3325t
            if (r10 != r3) goto L40
            goto L5a
        L31:
            int r10 = r8.f3325t
            if (r10 != 0) goto L40
            goto L5a
        L36:
            int r10 = r8.f3325t
            if (r10 != r3) goto L40
            goto L5c
        L3b:
            int r10 = r8.f3325t
            if (r10 != 0) goto L40
            goto L5c
        L40:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L5d
        L43:
            int r10 = r8.f3325t
            if (r10 != r3) goto L48
            goto L5a
        L48:
            boolean r10 = r8.m1947d1()
            if (r10 == 0) goto L5a
            goto L5c
        L4f:
            int r10 = r8.f3325t
            if (r10 != r3) goto L54
            goto L5c
        L54:
            boolean r10 = r8.m1947d1()
            if (r10 == 0) goto L5c
        L5a:
            r10 = 1
            goto L5d
        L5c:
            r10 = -1
        L5d:
            if (r10 != r0) goto L60
            return r1
        L60:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f3340e
            if (r10 != r3) goto L72
            int r4 = r8.m1942Y0()
            goto L76
        L72:
            int r4 = r8.m1941X0()
        L76:
            r8.m1959p1(r4, r12)
            r8.m1957n1(r10)
            androidx.recyclerview.widget.v r5 = r8.f3327v
            int r6 = r5.f3626d
            int r6 = r6 + r4
            r5.f3625c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.c0 r7 = r8.f3323r
            int r7 = r7.mo2007l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f3624b = r6
            androidx.recyclerview.widget.v r5 = r8.f3327v
            r5.f3630h = r3
            r6 = 0
            r5.f3623a = r6
            r8.m1936S0(r11, r5, r12)
            boolean r11 = r8.f3329x
            r8.f3313D = r11
            android.view.View r11 = r0.m1978i(r4, r10)
            if (r11 == 0) goto La9
            if (r11 == r9) goto La9
            return r11
        La9:
            boolean r11 = r8.m1950g1(r10)
            if (r11 == 0) goto Lc4
            int r11 = r8.f3321p
            int r11 = r11 - r3
        Lb2:
            if (r11 < 0) goto Ld9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f3322q
            r12 = r12[r11]
            android.view.View r12 = r12.m1978i(r4, r10)
            if (r12 == 0) goto Lc1
            if (r12 == r9) goto Lc1
            return r12
        Lc1:
            int r11 = r11 + (-1)
            goto Lb2
        Lc4:
            r11 = 0
        Lc5:
            int r12 = r8.f3321p
            if (r11 >= r12) goto Ld9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f3322q
            r12 = r12[r11]
            android.view.View r12 = r12.m1978i(r4, r10)
            if (r12 == 0) goto Ld6
            if (r12 == r9) goto Ld6
            return r12
        Ld6:
            int r11 = r11 + 1
            goto Lc5
        Ld9:
            boolean r11 = r8.f3328w
            r11 = r11 ^ r3
            if (r10 != r2) goto Le0
            r12 = 1
            goto Le1
        Le0:
            r12 = 0
        Le1:
            if (r11 != r12) goto Le5
            r11 = 1
            goto Le6
        Le5:
            r11 = 0
        Le6:
            if (r11 == 0) goto Led
            int r12 = r0.m1974e()
            goto Lf1
        Led:
            int r12 = r0.m1975f()
        Lf1:
            android.view.View r12 = r8.mo1706u(r12)
            if (r12 == 0) goto Lfa
            if (r12 == r9) goto Lfa
            return r12
        Lfa:
            boolean r10 = r8.m1950g1(r10)
            if (r10 == 0) goto L127
            int r10 = r8.f3321p
            int r10 = r10 - r3
        L103:
            if (r10 < 0) goto L148
            int r12 = r0.f3361e
            if (r10 != r12) goto L10a
            goto L124
        L10a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f3322q
            if (r11 == 0) goto L115
            r12 = r12[r10]
            int r12 = r12.m1974e()
            goto L11b
        L115:
            r12 = r12[r10]
            int r12 = r12.m1975f()
        L11b:
            android.view.View r12 = r8.mo1706u(r12)
            if (r12 == 0) goto L124
            if (r12 == r9) goto L124
            return r12
        L124:
            int r10 = r10 + (-1)
            goto L103
        L127:
            int r10 = r8.f3321p
            if (r6 >= r10) goto L148
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f3322q
            if (r11 == 0) goto L136
            r10 = r10[r6]
            int r10 = r10.m1974e()
            goto L13c
        L136:
            r10 = r10[r6]
            int r10 = r10.m1975f()
        L13c:
            android.view.View r10 = r8.mo1706u(r10)
            if (r10 == 0) goto L145
            if (r10 == r9) goto L145
            return r10
        L145:
            int r6 = r6 + 1
            goto L127
        L148:
            return r1
    }

    /* renamed from: c1 */
    public android.view.View m1946c1() {
            r12 = this;
            int r0 = r12.m1891z()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3321p
            r2.<init>(r3)
            int r3 = r12.f3321p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3325t
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m1947d1()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f3329x
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Leb
            android.view.View r7 = r12.m1889y(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3340e
            int r9 = r9.f3361e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L98
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3340e
            boolean r10 = r12.f3329x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L6a
            int r10 = r9.f3359c
            if (r10 == r11) goto L51
            goto L56
        L51:
            r9.m1971b()
            int r10 = r9.f3359c
        L56:
            androidx.recyclerview.widget.c0 r11 = r12.f3323r
            int r11 = r11.mo2002g()
            if (r10 >= r11) goto L8d
            java.util.ArrayList<android.view.View> r10 = r9.f3357a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L82
        L6a:
            int r10 = r9.f3358b
            if (r10 == r11) goto L6f
            goto L74
        L6f:
            r9.m1972c()
            int r10 = r9.f3358b
        L74:
            androidx.recyclerview.widget.c0 r11 = r12.f3323r
            int r11 = r11.mo2006k()
            if (r10 <= r11) goto L8d
            java.util.ArrayList<android.view.View> r10 = r9.f3357a
            java.lang.Object r10 = r10.get(r4)
        L82:
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.m1979j(r10)
            java.util.Objects.requireNonNull(r9)
            r9 = 1
            goto L8e
        L8d:
            r9 = 0
        L8e:
            if (r9 == 0) goto L91
            return r7
        L91:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f3340e
            int r9 = r9.f3361e
            r2.clear(r9)
        L98:
            int r9 = r0 + r5
            if (r9 == r6) goto Le8
            android.view.View r9 = r12.m1889y(r9)
            boolean r10 = r12.f3329x
            if (r10 == 0) goto Lb6
            androidx.recyclerview.widget.c0 r10 = r12.f3323r
            int r10 = r10.mo1997b(r7)
            androidx.recyclerview.widget.c0 r11 = r12.f3323r
            int r11 = r11.mo1997b(r9)
            if (r10 >= r11) goto Lb3
            return r7
        Lb3:
            if (r10 != r11) goto Lc9
            goto Lc7
        Lb6:
            androidx.recyclerview.widget.c0 r10 = r12.f3323r
            int r10 = r10.mo2000e(r7)
            androidx.recyclerview.widget.c0 r11 = r12.f3323r
            int r11 = r11.mo2000e(r9)
            if (r10 <= r11) goto Lc5
            return r7
        Lc5:
            if (r10 != r11) goto Lc9
        Lc7:
            r10 = 1
            goto Lca
        Lc9:
            r10 = 0
        Lca:
            if (r10 == 0) goto Le8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f3340e
            int r8 = r8.f3361e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f3340e
            int r9 = r9.f3361e
            int r8 = r8 - r9
            if (r8 >= 0) goto Ldf
            r8 = 1
            goto Le0
        Ldf:
            r8 = 0
        Le0:
            if (r3 >= 0) goto Le4
            r9 = 1
            goto Le5
        Le4:
            r9 = 0
        Le5:
            if (r8 == r9) goto Le8
            return r7
        Le8:
            int r0 = r0 + r5
            goto L2e
        Leb:
            r0 = 0
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: d0 */
    public void mo1682d0(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            super.mo1682d0(r3)
            int r0 = r2.m1891z()
            if (r0 <= 0) goto L2f
            r0 = 0
            android.view.View r1 = r2.m1938U0(r0)
            android.view.View r0 = r2.m1937T0(r0)
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L17
            goto L2f
        L17:
            int r1 = r2.m1868R(r1)
            int r0 = r2.m1868R(r0)
            if (r1 >= r0) goto L28
            r3.setFromIndex(r1)
            r3.setToIndex(r0)
            goto L2f
        L28:
            r3.setFromIndex(r0)
            r3.setToIndex(r1)
        L2f:
            return
    }

    /* renamed from: d1 */
    public boolean m1947d1() {
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
    /* renamed from: e */
    public void mo1684e(java.lang.String r2) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r1.f3315F
            if (r0 != 0) goto Lb
            androidx.recyclerview.widget.RecyclerView r0 = r1.f3241b
            if (r0 == 0) goto Lb
            r0.m1758i(r2)
        Lb:
            return
    }

    /* renamed from: e1 */
    public final void m1948e1(android.view.View r5, int r6, int r7, boolean r8) {
            r4 = this;
            android.graphics.Rect r0 = r4.f3316G
            r4.m1877f(r5, r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r0
            int r1 = r0.leftMargin
            android.graphics.Rect r2 = r4.f3316G
            int r3 = r2.left
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r2 = r2.right
            int r3 = r3 + r2
            int r6 = r4.m1961r1(r6, r1, r3)
            int r1 = r0.topMargin
            android.graphics.Rect r2 = r4.f3316G
            int r3 = r2.top
            int r1 = r1 + r3
            int r3 = r0.bottomMargin
            int r2 = r2.bottom
            int r3 = r3 + r2
            int r7 = r4.m1961r1(r7, r1, r3)
            if (r8 == 0) goto L32
            boolean r8 = r4.m1859J0(r5, r6, r7, r0)
            goto L36
        L32:
            boolean r8 = r4.m1856H0(r5, r6, r7, r0)
        L36:
            if (r8 == 0) goto L3b
            r5.measure(r6, r7)
        L3b:
            return
    }

    /* renamed from: f1 */
    public final void m1949f1(androidx.recyclerview.widget.RecyclerView.C0564t r12, androidx.recyclerview.widget.RecyclerView.C0569y r13, boolean r14) {
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f3317H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f3315F
            r2 = -1
            if (r1 != 0) goto Lb
            int r1 = r11.f3331z
            if (r1 == r2) goto L18
        Lb:
            int r1 = r13.m1930b()
            if (r1 != 0) goto L18
            r11.m1882s0(r12)
            r0.m1963b()
            return
        L18:
            boolean r1 = r0.f3337e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L29
            int r1 = r11.f3331z
            if (r1 != r2) goto L29
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.f3315F
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L1e7
            r0.m1963b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            if (r6 == 0) goto Lb8
            int r7 = r6.f3349a0
            r8 = 0
            if (r7 <= 0) goto L7d
            int r9 = r11.f3321p
            if (r7 != r9) goto L6f
            r6 = 0
        L3f:
            int r7 = r11.f3321p
            if (r6 >= r7) goto L7d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f3322q
            r7 = r7[r6]
            r7.m1973d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f3315F
            int[] r9 = r7.f3350b0
            r9 = r9[r6]
            if (r9 == r5) goto L64
            boolean r7 = r7.f3355g0
            if (r7 == 0) goto L5d
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2002g()
            goto L63
        L5d:
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2006k()
        L63:
            int r9 = r9 + r7
        L64:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f3322q
            r7 = r7[r6]
            r7.f3358b = r9
            r7.f3359c = r9
            int r6 = r6 + 1
            goto L3f
        L6f:
            r6.f3350b0 = r8
            r6.f3349a0 = r4
            r6.f3351c0 = r4
            r6.f3352d0 = r8
            r6.f3353e0 = r8
            int r7 = r6.f3348Z
            r6.f3347Y = r7
        L7d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            boolean r7 = r6.f3356h0
            r11.f3314E = r7
            boolean r6 = r6.f3354f0
            r11.mo1684e(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.f3315F
            if (r7 == 0) goto L92
            boolean r8 = r7.f3354f0
            if (r8 == r6) goto L92
            r7.f3354f0 = r6
        L92:
            r11.f3328w = r6
            r11.m1890y0()
            r11.m1955l1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            int r7 = r6.f3347Y
            if (r7 == r2) goto La5
            r11.f3331z = r7
            boolean r7 = r6.f3355g0
            goto La7
        La5:
            boolean r7 = r11.f3329x
        La7:
            r0.f3335c = r7
            int r7 = r6.f3351c0
            if (r7 <= r3) goto Lbf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.f3311B
            int[] r8 = r6.f3352d0
            r7.f3341a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f3353e0
            r7.f3342b = r6
            goto Lbf
        Lb8:
            r11.m1955l1()
            boolean r6 = r11.f3329x
            r0.f3335c = r6
        Lbf:
            boolean r6 = r13.f3302g
            if (r6 != 0) goto L1a8
            int r6 = r11.f3331z
            if (r6 != r2) goto Lc9
            goto L1a8
        Lc9:
            if (r6 < 0) goto L1a4
            int r7 = r13.m1930b()
            if (r6 < r7) goto Ld3
            goto L1a4
        Ld3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            if (r6 == 0) goto Le8
            int r7 = r6.f3347Y
            if (r7 == r2) goto Le8
            int r6 = r6.f3349a0
            if (r6 >= r3) goto Le0
            goto Le8
        Le0:
            r0.f3334b = r5
            int r6 = r11.f3331z
            r0.f3333a = r6
            goto L1a2
        Le8:
            int r6 = r11.f3331z
            android.view.View r6 = r11.mo1706u(r6)
            if (r6 == 0) goto L170
            boolean r7 = r11.f3329x
            if (r7 == 0) goto Lf9
            int r7 = r11.m1942Y0()
            goto Lfd
        Lf9:
            int r7 = r11.m1941X0()
        Lfd:
            r0.f3333a = r7
            int r7 = r11.f3310A
            if (r7 == r5) goto L128
            boolean r7 = r0.f3335c
            if (r7 == 0) goto L117
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2002g()
            int r8 = r11.f3310A
            int r7 = r7 - r8
            androidx.recyclerview.widget.c0 r8 = r11.f3323r
            int r6 = r8.mo1997b(r6)
            goto L126
        L117:
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2006k()
            int r8 = r11.f3310A
            int r7 = r7 + r8
            androidx.recyclerview.widget.c0 r8 = r11.f3323r
            int r6 = r8.mo2000e(r6)
        L126:
            int r7 = r7 - r6
            goto L16a
        L128:
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo1998c(r6)
            androidx.recyclerview.widget.c0 r8 = r11.f3323r
            int r8 = r8.mo2007l()
            if (r7 <= r8) goto L148
            boolean r6 = r0.f3335c
            if (r6 == 0) goto L141
            androidx.recyclerview.widget.c0 r6 = r11.f3323r
            int r6 = r6.mo2002g()
            goto L158
        L141:
            androidx.recyclerview.widget.c0 r6 = r11.f3323r
            int r6 = r6.mo2006k()
            goto L158
        L148:
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2000e(r6)
            androidx.recyclerview.widget.c0 r8 = r11.f3323r
            int r8 = r8.mo2006k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L15b
            int r6 = -r7
        L158:
            r0.f3334b = r6
            goto L1a2
        L15b:
            androidx.recyclerview.widget.c0 r7 = r11.f3323r
            int r7 = r7.mo2002g()
            androidx.recyclerview.widget.c0 r8 = r11.f3323r
            int r6 = r8.mo1997b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L16d
        L16a:
            r0.f3334b = r7
            goto L1a2
        L16d:
            r0.f3334b = r5
            goto L1a2
        L170:
            int r6 = r11.f3331z
            r0.f3333a = r6
            int r7 = r11.f3310A
            if (r7 != r5) goto L187
            int r6 = r11.m1931N0(r6)
            if (r6 != r3) goto L180
            r6 = 1
            goto L181
        L180:
            r6 = 0
        L181:
            r0.f3335c = r6
            r0.m1962a()
            goto L1a0
        L187:
            boolean r6 = r0.f3335c
            if (r6 == 0) goto L195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r0.f3339g
            androidx.recyclerview.widget.c0 r6 = r6.f3323r
            int r6 = r6.mo2002g()
            int r6 = r6 - r7
            goto L19e
        L195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r0.f3339g
            androidx.recyclerview.widget.c0 r6 = r6.f3323r
            int r6 = r6.mo2006k()
            int r6 = r6 + r7
        L19e:
            r0.f3334b = r6
        L1a0:
            r0.f3336d = r3
        L1a2:
            r6 = 1
            goto L1a9
        L1a4:
            r11.f3331z = r2
            r11.f3310A = r5
        L1a8:
            r6 = 0
        L1a9:
            if (r6 == 0) goto L1ac
            goto L1e5
        L1ac:
            boolean r6 = r11.f3313D
            int r7 = r13.m1930b()
            if (r6 == 0) goto L1c8
            int r6 = r11.m1891z()
        L1b8:
            int r6 = r6 + r2
            if (r6 < 0) goto L1e0
            android.view.View r8 = r11.m1889y(r6)
            int r8 = r11.m1868R(r8)
            if (r8 < 0) goto L1b8
            if (r8 >= r7) goto L1b8
            goto L1e1
        L1c8:
            int r6 = r11.m1891z()
            r8 = 0
        L1cd:
            if (r8 >= r6) goto L1e0
            android.view.View r9 = r11.m1889y(r8)
            int r9 = r11.m1868R(r9)
            if (r9 < 0) goto L1dd
            if (r9 >= r7) goto L1dd
            r8 = r9
            goto L1e1
        L1dd:
            int r8 = r8 + 1
            goto L1cd
        L1e0:
            r8 = 0
        L1e1:
            r0.f3333a = r8
            r0.f3334b = r5
        L1e5:
            r0.f3337e = r3
        L1e7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            if (r6 != 0) goto L204
            int r6 = r11.f3331z
            if (r6 != r2) goto L204
            boolean r6 = r0.f3335c
            boolean r7 = r11.f3313D
            if (r6 != r7) goto L1fd
            boolean r6 = r11.m1947d1()
            boolean r7 = r11.f3314E
            if (r6 == r7) goto L204
        L1fd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.f3311B
            r6.m1964a()
            r0.f3336d = r3
        L204:
            int r6 = r11.m1891z()
            if (r6 <= 0) goto L2bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.f3315F
            if (r6 == 0) goto L212
            int r6 = r6.f3349a0
            if (r6 >= r3) goto L2bc
        L212:
            boolean r6 = r0.f3336d
            if (r6 == 0) goto L231
            r1 = 0
        L217:
            int r6 = r11.f3321p
            if (r1 >= r6) goto L2bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f3322q
            r6 = r6[r1]
            r6.m1973d()
            int r6 = r0.f3334b
            if (r6 == r5) goto L22e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f3322q
            r7 = r7[r1]
            r7.f3358b = r6
            r7.f3359c = r6
        L22e:
            int r1 = r1 + 1
            goto L217
        L231:
            if (r1 != 0) goto L253
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f3317H
            int[] r1 = r1.f3338f
            if (r1 != 0) goto L23a
            goto L253
        L23a:
            r1 = 0
        L23b:
            int r6 = r11.f3321p
            if (r1 >= r6) goto L2bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f3322q
            r6 = r6[r1]
            r6.m1973d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f3317H
            int[] r7 = r7.f3338f
            r7 = r7[r1]
            r6.f3358b = r7
            r6.f3359c = r7
            int r1 = r1 + 1
            goto L23b
        L253:
            r1 = 0
        L254:
            int r6 = r11.f3321p
            if (r1 >= r6) goto L294
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f3322q
            r6 = r6[r1]
            boolean r7 = r11.f3329x
            int r8 = r0.f3334b
            if (r7 == 0) goto L267
            int r9 = r6.m1977h(r5)
            goto L26b
        L267:
            int r9 = r6.m1980k(r5)
        L26b:
            r6.m1973d()
            if (r9 != r5) goto L271
            goto L291
        L271:
            if (r7 == 0) goto L27d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = r6.f3362f
            androidx.recyclerview.widget.c0 r10 = r10.f3323r
            int r10 = r10.mo2002g()
            if (r9 < r10) goto L291
        L27d:
            if (r7 != 0) goto L28a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = r6.f3362f
            androidx.recyclerview.widget.c0 r7 = r7.f3323r
            int r7 = r7.mo2006k()
            if (r9 <= r7) goto L28a
            goto L291
        L28a:
            if (r8 == r5) goto L28d
            int r9 = r9 + r8
        L28d:
            r6.f3359c = r9
            r6.f3358b = r9
        L291:
            int r1 = r1 + 1
            goto L254
        L294:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f3317H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f3322q
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f3338f
            if (r8 == 0) goto L2a3
            int r8 = r8.length
            if (r8 >= r7) goto L2ac
        L2a3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = r1.f3339g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f3322q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f3338f = r8
        L2ac:
            r8 = 0
        L2ad:
            if (r8 >= r7) goto L2bc
            int[] r9 = r1.f3338f
            r10 = r6[r8]
            int r10 = r10.m1980k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L2ad
        L2bc:
            r11.m1881s(r12)
            androidx.recyclerview.widget.v r1 = r11.f3327v
            r1.f3623a = r4
            androidx.recyclerview.widget.c0 r1 = r11.f3324s
            int r1 = r1.mo2007l()
            int r6 = r11.f3321p
            int r6 = r1 / r6
            r11.f3326u = r6
            androidx.recyclerview.widget.c0 r6 = r11.f3324s
            int r6 = r6.mo2004i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f3333a
            r11.m1959p1(r1, r13)
            boolean r1 = r0.f3335c
            if (r1 == 0) goto L2ed
            r11.m1957n1(r2)
            androidx.recyclerview.widget.v r1 = r11.f3327v
            r11.m1936S0(r12, r1, r13)
            r11.m1957n1(r3)
            goto L2f8
        L2ed:
            r11.m1957n1(r3)
            androidx.recyclerview.widget.v r1 = r11.f3327v
            r11.m1936S0(r12, r1, r13)
            r11.m1957n1(r2)
        L2f8:
            androidx.recyclerview.widget.v r1 = r11.f3327v
            int r2 = r0.f3333a
            int r6 = r1.f3626d
            int r2 = r2 + r6
            r1.f3625c = r2
            r11.m1936S0(r12, r1, r13)
            androidx.recyclerview.widget.c0 r1 = r11.f3324s
            int r1 = r1.mo2004i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L310
            goto L3b4
        L310:
            r1 = 0
            int r2 = r11.m1891z()
            r6 = 0
        L316:
            if (r6 >= r2) goto L338
            android.view.View r7 = r11.m1889y(r6)
            androidx.recyclerview.widget.c0 r8 = r11.f3324s
            int r8 = r8.mo1998c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L328
            goto L335
        L328:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L335:
            int r6 = r6 + 1
            goto L316
        L338:
            int r6 = r11.f3326u
            int r7 = r11.f3321p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.c0 r7 = r11.f3324s
            int r7 = r7.mo2004i()
            if (r7 != r5) goto L355
            androidx.recyclerview.widget.c0 r5 = r11.f3324s
            int r5 = r5.mo2007l()
            int r1 = java.lang.Math.min(r1, r5)
        L355:
            int r5 = r11.f3321p
            int r5 = r1 / r5
            r11.f3326u = r5
            androidx.recyclerview.widget.c0 r5 = r11.f3324s
            int r5 = r5.mo2004i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f3326u
            if (r1 != r6) goto L369
            goto L3b4
        L369:
            r1 = 0
        L36a:
            if (r1 >= r2) goto L3b4
            android.view.View r5 = r11.m1889y(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.m1947d1()
            if (r8 == 0) goto L39b
            int r8 = r11.f3325t
            if (r8 != r3) goto L39b
            int r8 = r11.f3321p
            int r9 = r8 + (-1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f3340e
            int r7 = r7.f3361e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f3326u
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L3b1
        L39b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f3340e
            int r7 = r7.f3361e
            int r8 = r11.f3326u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f3325t
            int r8 = r8 - r7
            if (r9 != r3) goto L3ae
            r5.offsetLeftAndRight(r8)
            goto L3b1
        L3ae:
            r5.offsetTopAndBottom(r8)
        L3b1:
            int r1 = r1 + 1
            goto L36a
        L3b4:
            int r1 = r11.m1891z()
            if (r1 <= 0) goto L3cb
            boolean r1 = r11.f3329x
            if (r1 == 0) goto L3c5
            r11.m1939V0(r12, r13, r3)
            r11.m1940W0(r12, r13, r4)
            goto L3cb
        L3c5:
            r11.m1940W0(r12, r13, r3)
            r11.m1939V0(r12, r13, r4)
        L3cb:
            if (r14 == 0) goto L3f6
            boolean r14 = r13.f3302g
            if (r14 != 0) goto L3f6
            int r14 = r11.f3312C
            if (r14 == 0) goto L3e3
            int r14 = r11.m1891z()
            if (r14 <= 0) goto L3e3
            android.view.View r14 = r11.m1946c1()
            if (r14 == 0) goto L3e3
            r14 = 1
            goto L3e4
        L3e3:
            r14 = 0
        L3e4:
            if (r14 == 0) goto L3f6
            java.lang.Runnable r14 = r11.f3320K
            androidx.recyclerview.widget.RecyclerView r1 = r11.f3241b
            if (r1 == 0) goto L3ef
            r1.removeCallbacks(r14)
        L3ef:
            boolean r14 = r11.m1932O0()
            if (r14 == 0) goto L3f6
            goto L3f7
        L3f6:
            r3 = 0
        L3f7:
            boolean r14 = r13.f3302g
            if (r14 == 0) goto L400
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f3317H
            r14.m1963b()
        L400:
            boolean r14 = r0.f3335c
            r11.f3313D = r14
            boolean r14 = r11.m1947d1()
            r11.f3314E = r14
            if (r3 == 0) goto L414
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f3317H
            r14.m1963b()
            r11.m1949f1(r12, r13, r4)
        L414:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: g */
    public boolean mo1687g() {
            r1 = this;
            int r0 = r1.f3325t
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: g1 */
    public final boolean m1950g1(int r5) {
            r4 = this;
            int r0 = r4.f3325t
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L13
            if (r5 != r1) goto Lb
            r5 = 1
            goto Lc
        Lb:
            r5 = 0
        Lc:
            boolean r0 = r4.f3329x
            if (r5 == r0) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
        L13:
            if (r5 != r1) goto L17
            r5 = 1
            goto L18
        L17:
            r5 = 0
        L18:
            boolean r0 = r4.f3329x
            if (r5 != r0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            boolean r0 = r4.m1947d1()
            if (r5 != r0) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: h */
    public boolean mo1689h() {
            r2 = this;
            int r0 = r2.f3325t
            r1 = 1
            if (r0 != r1) goto L6
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: h0 */
    public void mo1635h0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.m1945b1(r2, r3, r1)
            return
    }

    /* renamed from: h1 */
    public void m1951h1(int r5, androidx.recyclerview.widget.RecyclerView.C0569y r6) {
            r4 = this;
            r0 = 1
            if (r5 <= 0) goto L9
            int r1 = r4.m1942Y0()
            r2 = 1
            goto L10
        L9:
            r1 = -1
            int r2 = r4.m1941X0()
            r1 = r2
            r2 = -1
        L10:
            androidx.recyclerview.widget.v r3 = r4.f3327v
            r3.f3623a = r0
            r4.m1959p1(r1, r6)
            r4.m1957n1(r2)
            androidx.recyclerview.widget.v r6 = r4.f3327v
            int r0 = r6.f3626d
            int r1 = r1 + r0
            r6.f3625c = r1
            int r5 = java.lang.Math.abs(r5)
            r6.f3624b = r5
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: i */
    public boolean mo1637i(androidx.recyclerview.widget.RecyclerView.C0558n r1) {
            r0 = this;
            boolean r1 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: i0 */
    public void mo1638i0(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r0.f3311B
            r1.m1964a()
            r0.m1890y0()
            return
    }

    /* renamed from: i1 */
    public final void m1952i1(androidx.recyclerview.widget.RecyclerView.C0564t r5, androidx.recyclerview.widget.C0611v r6) {
            r4 = this;
            boolean r0 = r6.f3623a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f3631i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f3624b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f3627e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f3629g
        L15:
            r4.m1953j1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f3628f
        L1b:
            r4.m1954k1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f3627e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f3628f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3322q
            r1 = r1[r2]
            int r1 = r1.m1980k(r0)
        L2f:
            int r2 = r4.f3321p
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3322q
            r2 = r2[r3]
            int r2 = r2.m1980k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f3629g
            int r6 = r6.f3624b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f3629g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f3322q
            r1 = r1[r2]
            int r1 = r1.m1977h(r0)
        L5a:
            int r2 = r4.f3321p
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3322q
            r2 = r2[r3]
            int r2 = r2.m1977h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f3629g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f3628f
            int r6 = r6.f3624b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: j0 */
    public void mo1640j0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
            r0 = this;
            r1 = 8
            r0.m1945b1(r2, r3, r1)
            return
    }

    /* renamed from: j1 */
    public final void m1953j1(androidx.recyclerview.widget.RecyclerView.C0564t r6, int r7) {
            r5 = this;
            int r0 = r5.m1891z()
            r1 = 1
            int r0 = r0 - r1
        L6:
            if (r0 < 0) goto L3b
            android.view.View r2 = r5.m1889y(r0)
            androidx.recyclerview.widget.c0 r3 = r5.f3323r
            int r3 = r3.mo2000e(r2)
            if (r3 < r7) goto L3b
            androidx.recyclerview.widget.c0 r3 = r5.f3323r
            int r3 = r3.mo2009o(r2)
            if (r3 < r7) goto L3b
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r3
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r4 = r3.f3340e
            java.util.ArrayList<android.view.View> r4 = r4.f3357a
            int r4 = r4.size()
            if (r4 != r1) goto L30
            return
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r3 = r3.f3340e
            r3.m1981l()
            r5.m1885u0(r2, r6)
            int r0 = r0 + (-1)
            goto L6
        L3b:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: k */
    public void mo1691k(int r5, int r6, androidx.recyclerview.widget.RecyclerView.C0569y r7, androidx.recyclerview.widget.RecyclerView.AbstractC0557m.c r8) {
            r4 = this;
            int r0 = r4.f3325t
            if (r0 != 0) goto L5
            goto L6
        L5:
            r5 = r6
        L6:
            int r6 = r4.m1891z()
            if (r6 == 0) goto L88
            if (r5 != 0) goto L10
            goto L88
        L10:
            r4.m1951h1(r5, r7)
            int[] r5 = r4.f3319J
            if (r5 == 0) goto L1c
            int r5 = r5.length
            int r6 = r4.f3321p
            if (r5 >= r6) goto L22
        L1c:
            int r5 = r4.f3321p
            int[] r5 = new int[r5]
            r4.f3319J = r5
        L22:
            r5 = 0
            r6 = 0
            r0 = 0
        L25:
            int r1 = r4.f3321p
            if (r6 >= r1) goto L55
            androidx.recyclerview.widget.v r1 = r4.f3327v
            int r2 = r1.f3626d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f3628f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3322q
            r2 = r2[r6]
            int r2 = r2.m1980k(r1)
            goto L49
        L3b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f3322q
            r2 = r2[r6]
            int r1 = r1.f3629g
            int r1 = r2.m1977h(r1)
            androidx.recyclerview.widget.v r2 = r4.f3327v
            int r2 = r2.f3629g
        L49:
            int r1 = r1 - r2
            if (r1 < 0) goto L52
            int[] r2 = r4.f3319J
            r2[r0] = r1
            int r0 = r0 + 1
        L52:
            int r6 = r6 + 1
            goto L25
        L55:
            int[] r6 = r4.f3319J
            java.util.Arrays.sort(r6, r5, r0)
            r6 = 0
        L5b:
            if (r6 >= r0) goto L88
            androidx.recyclerview.widget.v r1 = r4.f3327v
            int r1 = r1.f3625c
            if (r1 < 0) goto L6b
            int r2 = r7.m1930b()
            if (r1 >= r2) goto L6b
            r1 = 1
            goto L6c
        L6b:
            r1 = 0
        L6c:
            if (r1 == 0) goto L88
            androidx.recyclerview.widget.v r1 = r4.f3327v
            int r1 = r1.f3625c
            int[] r2 = r4.f3319J
            r2 = r2[r6]
            r3 = r8
            androidx.recyclerview.widget.r$b r3 = (androidx.recyclerview.widget.RunnableC0607r.b) r3
            r3.m2114a(r1, r2)
            androidx.recyclerview.widget.v r1 = r4.f3327v
            int r2 = r1.f3625c
            int r3 = r1.f3626d
            int r2 = r2 + r3
            r1.f3625c = r2
            int r6 = r6 + 1
            goto L5b
        L88:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: k0 */
    public void mo1641k0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            r0.m1945b1(r2, r3, r1)
            return
    }

    /* renamed from: k1 */
    public final void m1954k1(androidx.recyclerview.widget.RecyclerView.C0564t r5, int r6) {
            r4 = this;
        L0:
            int r0 = r4.m1891z()
            if (r0 <= 0) goto L39
            r0 = 0
            android.view.View r0 = r4.m1889y(r0)
            androidx.recyclerview.widget.c0 r1 = r4.f3323r
            int r1 = r1.mo1997b(r0)
            if (r1 > r6) goto L39
            androidx.recyclerview.widget.c0 r1 = r4.f3323r
            int r1 = r1.mo2008n(r0)
            if (r1 > r6) goto L39
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0573c) r1
            java.util.Objects.requireNonNull(r1)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r2 = r1.f3340e
            java.util.ArrayList<android.view.View> r2 = r2.f3357a
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L30
            return
        L30:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = r1.f3340e
            r1.m1982m()
            r4.m1885u0(r0, r5)
            goto L0
        L39:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: l0 */
    public void mo1642l0(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r1 = 4
            r0.m1945b1(r2, r3, r1)
            return
    }

    /* renamed from: l1 */
    public final void m1955l1() {
            r2 = this;
            int r0 = r2.f3325t
            r1 = 1
            if (r0 == r1) goto L10
            boolean r0 = r2.m1947d1()
            if (r0 != 0) goto Lc
            goto L10
        Lc:
            boolean r0 = r2.f3328w
            r0 = r0 ^ r1
            goto L12
        L10:
            boolean r0 = r2.f3328w
        L12:
            r2.f3329x = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: m */
    public int mo1695m(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1933P0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: m0 */
    public void mo1643m0(androidx.recyclerview.widget.RecyclerView.C0564t r2, androidx.recyclerview.widget.RecyclerView.C0569y r3) {
            r1 = this;
            r0 = 1
            r1.m1949f1(r2, r3, r0)
            return
    }

    /* renamed from: m1 */
    public int m1956m1(int r3, androidx.recyclerview.widget.RecyclerView.C0564t r4, androidx.recyclerview.widget.RecyclerView.C0569y r5) {
            r2 = this;
            int r0 = r2.m1891z()
            r1 = 0
            if (r0 == 0) goto L31
            if (r3 != 0) goto La
            goto L31
        La:
            r2.m1951h1(r3, r5)
            androidx.recyclerview.widget.v r0 = r2.f3327v
            int r5 = r2.m1936S0(r4, r0, r5)
            androidx.recyclerview.widget.v r0 = r2.f3327v
            int r0 = r0.f3624b
            if (r0 >= r5) goto L1a
            goto L1f
        L1a:
            if (r3 >= 0) goto L1e
            int r3 = -r5
            goto L1f
        L1e:
            r3 = r5
        L1f:
            androidx.recyclerview.widget.c0 r5 = r2.f3323r
            int r0 = -r3
            r5.mo2010p(r0)
            boolean r5 = r2.f3329x
            r2.f3313D = r5
            androidx.recyclerview.widget.v r5 = r2.f3327v
            r5.f3624b = r1
            r2.m1952i1(r4, r5)
            return r3
        L31:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: n */
    public int mo1644n(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1934Q0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: n0 */
    public void mo1645n0(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            r1 = -1
            r0.f3331z = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f3310A = r1
            r1 = 0
            r0.f3315F = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r0.f3317H
            r1.m1963b()
            return
    }

    /* renamed from: n1 */
    public final void m1957n1(int r5) {
            r4 = this;
            androidx.recyclerview.widget.v r0 = r4.f3327v
            r0.f3627e = r5
            boolean r1 = r4.f3329x
            r2 = 1
            r3 = -1
            if (r5 != r3) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != r5) goto L10
            goto L11
        L10:
            r2 = -1
        L11:
            r0.f3626d = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: o */
    public int mo1646o(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1935R0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: o0 */
    public void mo1698o0(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e
            if (r0 == 0) goto L24
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0575e) r4
            r3.f3315F = r4
            int r0 = r3.f3331z
            r1 = -1
            if (r0 == r1) goto L21
            r0 = 0
            r4.f3350b0 = r0
            r2 = 0
            r4.f3349a0 = r2
            r4.f3347Y = r1
            r4.f3348Z = r1
            r4.f3350b0 = r0
            r4.f3349a0 = r2
            r4.f3351c0 = r2
            r4.f3352d0 = r0
            r4.f3353e0 = r0
        L21:
            r3.m1890y0()
        L24:
            return
    }

    /* renamed from: o1 */
    public final void m1958o1(int r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f3321p
            if (r0 >= r1) goto L1c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f3322q
            r1 = r1[r0]
            java.util.ArrayList<android.view.View> r1 = r1.f3357a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L19
        L12:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r2.f3322q
            r1 = r1[r0]
            r2.m1960q1(r1, r3, r4)
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: p */
    public int mo1700p(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1933P0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: p0 */
    public android.os.Parcelable mo1701p0() {
            r5 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r5.f3315F
            if (r0 == 0) goto La
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r1.<init>(r0)
            return r1
        La:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r5.f3328w
            r0.f3354f0 = r1
            boolean r1 = r5.f3313D
            r0.f3355g0 = r1
            boolean r1 = r5.f3314E
            r0.f3356h0 = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r5.f3311B
            r2 = 0
            if (r1 == 0) goto L2e
            int[] r3 = r1.f3341a
            if (r3 == 0) goto L2e
            r0.f3352d0 = r3
            int r3 = r3.length
            r0.f3351c0 = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f3342b
            r0.f3353e0 = r1
            goto L30
        L2e:
            r0.f3351c0 = r2
        L30:
            int r1 = r5.m1891z()
            r3 = -1
            if (r1 <= 0) goto L98
            boolean r1 = r5.f3313D
            if (r1 == 0) goto L40
            int r1 = r5.m1942Y0()
            goto L44
        L40:
            int r1 = r5.m1941X0()
        L44:
            r0.f3347Y = r1
            boolean r1 = r5.f3329x
            r4 = 1
            if (r1 == 0) goto L50
            android.view.View r1 = r5.m1937T0(r4)
            goto L54
        L50:
            android.view.View r1 = r5.m1938U0(r4)
        L54:
            if (r1 != 0) goto L57
            goto L5b
        L57:
            int r3 = r5.m1868R(r1)
        L5b:
            r0.f3348Z = r3
            int r1 = r5.f3321p
            r0.f3349a0 = r1
            int[] r1 = new int[r1]
            r0.f3350b0 = r1
        L65:
            int r1 = r5.f3321p
            if (r2 >= r1) goto L9e
            boolean r1 = r5.f3313D
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L80
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.f3322q
            r1 = r1[r2]
            int r1 = r1.m1977h(r3)
            if (r1 == r3) goto L91
            androidx.recyclerview.widget.c0 r3 = r5.f3323r
            int r3 = r3.mo2002g()
            goto L90
        L80:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r5.f3322q
            r1 = r1[r2]
            int r1 = r1.m1980k(r3)
            if (r1 == r3) goto L91
            androidx.recyclerview.widget.c0 r3 = r5.f3323r
            int r3 = r3.mo2006k()
        L90:
            int r1 = r1 - r3
        L91:
            int[] r3 = r0.f3350b0
            r3[r2] = r1
            int r2 = r2 + 1
            goto L65
        L98:
            r0.f3347Y = r3
            r0.f3348Z = r3
            r0.f3349a0 = r2
        L9e:
            return r0
    }

    /* renamed from: p1 */
    public final void m1959p1(int r5, androidx.recyclerview.widget.RecyclerView.C0569y r6) {
            r4 = this;
            androidx.recyclerview.widget.v r0 = r4.f3327v
            r1 = 0
            r0.f3624b = r1
            r0.f3625c = r5
            androidx.recyclerview.widget.RecyclerView$x r0 = r4.f3244e
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.f3285e
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L33
            int r6 = r6.f3296a
            r0 = -1
            if (r6 == r0) goto L33
            boolean r0 = r4.f3329x
            if (r6 >= r5) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r0 != r5) goto L2a
            androidx.recyclerview.widget.c0 r5 = r4.f3323r
            int r5 = r5.mo2007l()
            goto L34
        L2a:
            androidx.recyclerview.widget.c0 r5 = r4.f3323r
            int r5 = r5.mo2007l()
            r6 = r5
            r5 = 0
            goto L35
        L33:
            r5 = 0
        L34:
            r6 = 0
        L35:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3241b
            if (r0 == 0) goto L3f
            boolean r0 = r0.f3160g0
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L59
            androidx.recyclerview.widget.v r0 = r4.f3327v
            androidx.recyclerview.widget.c0 r3 = r4.f3323r
            int r3 = r3.mo2006k()
            int r3 = r3 - r6
            r0.f3628f = r3
            androidx.recyclerview.widget.v r6 = r4.f3327v
            androidx.recyclerview.widget.c0 r0 = r4.f3323r
            int r0 = r0.mo2002g()
            int r0 = r0 + r5
            r6.f3629g = r0
            goto L69
        L59:
            androidx.recyclerview.widget.v r0 = r4.f3327v
            androidx.recyclerview.widget.c0 r3 = r4.f3323r
            int r3 = r3.mo2001f()
            int r3 = r3 + r5
            r0.f3629g = r3
            androidx.recyclerview.widget.v r5 = r4.f3327v
            int r6 = -r6
            r5.f3628f = r6
        L69:
            androidx.recyclerview.widget.v r5 = r4.f3327v
            r5.f3630h = r1
            r5.f3623a = r2
            androidx.recyclerview.widget.c0 r6 = r4.f3323r
            int r6 = r6.mo2004i()
            if (r6 != 0) goto L80
            androidx.recyclerview.widget.c0 r6 = r4.f3323r
            int r6 = r6.mo2001f()
            if (r6 != 0) goto L80
            r1 = 1
        L80:
            r5.f3631i = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: q */
    public int mo1647q(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1934Q0(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: q0 */
    public void mo1879q0(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.m1932O0()
        L5:
            return
    }

    /* renamed from: q1 */
    public final void m1960q1(androidx.recyclerview.widget.StaggeredGridLayoutManager.C0576f r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.f3360d
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r1) goto L15
            int r5 = r4.f3358b
            if (r5 == r2) goto Lc
            goto L11
        Lc:
            r4.m1972c()
            int r5 = r4.f3358b
        L11:
            int r5 = r5 + r0
            if (r5 > r6) goto L2a
            goto L22
        L15:
            int r5 = r4.f3359c
            if (r5 == r2) goto L1a
            goto L1f
        L1a:
            r4.m1971b()
            int r5 = r4.f3359c
        L1f:
            int r5 = r5 - r0
            if (r5 < r6) goto L2a
        L22:
            java.util.BitSet r5 = r3.f3330y
            int r4 = r4.f3361e
            r6 = 0
            r5.set(r4, r6)
        L2a:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: r */
    public int mo1649r(androidx.recyclerview.widget.RecyclerView.C0569y r1) {
            r0 = this;
            int r1 = r0.m1935R0(r1)
            return r1
    }

    /* renamed from: r1 */
    public final int m1961r1(int r3, int r4, int r5) {
            r2 = this;
            if (r4 != 0) goto L5
            if (r5 != 0) goto L5
            return r3
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L13
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L12
            goto L13
        L12:
            return r3
        L13:
            r1 = 0
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r1, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            return r3
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: v */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1651v() {
            r3 = this;
            int r0 = r3.f3325t
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r1, r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: w */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1653w(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: x */
    public androidx.recyclerview.widget.RecyclerView.C0558n mo1655x(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$c
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0557m
    /* renamed from: z0 */
    public int mo1658z0(int r1, androidx.recyclerview.widget.RecyclerView.C0564t r2, androidx.recyclerview.widget.RecyclerView.C0569y r3) {
            r0 = this;
            int r1 = r0.m1956m1(r1, r2, r3)
            return r1
    }
}
