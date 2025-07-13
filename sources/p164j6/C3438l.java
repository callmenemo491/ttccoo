package p164j6;

/* renamed from: j6.l */
/* loaded from: classes.dex */
public final class C3438l extends p164j6.AbstractC3440n<java.lang.Void> {
    public C3438l(int r2, android.os.Bundle r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // p164j6.AbstractC3440n
    /* renamed from: a */
    public final void mo7904a(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "ack"
            r1 = 0
            boolean r3 = r3.getBoolean(r0, r1)
            if (r3 == 0) goto Le
            r3 = 0
            r2.m7908c(r3)
            return
        Le:
            j6.m r3 = new j6.m
            r0 = 4
            java.lang.String r1 = "Invalid response to one way request"
            r3.<init>(r0, r1)
            r2.m7907b(r3)
            return
    }

    @Override // p164j6.AbstractC3440n
    /* renamed from: d */
    public final boolean mo7905d() {
            r1 = this;
            r0 = 1
            return r0
    }
}
