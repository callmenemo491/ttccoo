package p381w;

/* renamed from: w.d */
/* loaded from: classes.dex */
public class C6763d {

    /* renamed from: a */
    public java.util.HashSet<p381w.C6763d> f26086a;

    /* renamed from: b */
    public int f26087b;

    /* renamed from: c */
    public boolean f26088c;

    /* renamed from: d */
    public final p381w.C6765f f26089d;

    /* renamed from: e */
    public final p381w.C6763d.a f26090e;

    /* renamed from: f */
    public p381w.C6763d f26091f;

    /* renamed from: g */
    public int f26092g;

    /* renamed from: h */
    public int f26093h;

    /* renamed from: i */
    public p365v.C6481h f26094i;

    /* renamed from: w.d$a */
    public enum a extends java.lang.Enum<p381w.C6763d.a> {

        /* renamed from: Y */
        public static final p381w.C6763d.a f26095Y = null;

        /* renamed from: Z */
        public static final p381w.C6763d.a f26096Z = null;

        /* renamed from: a0 */
        public static final p381w.C6763d.a f26097a0 = null;

        /* renamed from: b0 */
        public static final p381w.C6763d.a f26098b0 = null;

        /* renamed from: c0 */
        public static final p381w.C6763d.a f26099c0 = null;

        /* renamed from: d0 */
        public static final p381w.C6763d.a f26100d0 = null;

        /* renamed from: e0 */
        public static final p381w.C6763d.a f26101e0 = null;

        /* renamed from: f0 */
        public static final p381w.C6763d.a f26102f0 = null;

        /* renamed from: g0 */
        public static final /* synthetic */ p381w.C6763d.a[] f26103g0 = null;

        static {
                w.d$a r0 = new w.d$a
                java.lang.String r1 = "NONE"
                r2 = 0
                r0.<init>(r1, r2)
                w.d$a r1 = new w.d$a
                java.lang.String r3 = "LEFT"
                r4 = 1
                r1.<init>(r3, r4)
                p381w.C6763d.a.f26095Y = r1
                w.d$a r3 = new w.d$a
                java.lang.String r5 = "TOP"
                r6 = 2
                r3.<init>(r5, r6)
                p381w.C6763d.a.f26096Z = r3
                w.d$a r5 = new w.d$a
                java.lang.String r7 = "RIGHT"
                r8 = 3
                r5.<init>(r7, r8)
                p381w.C6763d.a.f26097a0 = r5
                w.d$a r7 = new w.d$a
                java.lang.String r9 = "BOTTOM"
                r10 = 4
                r7.<init>(r9, r10)
                p381w.C6763d.a.f26098b0 = r7
                w.d$a r9 = new w.d$a
                java.lang.String r11 = "BASELINE"
                r12 = 5
                r9.<init>(r11, r12)
                p381w.C6763d.a.f26099c0 = r9
                w.d$a r11 = new w.d$a
                java.lang.String r13 = "CENTER"
                r14 = 6
                r11.<init>(r13, r14)
                p381w.C6763d.a.f26100d0 = r11
                w.d$a r13 = new w.d$a
                java.lang.String r15 = "CENTER_X"
                r14 = 7
                r13.<init>(r15, r14)
                p381w.C6763d.a.f26101e0 = r13
                w.d$a r15 = new w.d$a
                java.lang.String r14 = "CENTER_Y"
                r12 = 8
                r15.<init>(r14, r12)
                p381w.C6763d.a.f26102f0 = r15
                r14 = 9
                w.d$a[] r14 = new p381w.C6763d.a[r14]
                r14[r2] = r0
                r14[r4] = r1
                r14[r6] = r3
                r14[r8] = r5
                r14[r10] = r7
                r0 = 5
                r14[r0] = r9
                r0 = 6
                r14[r0] = r11
                r0 = 7
                r14[r0] = r13
                r14[r12] = r15
                p381w.C6763d.a.f26103g0 = r14
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p381w.C6763d.a valueOf(java.lang.String r1) {
                java.lang.Class<w.d$a> r0 = p381w.C6763d.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                w.d$a r1 = (p381w.C6763d.a) r1
                return r1
        }

        public static p381w.C6763d.a[] values() {
                w.d$a[] r0 = p381w.C6763d.a.f26103g0
                java.lang.Object r0 = r0.clone()
                w.d$a[] r0 = (p381w.C6763d.a[]) r0
                return r0
        }
    }

    public C6763d(p381w.C6765f r2, p381w.C6763d.a r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f26086a = r0
            r0 = 0
            r1.f26092g = r0
            r0 = -1
            r1.f26093h = r0
            r1.f26089d = r2
            r1.f26090e = r3
            return
    }

    /* renamed from: a */
    public boolean m13678a(p381w.C6763d r3, int r4, int r5, boolean r6) {
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L7
            r2.m13687j()
            return r0
        L7:
            r1 = 0
            if (r6 != 0) goto L11
            boolean r6 = r2.m13686i(r3)
            if (r6 != 0) goto L11
            return r1
        L11:
            r2.f26091f = r3
            java.util.HashSet<w.d> r6 = r3.f26086a
            if (r6 != 0) goto L1e
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r3.f26086a = r6
        L1e:
            w.d r3 = r2.f26091f
            java.util.HashSet<w.d> r3 = r3.f26086a
            if (r3 == 0) goto L27
            r3.add(r2)
        L27:
            if (r4 <= 0) goto L2c
            r2.f26092g = r4
            goto L2e
        L2c:
            r2.f26092g = r1
        L2e:
            r2.f26093h = r5
            return r0
    }

    /* renamed from: b */
    public void m13679b(int r3, java.util.ArrayList<p401x.C6907o> r4, p401x.C6907o r5) {
            r2 = this;
            java.util.HashSet<w.d> r0 = r2.f26086a
            if (r0 == 0) goto L1a
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            w.d r1 = (p381w.C6763d) r1
            w.f r1 = r1.f26089d
            p401x.C6901i.m13988a(r1, r3, r4, r5)
            goto L8
        L1a:
            return
    }

    /* renamed from: c */
    public int m13680c() {
            r1 = this;
            boolean r0 = r1.f26088c
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.f26087b
            return r0
    }

    /* renamed from: d */
    public int m13681d() {
            r3 = this;
            w.f r0 = r3.f26089d
            int r0 = r0.f26156j0
            r1 = 8
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            int r0 = r3.f26093h
            r2 = -1
            if (r0 <= r2) goto L1a
            w.d r2 = r3.f26091f
            if (r2 == 0) goto L1a
            w.f r2 = r2.f26089d
            int r2 = r2.f26156j0
            if (r2 != r1) goto L1a
            return r0
        L1a:
            int r0 = r3.f26092g
            return r0
    }

    /* renamed from: e */
    public final p381w.C6763d m13682e() {
            r2 = this;
            w.d$a r0 = r2.f26090e
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L29;
                case 1: goto L24;
                case 2: goto L1f;
                case 3: goto L1a;
                case 4: goto L15;
                case 5: goto L29;
                case 6: goto L29;
                case 7: goto L29;
                case 8: goto L29;
                default: goto L9;
            }
        L9:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            w.d$a r1 = r2.f26090e
            java.lang.String r1 = r1.name()
            r0.<init>(r1)
            throw r0
        L15:
            w.f r0 = r2.f26089d
            w.d r0 = r0.f26116G
            return r0
        L1a:
            w.f r0 = r2.f26089d
            w.d r0 = r0.f26114F
            return r0
        L1f:
            w.f r0 = r2.f26089d
            w.d r0 = r0.f26119I
            return r0
        L24:
            w.f r0 = r2.f26089d
            w.d r0 = r0.f26118H
            return r0
        L29:
            r0 = 0
            return r0
    }

    /* renamed from: f */
    public boolean m13683f() {
            r3 = this;
            java.util.HashSet<w.d> r0 = r3.f26086a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            w.d r2 = (p381w.C6763d) r2
            w.d r2 = r2.m13682e()
            boolean r2 = r2.m13685h()
            if (r2 == 0) goto La
            r0 = 1
            return r0
        L22:
            return r1
    }

    /* renamed from: g */
    public boolean m13684g() {
            r2 = this;
            java.util.HashSet<w.d> r0 = r2.f26086a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.size()
            if (r0 <= 0) goto Ld
            r1 = 1
        Ld:
            return r1
    }

    /* renamed from: h */
    public boolean m13685h() {
            r1 = this;
            w.d r0 = r1.f26091f
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* renamed from: i */
    public boolean m13686i(p381w.C6763d r8) {
            r7 = this;
            w.d$a r0 = p381w.C6763d.a.f26102f0
            w.d$a r1 = p381w.C6763d.a.f26101e0
            w.d$a r2 = p381w.C6763d.a.f26099c0
            r3 = 0
            if (r8 != 0) goto La
            return r3
        La:
            w.d$a r4 = r8.f26090e
            w.d$a r5 = r7.f26090e
            r6 = 1
            if (r4 != r5) goto L21
            if (r5 != r2) goto L20
            w.f r8 = r8.f26089d
            boolean r8 = r8.f26104A
            if (r8 == 0) goto L1f
            w.f r8 = r7.f26089d
            boolean r8 = r8.f26104A
            if (r8 != 0) goto L20
        L1f:
            return r3
        L20:
            return r6
        L21:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L6e;
                case 1: goto L55;
                case 2: goto L3c;
                case 3: goto L55;
                case 4: goto L3c;
                case 5: goto L6e;
                case 6: goto L34;
                case 7: goto L6e;
                case 8: goto L6e;
                default: goto L28;
            }
        L28:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            w.d$a r0 = r7.f26090e
            java.lang.String r0 = r0.name()
            r8.<init>(r0)
            throw r8
        L34:
            if (r4 == r2) goto L3b
            if (r4 == r1) goto L3b
            if (r4 == r0) goto L3b
            r3 = 1
        L3b:
            return r3
        L3c:
            w.d$a r1 = p381w.C6763d.a.f26096Z
            if (r4 == r1) goto L47
            w.d$a r1 = p381w.C6763d.a.f26098b0
            if (r4 != r1) goto L45
            goto L47
        L45:
            r1 = 0
            goto L48
        L47:
            r1 = 1
        L48:
            w.f r8 = r8.f26089d
            boolean r8 = r8 instanceof p381w.C6768i
            if (r8 == 0) goto L54
            if (r1 != 0) goto L52
            if (r4 != r0) goto L53
        L52:
            r3 = 1
        L53:
            r1 = r3
        L54:
            return r1
        L55:
            w.d$a r0 = p381w.C6763d.a.f26095Y
            if (r4 == r0) goto L60
            w.d$a r0 = p381w.C6763d.a.f26097a0
            if (r4 != r0) goto L5e
            goto L60
        L5e:
            r0 = 0
            goto L61
        L60:
            r0 = 1
        L61:
            w.f r8 = r8.f26089d
            boolean r8 = r8 instanceof p381w.C6768i
            if (r8 == 0) goto L6d
            if (r0 != 0) goto L6b
            if (r4 != r1) goto L6c
        L6b:
            r3 = 1
        L6c:
            r0 = r3
        L6d:
            return r0
        L6e:
            return r3
    }

    /* renamed from: j */
    public void m13687j() {
            r2 = this;
            w.d r0 = r2.f26091f
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashSet<w.d> r0 = r0.f26086a
            if (r0 == 0) goto L1a
            r0.remove(r2)
            w.d r0 = r2.f26091f
            java.util.HashSet<w.d> r0 = r0.f26086a
            int r0 = r0.size()
            if (r0 != 0) goto L1a
            w.d r0 = r2.f26091f
            r0.f26086a = r1
        L1a:
            r2.f26086a = r1
            r2.f26091f = r1
            r0 = 0
            r2.f26092g = r0
            r1 = -1
            r2.f26093h = r1
            r2.f26088c = r0
            r2.f26087b = r0
            return
    }

    /* renamed from: k */
    public void m13688k() {
            r2 = this;
            v.h r0 = r2.f26094i
            if (r0 != 0) goto Ld
            v.h r0 = new v.h
            r1 = 1
            r0.<init>(r1)
            r2.f26094i = r0
            goto L10
        Ld:
            r0.m13157c()
        L10:
            return
    }

    /* renamed from: l */
    public void m13689l(int r1) {
            r0 = this;
            r0.f26087b = r1
            r1 = 1
            r0.f26088c = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            w.f r1 = r2.f26089d
            java.lang.String r1 = r1.f26158k0
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            w.d$a r1 = r2.f26090e
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
