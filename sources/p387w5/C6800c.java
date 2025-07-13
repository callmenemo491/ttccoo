package p387w5;

/* renamed from: w5.c */
/* loaded from: classes.dex */
public class C6800c {

    /* renamed from: a */
    public final /* synthetic */ int f26408a;

    /* renamed from: b */
    public int f26409b;

    /* renamed from: c */
    public int f26410c;

    /* renamed from: d */
    public java.lang.Object f26411d;

    public C6800c() {
            r1 = this;
            r0 = 2
            r1.f26408a = r0
            r1.<init>()
            r0 = 16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f26411d = r0
            return
    }

    public C6800c(int r3, int r4) {
            r2 = this;
            r0 = 1
            r2.f26408a = r0
            r2.<init>()
            r1 = 2
            int[] r1 = new int[r1]
            r1[r0] = r3
            r0 = 0
            r1[r0] = r4
            java.lang.Class<byte> r0 = byte.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            byte[][] r0 = (byte[][]) r0
            r2.f26411d = r0
            r2.f26409b = r3
            r2.f26410c = r4
            return
    }

    public C6800c(int r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f26408a = r0
            r1.<init>()
            r1.f26409b = r2
            r1.f26410c = r3
            r1.f26411d = r4
            return
    }

    /* renamed from: c */
    public static p387w5.C6800c m13831c(p371v5.C6571u r6) {
            r0 = 2
            r6.m13397G(r0)
            int r0 = r6.m13418u()
            int r1 = r0 >> 1
            r0 = r0 & 1
            r2 = 5
            int r0 = r0 << r2
            int r6 = r6.m13418u()
            int r6 = r6 >> 3
            r6 = r6 & 31
            r6 = r6 | r0
            r0 = 4
            if (r1 == r0) goto L30
            if (r1 == r2) goto L30
            r0 = 7
            if (r1 != r0) goto L20
            goto L30
        L20:
            r0 = 8
            if (r1 != r0) goto L27
            java.lang.String r0 = "hev1"
            goto L32
        L27:
            r0 = 9
            if (r1 != r0) goto L2e
            java.lang.String r0 = "avc3"
            goto L32
        L2e:
            r6 = 0
            return r6
        L30:
            java.lang.String r0 = "dvhe"
        L32:
            r2 = 10
            java.lang.String r3 = ".0"
            if (r6 >= r2) goto L3a
            r2 = r3
            goto L3c
        L3a:
            java.lang.String r2 = "."
        L3c:
            int r4 = r0.length()
            int r4 = r4 + 24
            int r5 = r2.length()
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            w5.c r2 = new w5.c
            r2.<init>(r1, r6, r0)
            return r2
    }

    /* renamed from: a */
    public void m13832a() {
            r9 = this;
            java.lang.Object r0 = r9.f26411d
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            int r2 = r1 << 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r0
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r6 = r9.f26409b
            r5 = 0
            r7 = 0
            r8 = 10
            r4 = r2
            p062dh.C1468d.m3985G(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r9.f26411d
            r3 = r0
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            int r7 = r9.f26409b
            int r5 = r0 - r7
            r6 = 0
            r8 = 4
            p062dh.C1468d.m3985G(r3, r4, r5, r6, r7, r8)
            r9.f26411d = r2
            r0 = 0
            r9.f26409b = r0
            r9.f26410c = r1
            return
    }

    /* renamed from: b */
    public byte m13833b(int r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.f26411d
            byte[][] r0 = (byte[][]) r0
            r3 = r0[r3]
            r2 = r3[r2]
            return r2
    }

    /* renamed from: d */
    public void m13834d(int r2, int r3, int r4) {
            r1 = this;
            java.lang.Object r0 = r1.f26411d
            byte[][] r0 = (byte[][]) r0
            r3 = r0[r3]
            byte r4 = (byte) r4
            r3[r2] = r4
            return
    }

    /* renamed from: e */
    public void m13835e(int r2, int r3, boolean r4) {
            r1 = this;
            java.lang.Object r0 = r1.f26411d
            byte[][] r0 = (byte[][]) r0
            r3 = r0[r3]
            byte r4 = (byte) r4
            r3[r2] = r4
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f26408a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.f26409b
            int r1 = r1 * 2
            int r2 = r6.f26410c
            int r1 = r1 * r2
            int r1 = r1 + 2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L1b:
            int r3 = r6.f26410c
            if (r2 >= r3) goto L47
            r3 = 0
        L20:
            int r4 = r6.f26409b
            if (r3 >= r4) goto L3f
            java.lang.Object r4 = r6.f26411d
            byte[][] r4 = (byte[][]) r4
            r4 = r4[r2]
            r4 = r4[r3]
            if (r4 == 0) goto L37
            r5 = 1
            if (r4 == r5) goto L34
            java.lang.String r4 = "  "
            goto L39
        L34:
            java.lang.String r4 = " 1"
            goto L39
        L37:
            java.lang.String r4 = " 0"
        L39:
            r0.append(r4)
            int r3 = r3 + 1
            goto L20
        L3f:
            r3 = 10
            r0.append(r3)
            int r2 = r2 + 1
            goto L1b
        L47:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
