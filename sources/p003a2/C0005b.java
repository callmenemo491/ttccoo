package p003a2;

/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class C0005b {

    /* renamed from: a */
    public final p067e2.C1510c f8a;

    /* renamed from: b */
    public p019b2.InterfaceC0655a<?> f9b;

    /* renamed from: c */
    public mh.InterfaceC4609a<? extends p048d2.C1264c> f10c;

    /* renamed from: a2.b$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<p048d2.C1264c> {

        /* renamed from: Z */
        public static final p003a2.C0005b.a f11Z = null;

        static {
                a2.b$a r0 = new a2.b$a
                r0.<init>()
                p003a2.C0005b.a.f11Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4609a
        /* renamed from: e */
        public p048d2.C1264c mo15e() {
                r1 = this;
                d2.c r0 = new d2.c
                r0.<init>()
                return r0
        }
    }

    public C0005b(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            e2.c r2 = new e2.c
            r0 = 0
            r2.<init>(r0)
            r1.f8a = r2
            a2.b$a r2 = p003a2.C0005b.a.f11Z
            r1.f10c = r2
            return
    }

    /* renamed from: a */
    public final void m13a(int r7, p003a2.InterfaceC0004a<?, ?> r8) {
            r6 = this;
            e2.c r0 = r6.f8a
            java.util.Objects.requireNonNull(r0)
            e2.d r1 = p067e2.C1509b.m4097b(r8)
            java.lang.String r1 = r1.f7354i
            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r0.f7343a
            java.util.Set r2 = r2.keySet()
            java.lang.String r3 = "<this>"
            p214m2.C4339q.m9706k(r2, r3)
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L22
            r2 = 0
            goto L3d
        L22:
            java.lang.Object r3 = r2.next()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
        L28:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r5 = r3.compareTo(r4)
            if (r5 >= 0) goto L28
            r3 = r4
            goto L28
        L3c:
            r2 = r3
        L3d:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L46
            int r2 = r2.intValue()
            goto L47
        L46:
            r2 = 0
        L47:
            int r2 = r2 + 1
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r0.f7343a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.put(r4, r7)
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r0.f7345c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.put(r1, r3)
            java.util.Map<java.lang.Integer, a2.a<?, ?>> r7 = r0.f7344b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.put(r0, r8)
            return
    }

    /* renamed from: b */
    public final p003a2.C0005b m14b(p019b2.InterfaceC0655a<?> r2) {
            r1 = this;
            java.lang.String r0 = "dataSource"
            p214m2.C4339q.m9707l(r2, r0)
            r1.f9b = r2
            return r1
    }
}
