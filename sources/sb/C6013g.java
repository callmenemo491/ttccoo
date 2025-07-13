package sb;

/* renamed from: sb.g */
/* loaded from: classes.dex */
public final class C6013g extends sb.AbstractC6014h {

    /* renamed from: c */
    public final sb.AbstractC6014h f23195c;

    public C6013g(sb.AbstractC6014h r3) {
            r2 = this;
            int r0 = r3.f23196a
            int r1 = r3.f23197b
            r2.<init>(r0, r1)
            r2.f23195c = r3
            return
    }

    @Override // sb.AbstractC6014h
    /* renamed from: a */
    public byte[] mo12492a() {
            r5 = this;
            sb.h r0 = r5.f23195c
            byte[] r0 = r0.mo12492a()
            int r1 = r5.f23196a
            int r2 = r5.f23197b
            int r1 = r1 * r2
            byte[] r2 = new byte[r1]
            r3 = 0
        Lf:
            if (r3 >= r1) goto L1d
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = 255 - r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto Lf
        L1d:
            return r2
    }

    @Override // sb.AbstractC6014h
    /* renamed from: b */
    public byte[] mo12493b(int r3, byte[] r4) {
            r2 = this;
            sb.h r0 = r2.f23195c
            byte[] r3 = r0.mo12493b(r3, r4)
            int r4 = r2.f23196a
            r0 = 0
        L9:
            if (r0 >= r4) goto L17
            r1 = r3[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = 255 - r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L9
        L17:
            return r3
    }

    @Override // sb.AbstractC6014h
    /* renamed from: c */
    public sb.AbstractC6014h mo12494c() {
            r1 = this;
            sb.h r0 = r1.f23195c
            return r0
    }

    @Override // sb.AbstractC6014h
    /* renamed from: d */
    public boolean mo12495d() {
            r1 = this;
            sb.h r0 = r1.f23195c
            boolean r0 = r0.mo12495d()
            return r0
    }

    @Override // sb.AbstractC6014h
    /* renamed from: e */
    public sb.AbstractC6014h mo12496e() {
            r2 = this;
            sb.g r0 = new sb.g
            sb.h r1 = r2.f23195c
            sb.h r1 = r1.mo12496e()
            r0.<init>(r1)
            return r0
    }
}
