package p142i4;

/* renamed from: i4.a */
/* loaded from: classes.dex */
public abstract class AbstractC3067a {

    /* renamed from: Y */
    public int f12333Y;

    public AbstractC3067a() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractC3067a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12333Y = r1
            return
    }

    /* renamed from: l */
    public void m7513l(int r2) {
            r1 = this;
            int r0 = r1.f12333Y
            r2 = r2 | r0
            r1.f12333Y = r2
            return
    }

    /* renamed from: o */
    public boolean m7514o(int r2) {
            r1 = this;
            int r0 = r1.f12333Y
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    /* renamed from: p */
    public boolean m7515p() {
            r1 = this;
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r1.m7514o(r0)
            return r0
    }

    /* renamed from: q */
    public boolean m7516q() {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r0 = r1.m7514o(r0)
            return r0
    }

    /* renamed from: r */
    public boolean m7517r() {
            r1 = this;
            r0 = 4
            boolean r0 = r1.m7514o(r0)
            return r0
    }

    /* renamed from: s */
    public boolean m7518s() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.m7514o(r0)
            return r0
    }
}
