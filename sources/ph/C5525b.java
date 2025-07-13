package ph;

/* renamed from: ph.b */
/* loaded from: classes.dex */
public final class C5525b extends ph.AbstractC5524a {

    /* renamed from: a0 */
    public final ph.C5525b.a f21524a0;

    /* renamed from: ph.b$a */
    public static final class a extends java.lang.ThreadLocal<java.util.Random> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.ThreadLocal
        public java.util.Random initialValue() {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                return r0
        }
    }

    public C5525b() {
            r1 = this;
            r1.<init>()
            ph.b$a r0 = new ph.b$a
            r0.<init>()
            r1.f21524a0 = r0
            return
    }

    @Override // ph.AbstractC5524a
    /* renamed from: e */
    public java.util.Random mo11785e() {
            r2 = this;
            ph.b$a r0 = r2.f21524a0
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "implStorage.get()"
            p214m2.C4339q.m9705j(r0, r1)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
