package p317ri;

/* renamed from: ri.l0 */
/* loaded from: classes.dex */
public class C5892l0 extends java.io.InputStream {

    /* renamed from: Y */
    public final ma.C4507a f22713Y;

    /* renamed from: Z */
    public boolean f22714Z;

    /* renamed from: a0 */
    public java.io.InputStream f22715a0;

    public C5892l0(ma.C4507a r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f22714Z = r0
            r1.f22713Y = r2
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r3 = this;
            java.io.InputStream r0 = r3.f22715a0
            r1 = -1
            if (r0 != 0) goto L19
            boolean r0 = r3.f22714Z
            if (r0 != 0) goto La
            return r1
        La:
            ma.a r0 = r3.f22713Y
            ri.e r0 = r0.m10390b()
            ri.p r0 = (p317ri.InterfaceC5903p) r0
            if (r0 != 0) goto L15
            return r1
        L15:
            r2 = 0
            r3.f22714Z = r2
            goto L30
        L19:
            java.io.InputStream r0 = r3.f22715a0
            int r0 = r0.read()
            if (r0 < 0) goto L22
            return r0
        L22:
            ma.a r0 = r3.f22713Y
            ri.e r0 = r0.m10390b()
            ri.p r0 = (p317ri.InterfaceC5903p) r0
            if (r0 != 0) goto L30
            r0 = 0
            r3.f22715a0 = r0
            return r1
        L30:
            java.io.InputStream r0 = r0.mo12221a()
            r3.f22715a0 = r0
            goto L19
    }

    @Override // java.io.InputStream
    public int read(byte[] r6, int r7, int r8) {
            r5 = this;
            java.io.InputStream r0 = r5.f22715a0
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L1e
            boolean r0 = r5.f22714Z
            if (r0 != 0) goto Lb
            return r2
        Lb:
            ma.a r0 = r5.f22713Y
            ri.e r0 = r0.m10390b()
            ri.p r0 = (p317ri.InterfaceC5903p) r0
            if (r0 != 0) goto L16
            return r2
        L16:
            r5.f22714Z = r1
        L18:
            java.io.InputStream r0 = r0.mo12221a()
            r5.f22715a0 = r0
        L1e:
            java.io.InputStream r0 = r5.f22715a0
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L2e
            int r1 = r1 + r0
            if (r1 != r8) goto L1e
            return r1
        L2e:
            ma.a r0 = r5.f22713Y
            ri.e r0 = r0.m10390b()
            ri.p r0 = (p317ri.InterfaceC5903p) r0
            if (r0 != 0) goto L18
            r6 = 0
            r5.f22715a0 = r6
            r6 = 1
            if (r1 >= r6) goto L3f
            goto L40
        L3f:
            r2 = r1
        L40:
            return r2
    }
}
