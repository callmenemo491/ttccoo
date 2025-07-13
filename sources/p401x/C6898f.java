package p401x;

/* renamed from: x.f */
/* loaded from: classes.dex */
public class C6898f implements p401x.InterfaceC6896d {

    /* renamed from: a */
    public p401x.InterfaceC6896d f26819a;

    /* renamed from: b */
    public boolean f26820b;

    /* renamed from: c */
    public boolean f26821c;

    /* renamed from: d */
    public p401x.AbstractC6908p f26822d;

    /* renamed from: e */
    public p401x.C6898f.a f26823e;

    /* renamed from: f */
    public int f26824f;

    /* renamed from: g */
    public int f26825g;

    /* renamed from: h */
    public int f26826h;

    /* renamed from: i */
    public p401x.C6899g f26827i;

    /* renamed from: j */
    public boolean f26828j;

    /* renamed from: k */
    public java.util.List<p401x.InterfaceC6896d> f26829k;

    /* renamed from: l */
    public java.util.List<p401x.C6898f> f26830l;

    /* renamed from: x.f$a */
    public enum a extends java.lang.Enum<p401x.C6898f.a> {

        /* renamed from: Y */
        public static final p401x.C6898f.a f26831Y = null;

        /* renamed from: Z */
        public static final p401x.C6898f.a f26832Z = null;

        /* renamed from: a0 */
        public static final p401x.C6898f.a f26833a0 = null;

        /* renamed from: b0 */
        public static final p401x.C6898f.a f26834b0 = null;

        /* renamed from: c0 */
        public static final p401x.C6898f.a f26835c0 = null;

        /* renamed from: d0 */
        public static final p401x.C6898f.a f26836d0 = null;

        /* renamed from: e0 */
        public static final p401x.C6898f.a f26837e0 = null;

        /* renamed from: f0 */
        public static final p401x.C6898f.a f26838f0 = null;

        /* renamed from: g0 */
        public static final /* synthetic */ p401x.C6898f.a[] f26839g0 = null;

        static {
                x.f$a r0 = new x.f$a
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2)
                p401x.C6898f.a.f26831Y = r0
                x.f$a r1 = new x.f$a
                java.lang.String r3 = "HORIZONTAL_DIMENSION"
                r4 = 1
                r1.<init>(r3, r4)
                p401x.C6898f.a.f26832Z = r1
                x.f$a r3 = new x.f$a
                java.lang.String r5 = "VERTICAL_DIMENSION"
                r6 = 2
                r3.<init>(r5, r6)
                p401x.C6898f.a.f26833a0 = r3
                x.f$a r5 = new x.f$a
                java.lang.String r7 = "LEFT"
                r8 = 3
                r5.<init>(r7, r8)
                p401x.C6898f.a.f26834b0 = r5
                x.f$a r7 = new x.f$a
                java.lang.String r9 = "RIGHT"
                r10 = 4
                r7.<init>(r9, r10)
                p401x.C6898f.a.f26835c0 = r7
                x.f$a r9 = new x.f$a
                java.lang.String r11 = "TOP"
                r12 = 5
                r9.<init>(r11, r12)
                p401x.C6898f.a.f26836d0 = r9
                x.f$a r11 = new x.f$a
                java.lang.String r13 = "BOTTOM"
                r14 = 6
                r11.<init>(r13, r14)
                p401x.C6898f.a.f26837e0 = r11
                x.f$a r13 = new x.f$a
                java.lang.String r15 = "BASELINE"
                r14 = 7
                r13.<init>(r15, r14)
                p401x.C6898f.a.f26838f0 = r13
                r15 = 8
                x.f$a[] r15 = new p401x.C6898f.a[r15]
                r15[r2] = r0
                r15[r4] = r1
                r15[r6] = r3
                r15[r8] = r5
                r15[r10] = r7
                r15[r12] = r9
                r0 = 6
                r15[r0] = r11
                r15[r14] = r13
                p401x.C6898f.a.f26839g0 = r15
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static p401x.C6898f.a valueOf(java.lang.String r1) {
                java.lang.Class<x.f$a> r0 = p401x.C6898f.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                x.f$a r1 = (p401x.C6898f.a) r1
                return r1
        }

        public static p401x.C6898f.a[] values() {
                x.f$a[] r0 = p401x.C6898f.a.f26839g0
                java.lang.Object r0 = r0.clone()
                x.f$a[] r0 = (p401x.C6898f.a[]) r0
                return r0
        }
    }

    public C6898f(p401x.AbstractC6908p r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f26819a = r0
            r1 = 0
            r3.f26820b = r1
            r3.f26821c = r1
            x.f$a r2 = p401x.C6898f.a.f26831Y
            r3.f26823e = r2
            r2 = 1
            r3.f26826h = r2
            r3.f26827i = r0
            r3.f26828j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f26829k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f26830l = r0
            r3.f26822d = r4
            return
    }

    @Override // p401x.InterfaceC6896d
    /* renamed from: a */
    public void mo13964a(p401x.InterfaceC6896d r6) {
            r5 = this;
            java.util.List<x.f> r6 = r5.f26830l
            java.util.Iterator r6 = r6.iterator()
        L6:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r6.next()
            x.f r0 = (p401x.C6898f) r0
            boolean r0 = r0.f26828j
            if (r0 != 0) goto L6
            return
        L17:
            r6 = 1
            r5.f26821c = r6
            x.d r0 = r5.f26819a
            if (r0 == 0) goto L21
            r0.mo13964a(r5)
        L21:
            boolean r0 = r5.f26820b
            if (r0 == 0) goto L2b
            x.p r6 = r5.f26822d
            r6.mo13964a(r5)
            return
        L2b:
            r0 = 0
            r1 = 0
            java.util.List<x.f> r2 = r5.f26830l
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L48
            java.lang.Object r3 = r2.next()
            x.f r3 = (p401x.C6898f) r3
            boolean r4 = r3 instanceof p401x.C6899g
            if (r4 == 0) goto L44
            goto L33
        L44:
            int r1 = r1 + 1
            r0 = r3
            goto L33
        L48:
            if (r0 == 0) goto L6a
            if (r1 != r6) goto L6a
            boolean r6 = r0.f26828j
            if (r6 == 0) goto L6a
            x.g r6 = r5.f26827i
            if (r6 == 0) goto L62
            boolean r1 = r6.f26828j
            if (r1 == 0) goto L61
            int r1 = r5.f26826h
            int r6 = r6.f26825g
            int r1 = r1 * r6
            r5.f26824f = r1
            goto L62
        L61:
            return
        L62:
            int r6 = r0.f26825g
            int r0 = r5.f26824f
            int r6 = r6 + r0
            r5.mo13980c(r6)
        L6a:
            x.d r6 = r5.f26819a
            if (r6 == 0) goto L71
            r6.mo13964a(r5)
        L71:
            return
    }

    /* renamed from: b */
    public void m13979b() {
            r1 = this;
            java.util.List<x.f> r0 = r1.f26830l
            r0.clear()
            java.util.List<x.d> r0 = r1.f26829k
            r0.clear()
            r0 = 0
            r1.f26828j = r0
            r1.f26825g = r0
            r1.f26821c = r0
            r1.f26820b = r0
            return
    }

    /* renamed from: c */
    public void mo13980c(int r2) {
            r1 = this;
            boolean r0 = r1.f26828j
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f26828j = r0
            r1.f26825g = r2
            java.util.List<x.d> r2 = r1.f26829k
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            x.d r0 = (p401x.InterfaceC6896d) r0
            r0.mo13964a(r0)
            goto L10
        L20:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            x.p r1 = r2.f26822d
            w.f r1 = r1.f26855b
            java.lang.String r1 = r1.f26158k0
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            x.f$a r1 = r2.f26823e
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r2.f26828j
            if (r1 == 0) goto L28
            int r1 = r2.f26825g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "unresolved"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ") <t="
            r0.append(r1)
            java.util.List<x.f> r1 = r2.f26830l
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ":d="
            r0.append(r1)
            java.util.List<x.d> r1 = r2.f26829k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
