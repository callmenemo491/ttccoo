package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C0604o {

    /* renamed from: a */
    public static final java.util.Comparator<androidx.recyclerview.widget.C0604o.c> f3488a = null;

    /* renamed from: androidx.recyclerview.widget.o$a */
    public class a implements java.util.Comparator<androidx.recyclerview.widget.C0604o.c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(androidx.recyclerview.widget.C0604o.c r1, androidx.recyclerview.widget.C0604o.c r2) {
                r0 = this;
                androidx.recyclerview.widget.o$c r1 = (androidx.recyclerview.widget.C0604o.c) r1
                androidx.recyclerview.widget.o$c r2 = (androidx.recyclerview.widget.C0604o.c) r2
                int r1 = r1.f3489a
                int r2 = r2.f3489a
                int r1 = r1 - r2
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    public static abstract class b {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract boolean mo2017a(int r1, int r2);

        /* renamed from: b */
        public abstract boolean mo2018b(int r1, int r2);

        /* renamed from: c */
        public java.lang.Object mo2019c(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* renamed from: d */
        public abstract int mo2020d();

        /* renamed from: e */
        public abstract int mo2021e();
    }

    /* renamed from: androidx.recyclerview.widget.o$c */
    public static class c {

        /* renamed from: a */
        public final int f3489a;

        /* renamed from: b */
        public final int f3490b;

        /* renamed from: c */
        public final int f3491c;

        public c(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f3489a = r1
                r0.f3490b = r2
                r0.f3491c = r3
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$d */
    public static class d {

        /* renamed from: a */
        public final java.util.List<androidx.recyclerview.widget.C0604o.c> f3492a;

        /* renamed from: b */
        public final int[] f3493b;

        /* renamed from: c */
        public final int[] f3494c;

        /* renamed from: d */
        public final androidx.recyclerview.widget.C0604o.b f3495d;

        /* renamed from: e */
        public final int f3496e;

        /* renamed from: f */
        public final int f3497f;

        /* renamed from: g */
        public final boolean f3498g;

        public d(androidx.recyclerview.widget.C0604o.b r5, java.util.List<androidx.recyclerview.widget.C0604o.c> r6, int[] r7, int[] r8, boolean r9) {
                r4 = this;
                r4.<init>()
                r4.f3492a = r6
                r4.f3493b = r7
                r4.f3494c = r8
                r0 = 0
                java.util.Arrays.fill(r7, r0)
                java.util.Arrays.fill(r8, r0)
                r4.f3495d = r5
                int r7 = r5.mo2021e()
                r4.f3496e = r7
                int r5 = r5.mo2020d()
                r4.f3497f = r5
                r4.f3498g = r9
                boolean r8 = r6.isEmpty()
                if (r8 == 0) goto L28
                r8 = 0
                goto L2e
            L28:
                java.lang.Object r8 = r6.get(r0)
                androidx.recyclerview.widget.o$c r8 = (androidx.recyclerview.widget.C0604o.c) r8
            L2e:
                if (r8 == 0) goto L38
                int r9 = r8.f3489a
                if (r9 != 0) goto L38
                int r8 = r8.f3490b
                if (r8 == 0) goto L40
            L38:
                androidx.recyclerview.widget.o$c r8 = new androidx.recyclerview.widget.o$c
                r8.<init>(r0, r0, r0)
                r6.add(r0, r8)
            L40:
                androidx.recyclerview.widget.o$c r8 = new androidx.recyclerview.widget.o$c
                r8.<init>(r7, r5, r0)
                r6.add(r8)
                java.util.Iterator r5 = r6.iterator()
            L4c:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L7f
                java.lang.Object r6 = r5.next()
                androidx.recyclerview.widget.o$c r6 = (androidx.recyclerview.widget.C0604o.c) r6
                r7 = 0
            L59:
                int r8 = r6.f3491c
                if (r7 >= r8) goto L4c
                int r8 = r6.f3489a
                int r8 = r8 + r7
                int r9 = r6.f3490b
                int r9 = r9 + r7
                androidx.recyclerview.widget.o$b r1 = r4.f3495d
                boolean r1 = r1.mo2017a(r8, r9)
                if (r1 == 0) goto L6d
                r1 = 1
                goto L6e
            L6d:
                r1 = 2
            L6e:
                int[] r2 = r4.f3493b
                int r3 = r9 << 4
                r3 = r3 | r1
                r2[r8] = r3
                int[] r2 = r4.f3494c
                int r8 = r8 << 4
                r8 = r8 | r1
                r2[r9] = r8
                int r7 = r7 + 1
                goto L59
            L7f:
                boolean r5 = r4.f3498g
                if (r5 == 0) goto Lef
                java.util.List<androidx.recyclerview.widget.o$c> r5 = r4.f3492a
                java.util.Iterator r5 = r5.iterator()
                r6 = 0
            L8a:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto Lef
                java.lang.Object r7 = r5.next()
                androidx.recyclerview.widget.o$c r7 = (androidx.recyclerview.widget.C0604o.c) r7
            L96:
                int r8 = r7.f3489a
                if (r6 >= r8) goto Leb
                int[] r8 = r4.f3493b
                r8 = r8[r6]
                if (r8 != 0) goto Le8
                java.util.List<androidx.recyclerview.widget.o$c> r8 = r4.f3492a
                int r8 = r8.size()
                r9 = 0
                r1 = 0
            La8:
                if (r9 >= r8) goto Le8
                java.util.List<androidx.recyclerview.widget.o$c> r2 = r4.f3492a
                java.lang.Object r2 = r2.get(r9)
                androidx.recyclerview.widget.o$c r2 = (androidx.recyclerview.widget.C0604o.c) r2
            Lb2:
                int r3 = r2.f3490b
                if (r1 >= r3) goto Le2
                int[] r3 = r4.f3494c
                r3 = r3[r1]
                if (r3 != 0) goto Ldf
                androidx.recyclerview.widget.o$b r3 = r4.f3495d
                boolean r3 = r3.mo2018b(r6, r1)
                if (r3 == 0) goto Ldf
                androidx.recyclerview.widget.o$b r8 = r4.f3495d
                boolean r8 = r8.mo2017a(r6, r1)
                if (r8 == 0) goto Lcf
                r8 = 8
                goto Ld0
            Lcf:
                r8 = 4
            Ld0:
                int[] r9 = r4.f3493b
                int r2 = r1 << 4
                r2 = r2 | r8
                r9[r6] = r2
                int[] r9 = r4.f3494c
                int r2 = r6 << 4
                r8 = r8 | r2
                r9[r1] = r8
                goto Le8
            Ldf:
                int r1 = r1 + 1
                goto Lb2
            Le2:
                int r1 = r2.f3491c
                int r1 = r1 + r3
                int r9 = r9 + 1
                goto La8
            Le8:
                int r6 = r6 + 1
                goto L96
            Leb:
                int r6 = r7.f3491c
                int r6 = r6 + r8
                goto L8a
            Lef:
                return
        }

        /* renamed from: b */
        public static androidx.recyclerview.widget.C0604o.f m2097b(java.util.Collection<androidx.recyclerview.widget.C0604o.f> r2, int r3, boolean r4) {
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1c
                java.lang.Object r0 = r2.next()
                androidx.recyclerview.widget.o$f r0 = (androidx.recyclerview.widget.C0604o.f) r0
                int r1 = r0.f3499a
                if (r1 != r3) goto L4
                boolean r1 = r0.f3501c
                if (r1 != r4) goto L4
                r2.remove()
                goto L1d
            L1c:
                r0 = 0
            L1d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r2.next()
                androidx.recyclerview.widget.o$f r3 = (androidx.recyclerview.widget.C0604o.f) r3
                int r1 = r3.f3500b
                if (r4 == 0) goto L30
                int r1 = r1 + (-1)
                goto L32
            L30:
                int r1 = r1 + 1
            L32:
                r3.f3500b = r1
                goto L1d
            L35:
                return r0
        }

        /* renamed from: a */
        public void m2098a(androidx.recyclerview.widget.InterfaceC0614y r13) {
                r12 = this;
                boolean r0 = r13 instanceof androidx.recyclerview.widget.C0587f
                if (r0 == 0) goto L7
                androidx.recyclerview.widget.f r13 = (androidx.recyclerview.widget.C0587f) r13
                goto Ld
            L7:
                androidx.recyclerview.widget.f r0 = new androidx.recyclerview.widget.f
                r0.<init>(r13)
                r13 = r0
            Ld:
                int r0 = r12.f3496e
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                int r2 = r12.f3496e
                int r3 = r12.f3497f
                java.util.List<androidx.recyclerview.widget.o$c> r4 = r12.f3492a
                int r4 = r4.size()
                r5 = 1
                int r4 = r4 - r5
            L20:
                if (r4 < 0) goto Ld3
                java.util.List<androidx.recyclerview.widget.o$c> r6 = r12.f3492a
                java.lang.Object r6 = r6.get(r4)
                androidx.recyclerview.widget.o$c r6 = (androidx.recyclerview.widget.C0604o.c) r6
                int r7 = r6.f3489a
                int r8 = r6.f3491c
                int r7 = r7 + r8
                int r9 = r6.f3490b
                int r9 = r9 + r8
            L32:
                r8 = 0
                if (r2 <= r7) goto L6f
                int r2 = r2 + (-1)
                int[] r10 = r12.f3493b
                r10 = r10[r2]
                r11 = r10 & 12
                if (r11 == 0) goto L69
                int r11 = r10 >> 4
                androidx.recyclerview.widget.o$f r8 = m2097b(r1, r11, r8)
                if (r8 == 0) goto L5d
                int r8 = r8.f3500b
                int r8 = r0 - r8
                int r8 = r8 - r5
                r13.mo2012b(r2, r8)
                r10 = r10 & 4
                if (r10 == 0) goto L32
                androidx.recyclerview.widget.o$b r10 = r12.f3495d
                java.lang.Object r10 = r10.mo2019c(r2, r11)
                r13.mo2014d(r8, r5, r10)
                goto L32
            L5d:
                androidx.recyclerview.widget.o$f r8 = new androidx.recyclerview.widget.o$f
                int r10 = r0 - r2
                int r10 = r10 - r5
                r8.<init>(r2, r10, r5)
                r1.add(r8)
                goto L32
            L69:
                r13.mo2011a(r2, r5)
                int r0 = r0 + (-1)
                goto L32
            L6f:
                if (r3 <= r9) goto Laa
                int r3 = r3 + (-1)
                int[] r7 = r12.f3494c
                r7 = r7[r3]
                r10 = r7 & 12
                if (r10 == 0) goto La4
                int r10 = r7 >> 4
                androidx.recyclerview.widget.o$f r11 = m2097b(r1, r10, r5)
                if (r11 != 0) goto L8e
                androidx.recyclerview.widget.o$f r7 = new androidx.recyclerview.widget.o$f
                int r10 = r0 - r2
                r7.<init>(r3, r10, r8)
                r1.add(r7)
                goto L6f
            L8e:
                int r11 = r11.f3500b
                int r11 = r0 - r11
                int r11 = r11 - r5
                r13.mo2012b(r11, r2)
                r7 = r7 & 4
                if (r7 == 0) goto L6f
                androidx.recyclerview.widget.o$b r7 = r12.f3495d
                java.lang.Object r7 = r7.mo2019c(r10, r3)
                r13.mo2014d(r2, r5, r7)
                goto L6f
            La4:
                r13.mo2013c(r2, r5)
                int r0 = r0 + 1
                goto L6f
            Laa:
                int r2 = r6.f3489a
                int r3 = r6.f3490b
            Lae:
                int r7 = r6.f3491c
                if (r8 >= r7) goto Lcb
                int[] r7 = r12.f3493b
                r7 = r7[r2]
                r7 = r7 & 15
                r9 = 2
                if (r7 != r9) goto Lc4
                androidx.recyclerview.widget.o$b r7 = r12.f3495d
                java.lang.Object r7 = r7.mo2019c(r2, r3)
                r13.mo2014d(r2, r5, r7)
            Lc4:
                int r2 = r2 + 1
                int r3 = r3 + 1
                int r8 = r8 + 1
                goto Lae
            Lcb:
                int r2 = r6.f3489a
                int r3 = r6.f3490b
                int r4 = r4 + (-1)
                goto L20
            Ld3:
                r13.m2032e()
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$e */
    public static abstract class e<T> {
        public e() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract boolean mo2099a(T r1, T r2);

        /* renamed from: b */
        public abstract boolean mo2100b(T r1, T r2);

        /* renamed from: c */
        public java.lang.Object mo2101c(T r1, T r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$f */
    public static class f {

        /* renamed from: a */
        public int f3499a;

        /* renamed from: b */
        public int f3500b;

        /* renamed from: c */
        public boolean f3501c;

        public f(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.f3499a = r1
                r0.f3500b = r2
                r0.f3501c = r3
                return
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$g */
    public static class g {

        /* renamed from: a */
        public int f3502a;

        /* renamed from: b */
        public int f3503b;

        /* renamed from: c */
        public int f3504c;

        /* renamed from: d */
        public int f3505d;

        public g() {
                r0 = this;
                r0.<init>()
                return
        }

        public g(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f3502a = r1
                r0.f3503b = r2
                r0.f3504c = r3
                r0.f3505d = r4
                return
        }

        /* renamed from: a */
        public int m2102a() {
                r2 = this;
                int r0 = r2.f3505d
                int r1 = r2.f3504c
                int r0 = r0 - r1
                return r0
        }

        /* renamed from: b */
        public int m2103b() {
                r2 = this;
                int r0 = r2.f3503b
                int r1 = r2.f3502a
                int r0 = r0 - r1
                return r0
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$h */
    public static class h {

        /* renamed from: a */
        public int f3506a;

        /* renamed from: b */
        public int f3507b;

        /* renamed from: c */
        public int f3508c;

        /* renamed from: d */
        public int f3509d;

        /* renamed from: e */
        public boolean f3510e;

        public h() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public int m2104a() {
                r3 = this;
                int r0 = r3.f3508c
                int r1 = r3.f3506a
                int r0 = r0 - r1
                int r1 = r3.f3509d
                int r2 = r3.f3507b
                int r1 = r1 - r2
                int r0 = java.lang.Math.min(r0, r1)
                return r0
        }
    }

    static {
            androidx.recyclerview.widget.o$a r0 = new androidx.recyclerview.widget.o$a
            r0.<init>()
            androidx.recyclerview.widget.C0604o.f3488a = r0
            return
    }

    /* renamed from: a */
    public static androidx.recyclerview.widget.C0604o.d m2096a(androidx.recyclerview.widget.C0604o.b r21) {
            r1 = r21
            int r0 = r21.mo2021e()
            int r2 = r21.mo2020d()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            androidx.recyclerview.widget.o$g r5 = new androidx.recyclerview.widget.o$g
            r6 = 0
            r5.<init>(r6, r0, r6, r2)
            r4.add(r5)
            int r0 = r0 + r2
            r2 = 1
            int r0 = r0 + r2
            int r0 = r0 / 2
            int r0 = r0 * 2
            int r0 = r0 + r2
            int[] r5 = new int[r0]
            int r7 = r0 / 2
            int[] r8 = new int[r0]
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L30:
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L267
            int r9 = r4.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r4.remove(r9)
            androidx.recyclerview.widget.o$g r9 = (androidx.recyclerview.widget.C0604o.g) r9
            int r10 = r9.m2103b()
            if (r10 < r2) goto L1c1
            int r10 = r9.m2102a()
            if (r10 >= r2) goto L4f
            goto L1c1
        L4f:
            int r10 = r9.m2103b()
            int r12 = r9.m2102a()
            int r12 = r12 + r10
            int r12 = r12 + r2
            int r12 = r12 / 2
            int r10 = r9.f3502a
            int r13 = r2 + r7
            r5[r13] = r10
            int r10 = r9.f3503b
            r8[r13] = r10
            r10 = 0
        L66:
            if (r10 >= r12) goto L1c1
            int r13 = r9.m2103b()
            int r14 = r9.m2102a()
            int r13 = r13 - r14
            int r13 = java.lang.Math.abs(r13)
            int r13 = r13 % 2
            if (r13 != r2) goto L7b
            r13 = 1
            goto L7c
        L7b:
            r13 = 0
        L7c:
            int r14 = r9.m2103b()
            int r15 = r9.m2102a()
            int r14 = r14 - r15
            int r15 = -r10
            r11 = r15
        L87:
            if (r11 > r10) goto L10f
            if (r11 == r15) goto La4
            if (r11 == r10) goto L9c
            int r16 = r11 + 1
            int r16 = r16 + r7
            r2 = r5[r16]
            int r16 = r11 + (-1)
            int r16 = r16 + r7
            r6 = r5[r16]
            if (r2 <= r6) goto L9c
            goto La4
        L9c:
            int r2 = r11 + (-1)
            int r2 = r2 + r7
            r2 = r5[r2]
            int r6 = r2 + 1
            goto Laa
        La4:
            int r2 = r11 + 1
            int r2 = r2 + r7
            r2 = r5[r2]
            r6 = r2
        Laa:
            r16 = r12
            int r12 = r9.f3504c
            r17 = r4
            int r4 = r9.f3502a
            int r4 = r6 - r4
            int r4 = r4 + r12
            int r4 = r4 - r11
            if (r10 == 0) goto Lc0
            if (r6 == r2) goto Lbb
            goto Lc0
        Lbb:
            int r12 = r4 + (-1)
            r18 = r0
            goto Lc3
        Lc0:
            r18 = r0
            r12 = r4
        Lc3:
            int r0 = r9.f3503b
            if (r6 >= r0) goto Ld6
            int r0 = r9.f3505d
            if (r4 >= r0) goto Ld6
            boolean r0 = r1.mo2018b(r6, r4)
            if (r0 == 0) goto Ld6
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto Lc3
        Ld6:
            int r0 = r11 + r7
            r5[r0] = r6
            if (r13 == 0) goto Lfe
            int r0 = r14 - r11
            r19 = r13
            int r13 = r15 + 1
            if (r0 < r13) goto L100
            int r13 = r10 + (-1)
            if (r0 > r13) goto L100
            int r0 = r0 + r7
            r0 = r8[r0]
            if (r0 > r6) goto L100
            androidx.recyclerview.widget.o$h r0 = new androidx.recyclerview.widget.o$h
            r0.<init>()
            r0.f3506a = r2
            r0.f3507b = r12
            r0.f3508c = r6
            r0.f3509d = r4
            r2 = 0
            r0.f3510e = r2
            goto L117
        Lfe:
            r19 = r13
        L100:
            r2 = 0
            int r11 = r11 + 2
            r12 = r16
            r4 = r17
            r0 = r18
            r13 = r19
            r2 = 1
            r6 = 0
            goto L87
        L10f:
            r18 = r0
            r17 = r4
            r16 = r12
            r2 = 0
            r0 = 0
        L117:
            if (r0 == 0) goto L11e
            r11 = r0
            r19 = r9
            goto L1c8
        L11e:
            int r0 = r9.m2103b()
            int r4 = r9.m2102a()
            int r0 = r0 - r4
            int r0 = r0 % 2
            if (r0 != 0) goto L12d
            r0 = 1
            goto L12e
        L12d:
            r0 = 0
        L12e:
            int r4 = r9.m2103b()
            int r6 = r9.m2102a()
            int r4 = r4 - r6
            r6 = r15
        L138:
            if (r6 > r10) goto L1ac
            if (r6 == r15) goto L153
            if (r6 == r10) goto L14b
            int r11 = r6 + 1
            int r11 = r11 + r7
            r11 = r8[r11]
            int r12 = r6 + (-1)
            int r12 = r12 + r7
            r12 = r8[r12]
            if (r11 >= r12) goto L14b
            goto L153
        L14b:
            int r11 = r6 + (-1)
            int r11 = r11 + r7
            r11 = r8[r11]
            int r12 = r11 + (-1)
            goto L159
        L153:
            int r11 = r6 + 1
            int r11 = r11 + r7
            r11 = r8[r11]
            r12 = r11
        L159:
            int r13 = r9.f3505d
            int r14 = r9.f3503b
            int r14 = r14 - r12
            int r14 = r14 - r6
            int r13 = r13 - r14
            if (r10 == 0) goto L168
            if (r12 == r11) goto L165
            goto L168
        L165:
            int r14 = r13 + 1
            goto L169
        L168:
            r14 = r13
        L169:
            int r2 = r9.f3502a
            if (r12 <= r2) goto L182
            int r2 = r9.f3504c
            if (r13 <= r2) goto L182
            int r2 = r12 + (-1)
            r19 = r9
            int r9 = r13 + (-1)
            boolean r20 = r1.mo2018b(r2, r9)
            if (r20 == 0) goto L184
            r12 = r2
            r13 = r9
            r9 = r19
            goto L169
        L182:
            r19 = r9
        L184:
            int r2 = r6 + r7
            r8[r2] = r12
            if (r0 == 0) goto L1a6
            int r2 = r4 - r6
            if (r2 < r15) goto L1a6
            if (r2 > r10) goto L1a6
            int r2 = r2 + r7
            r2 = r5[r2]
            if (r2 < r12) goto L1a6
            androidx.recyclerview.widget.o$h r0 = new androidx.recyclerview.widget.o$h
            r0.<init>()
            r0.f3506a = r12
            r0.f3507b = r13
            r0.f3508c = r11
            r0.f3509d = r14
            r2 = 1
            r0.f3510e = r2
            goto L1af
        L1a6:
            int r6 = r6 + 2
            r9 = r19
            r2 = 0
            goto L138
        L1ac:
            r19 = r9
            r0 = 0
        L1af:
            if (r0 == 0) goto L1b3
            r11 = r0
            goto L1c8
        L1b3:
            int r10 = r10 + 1
            r12 = r16
            r4 = r17
            r0 = r18
            r9 = r19
            r2 = 1
            r6 = 0
            goto L66
        L1c1:
            r18 = r0
            r17 = r4
            r19 = r9
            r11 = 0
        L1c8:
            if (r11 == 0) goto L258
            int r0 = r11.m2104a()
            if (r0 <= 0) goto L20e
            int r0 = r11.f3509d
            int r2 = r11.f3507b
            int r0 = r0 - r2
            int r4 = r11.f3508c
            int r6 = r11.f3506a
            int r4 = r4 - r6
            if (r0 == r4) goto L1de
            r9 = 1
            goto L1df
        L1de:
            r9 = 0
        L1df:
            if (r9 == 0) goto L206
            boolean r9 = r11.f3510e
            if (r9 == 0) goto L1ef
            androidx.recyclerview.widget.o$c r0 = new androidx.recyclerview.widget.o$c
            int r4 = r11.m2104a()
            r0.<init>(r6, r2, r4)
            goto L20b
        L1ef:
            if (r0 <= r4) goto L1f3
            r0 = 1
            goto L1f4
        L1f3:
            r0 = 0
        L1f4:
            androidx.recyclerview.widget.o$c r4 = new androidx.recyclerview.widget.o$c
            if (r0 == 0) goto L1fb
            int r2 = r2 + 1
            goto L1fd
        L1fb:
            int r6 = r6 + 1
        L1fd:
            int r0 = r11.m2104a()
            r4.<init>(r6, r2, r0)
            r0 = r4
            goto L20b
        L206:
            androidx.recyclerview.widget.o$c r0 = new androidx.recyclerview.widget.o$c
            r0.<init>(r6, r2, r4)
        L20b:
            r3.add(r0)
        L20e:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L21f
            androidx.recyclerview.widget.o$g r0 = new androidx.recyclerview.widget.o$g
            r0.<init>()
            r4 = r18
            r9 = r19
            r2 = 1
            goto L22f
        L21f:
            int r0 = r18.size()
            r2 = 1
            int r0 = r0 - r2
            r4 = r18
            java.lang.Object r0 = r4.remove(r0)
            androidx.recyclerview.widget.o$g r0 = (androidx.recyclerview.widget.C0604o.g) r0
            r9 = r19
        L22f:
            int r6 = r9.f3502a
            r0.f3502a = r6
            int r6 = r9.f3504c
            r0.f3504c = r6
            int r6 = r11.f3506a
            r0.f3503b = r6
            int r6 = r11.f3507b
            r0.f3505d = r6
            r6 = r17
            r6.add(r0)
            int r0 = r9.f3503b
            r9.f3503b = r0
            int r0 = r9.f3505d
            r9.f3505d = r0
            int r0 = r11.f3508c
            r9.f3502a = r0
            int r0 = r11.f3509d
            r9.f3504c = r0
            r6.add(r9)
            goto L262
        L258:
            r6 = r17
            r4 = r18
            r9 = r19
            r2 = 1
            r4.add(r9)
        L262:
            r0 = r4
            r4 = r6
            r6 = 0
            goto L30
        L267:
            java.util.Comparator<androidx.recyclerview.widget.o$c> r0 = androidx.recyclerview.widget.C0604o.f3488a
            java.util.Collections.sort(r3, r0)
            androidx.recyclerview.widget.o$d r6 = new androidx.recyclerview.widget.o$d
            r7 = 1
            r0 = r6
            r1 = r21
            r2 = r3
            r3 = r5
            r4 = r8
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
