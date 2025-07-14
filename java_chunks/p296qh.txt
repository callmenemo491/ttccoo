package p296qh;

/* renamed from: qh.a */
/* loaded from: classes.dex */
public final class C5654a extends ph.AbstractC5524a {
    public C5654a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ph.AbstractC5526c
    /* renamed from: d */
    public int mo11786d(int r2, int r3) {
            r1 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            int r2 = r0.nextInt(r2, r3)
            return r2
    }

    @Override // ph.AbstractC5524a
    /* renamed from: e */
    public java.util.Random mo11785e() {
            r2 = this;
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            java.lang.String r1 = "current()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
