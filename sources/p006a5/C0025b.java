package p006a5;

/* renamed from: a5.b */
/* loaded from: classes.dex */
public final class C0025b extends p427y4.AbstractC7117h {
    public C0025b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p427y4.AbstractC7117h
    /* renamed from: b */
    public p427y4.C7110a mo33b(p427y4.C7114e r12, java.nio.ByteBuffer r13) {
            r11 = this;
            y4.a r12 = new y4.a
            r0 = 1
            y4.a$b[] r0 = new p427y4.C7110a.b[r0]
            v5.u r1 = new v5.u
            byte[] r2 = r13.array()
            int r13 = r13.limit()
            r1.<init>(r2, r13)
            java.lang.String r4 = r1.m13412o()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = r1.m13412o()
            java.util.Objects.requireNonNull(r5)
            long r6 = r1.m13411n()
            long r8 = r1.m13411n()
            byte[] r13 = r1.f25710a
            int r2 = r1.f25711b
            int r1 = r1.f25712c
            byte[] r10 = java.util.Arrays.copyOfRange(r13, r2, r1)
            a5.a r13 = new a5.a
            r3 = r13
            r3.<init>(r4, r5, r6, r8, r10)
            r1 = 0
            r0[r1] = r13
            r12.<init>(r0)
            return r12
    }
}
