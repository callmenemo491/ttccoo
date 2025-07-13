package ph;

/* renamed from: ph.a */
/* loaded from: classes.dex */
public abstract class AbstractC5524a extends ph.AbstractC5526c {
    public AbstractC5524a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // ph.AbstractC5526c
    /* renamed from: a */
    public int mo11782a(int r3) {
            r2 = this;
            java.util.Random r0 = r2.mo11785e()
            int r0 = r0.nextInt()
            int r1 = 32 - r3
            int r0 = r0 >>> r1
            int r3 = -r3
            int r3 = r3 >> 31
            r3 = r3 & r0
            return r3
    }

    @Override // ph.AbstractC5526c
    /* renamed from: b */
    public int mo11783b() {
            r1 = this;
            java.util.Random r0 = r1.mo11785e()
            int r0 = r0.nextInt()
            return r0
    }

    @Override // ph.AbstractC5526c
    /* renamed from: c */
    public int mo11784c(int r2) {
            r1 = this;
            java.util.Random r0 = r1.mo11785e()
            int r2 = r0.nextInt(r2)
            return r2
    }

    /* renamed from: e */
    public abstract java.util.Random mo11785e();
}
