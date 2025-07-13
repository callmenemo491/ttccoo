package p317ri;

/* renamed from: ri.e0 */
/* loaded from: classes.dex */
public class C5871e0 implements p317ri.InterfaceC5903p {

    /* renamed from: Y */
    public final /* synthetic */ int f22685Y;

    /* renamed from: Z */
    public java.lang.Object f22686Z;

    public C5871e0(ma.C4507a r2) {
            r1 = this;
            r0 = 0
            r1.f22685Y = r0
            r1.<init>()
            r1.f22686Z = r2
            return
    }

    public C5871e0(p317ri.C5905p1 r2) {
            r1 = this;
            r0 = 1
            r1.f22685Y = r0
            r1.<init>()
            r1.f22686Z = r2
            return
    }

    @Override // p317ri.InterfaceC5903p
    /* renamed from: a */
    public java.io.InputStream mo12221a() {
            r2 = this;
            int r0 = r2.f22685Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            ri.l0 r0 = new ri.l0
            java.lang.Object r1 = r2.f22686Z
            ma.a r1 = (ma.C4507a) r1
            r0.<init>(r1)
            return r0
        L10:
            java.lang.Object r0 = r2.f22686Z
            ri.p1 r0 = (p317ri.C5905p1) r0
            return r0
    }

    @Override // p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r5 = this;
            int r0 = r5.f22685Y
            r1 = 0
            java.lang.String r2 = "IOException converting stream to byte array: "
            switch(r0) {
                case 0: goto L9;
                default: goto L8;
            }
        L8:
            goto L28
        L9:
            ri.s r0 = r5.mo12213i()     // Catch: java.io.IOException -> Le
            return r0
        Le:
            r0 = move-exception
            ri.r r3 = new ri.r
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2, r0, r1)
            throw r3
        L28:
            ri.s r0 = r5.mo12213i()     // Catch: java.io.IOException -> L2d
            return r0
        L2d:
            r0 = move-exception
            ri.r r3 = new ri.r
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r0.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2, r0, r1)
            throw r3
    }

    @Override // p317ri.InterfaceC5908q1
    /* renamed from: i */
    public p317ri.AbstractC5912s mo12213i() {
            r7 = this;
            int r0 = r7.f22685Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L28
        L6:
            ri.d0 r0 = new ri.d0
            java.io.InputStream r1 = r7.mo12221a()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r3]
        L15:
            r5 = 0
            int r6 = r1.read(r4, r5, r3)
            if (r6 < 0) goto L20
            r2.write(r4, r5, r6)
            goto L15
        L20:
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
        L28:
            ri.x0 r0 = new ri.x0
            java.lang.Object r1 = r7.f22686Z
            ri.p1 r1 = (p317ri.C5905p1) r1
            byte[] r1 = r1.m12261i()
            r0.<init>(r1)
            return r0
    }
}
