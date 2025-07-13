package mc;

/* renamed from: mc.a */
/* loaded from: classes.dex */
public final class C4529a {

    /* renamed from: a */
    public final /* synthetic */ int f18417a;

    /* renamed from: b */
    public final int f18418b;

    /* renamed from: c */
    public final int f18419c;

    /* renamed from: d */
    public final int f18420d;

    /* renamed from: e */
    public final int f18421e;

    /* renamed from: f */
    public int f18422f;

    public C4529a(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.f18417a = r6
            r0 = 1
            if (r6 == r0) goto L14
            r1.<init>()
            r1.f18418b = r2
            r1.f18419c = r5
            r1.f18420d = r3
            r1.f18421e = r4
            int r3 = r3 + r4
            r1.f18422f = r3
            return
        L14:
            r1.<init>()
            r6 = -1
            r1.f18422f = r6
            r1.f18418b = r2
            r1.f18419c = r3
            r1.f18420d = r4
            r1.f18421e = r5
            return
    }

    /* renamed from: a */
    public boolean m10434a() {
            r2 = this;
            int r0 = r2.f18422f
            r1 = -1
            if (r0 == r1) goto Lf
            int r1 = r2.f18420d
            int r0 = r0 % 3
            int r0 = r0 * 3
            if (r1 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* renamed from: b */
    public void m10435b() {
            r2 = this;
            int r0 = r2.f18421e
            int r0 = r0 / 30
            int r0 = r0 * 3
            int r1 = r2.f18420d
            int r1 = r1 / 3
            int r1 = r1 + r0
            r2.f18422f = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f18417a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f18422f
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            int r1 = r2.f18421e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
