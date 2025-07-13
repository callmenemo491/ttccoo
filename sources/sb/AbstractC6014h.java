package sb;

/* renamed from: sb.h */
/* loaded from: classes.dex */
public abstract class AbstractC6014h {

    /* renamed from: a */
    public final int f23196a;

    /* renamed from: b */
    public final int f23197b;

    public AbstractC6014h(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f23196a = r1
            r0.f23197b = r2
            return
    }

    /* renamed from: a */
    public abstract byte[] mo12492a();

    /* renamed from: b */
    public abstract byte[] mo12493b(int r1, byte[] r2);

    /* renamed from: c */
    public sb.AbstractC6014h mo12494c() {
            r1 = this;
            sb.g r0 = new sb.g
            r0.<init>(r1)
            return r0
    }

    /* renamed from: d */
    public boolean mo12495d() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: e */
    public sb.AbstractC6014h mo12496e() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This luminance source does not support rotation by 90 degrees."
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r7 = this;
            int r0 = r7.f23196a
            byte[] r1 = new byte[r0]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r7.f23197b
            int r0 = r0 + 1
            int r0 = r0 * r3
            r2.<init>(r0)
            r0 = 0
            r3 = 0
        L11:
            int r4 = r7.f23197b
            if (r3 >= r4) goto L47
            byte[] r1 = r7.mo12493b(r3, r1)
            r4 = 0
        L1a:
            int r5 = r7.f23196a
            if (r4 >= r5) goto L3f
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 64
            if (r5 >= r6) goto L29
            r5 = 35
            goto L39
        L29:
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L30
            r5 = 43
            goto L39
        L30:
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 >= r6) goto L37
            r5 = 46
            goto L39
        L37:
            r5 = 32
        L39:
            r2.append(r5)
            int r4 = r4 + 1
            goto L1a
        L3f:
            r4 = 10
            r2.append(r4)
            int r3 = r3 + 1
            goto L11
        L47:
            java.lang.String r0 = r2.toString()
            return r0
    }
}
