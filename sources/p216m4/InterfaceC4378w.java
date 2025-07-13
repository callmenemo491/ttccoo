package p216m4;

/* renamed from: m4.w */
/* loaded from: classes.dex */
public interface InterfaceC4378w {

    /* renamed from: m4.w$a */
    public static final class a {

        /* renamed from: a */
        public final p216m4.C4379x f17935a;

        /* renamed from: b */
        public final p216m4.C4379x f17936b;

        public a(p216m4.C4379x r1) {
                r0 = this;
                r0.<init>()
                r0.f17935a = r1
                r0.f17936b = r1
                return
        }

        public a(p216m4.C4379x r1, p216m4.C4379x r2) {
                r0 = this;
                r0.<init>()
                r0.f17935a = r1
                r0.f17936b = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<m4.w$a> r2 = p216m4.InterfaceC4378w.a.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                m4.w$a r5 = (p216m4.InterfaceC4378w.a) r5
                m4.x r2 = r4.f17935a
                m4.x r3 = r5.f17935a
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                m4.x r2 = r4.f17936b
                m4.x r5 = r5.f17936b
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r2 = this;
                m4.x r0 = r2.f17935a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                m4.x r1 = r2.f17936b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r4 = this;
                m4.x r0 = r4.f17935a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                m4.x r1 = r4.f17935a
                m4.x r2 = r4.f17936b
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L13
                java.lang.String r1 = ""
                goto L30
            L13:
                m4.x r1 = r4.f17936b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                int r2 = r2 + 2
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = ", "
                r3.append(r2)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L30:
                int r2 = r0.length()
                int r2 = r2 + 2
                int r2 = p064e.C1489c.m4038a(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "["
                r3.append(r2)
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = "]"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    /* renamed from: m4.w$b */
    public static class b implements p216m4.InterfaceC4378w {

        /* renamed from: a */
        public final long f17937a;

        /* renamed from: b */
        public final p216m4.InterfaceC4378w.a f17938b;

        public b(long r3, long r5) {
                r2 = this;
                r2.<init>()
                r2.f17937a = r3
                m4.w$a r3 = new m4.w$a
                r0 = 0
                int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r4 != 0) goto L10
                m4.x r4 = p216m4.C4379x.f17939c
                goto L15
            L10:
                m4.x r4 = new m4.x
                r4.<init>(r0, r5)
            L15:
                r3.<init>(r4)
                r2.f17938b = r3
                return
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: d */
        public boolean mo9742d() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: g */
        public p216m4.InterfaceC4378w.a mo9743g(long r1) {
                r0 = this;
                m4.w$a r1 = r0.f17938b
                return r1
        }

        @Override // p216m4.InterfaceC4378w
        /* renamed from: h */
        public long mo9744h() {
                r2 = this;
                long r0 = r2.f17937a
                return r0
        }
    }

    /* renamed from: d */
    boolean mo9742d();

    /* renamed from: g */
    p216m4.InterfaceC4378w.a mo9743g(long r1);

    /* renamed from: h */
    long mo9744h();
}
