package p129hc;

/* renamed from: hc.r */
/* loaded from: classes.dex */
public final class C3021r {

    /* renamed from: c */
    public static final int[] f12158c = null;

    /* renamed from: a */
    public final p128hb.C3003h f12159a;

    /* renamed from: b */
    public final p129hc.C3020q f12160b;

    static {
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 1, 2} // fill-array
            p129hc.C3021r.f12158c = r0
            return
    }

    public C3021r() {
            r2 = this;
            r2.<init>()
            hb.h r0 = new hb.h
            r1 = 5
            r0.<init>(r1)
            r2.f12159a = r0
            hc.q r0 = new hc.q
            r0.<init>()
            r2.f12160b = r0
            return
    }

    /* renamed from: a */
    public sb.C6021o m7425a(int r10, p453zb.C7269a r11, int r12) {
            r9 = this;
            int[] r0 = p129hc.C3021r.f12158c
            int r1 = r0.length
            int[] r1 = new int[r1]
            r2 = 0
            int[] r12 = p129hc.AbstractC3022s.m7428o(r11, r12, r2, r0, r1)
            hc.q r0 = r9.f12160b     // Catch: sb.AbstractC6020n -> L11
            sb.o r10 = r0.m7424a(r10, r11, r12)     // Catch: sb.AbstractC6020n -> L11
            return r10
        L11:
            hb.h r0 = r9.f12159a
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f12119c
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.setLength(r2)
            int r11 = r0.m7381g(r11, r12, r1)
            java.lang.String r0 = r1.toString()
            int r1 = r0.length()
            r3 = 0
            r4 = 2
            if (r1 == r4) goto L2d
            r1 = r3
            goto L3d
        L2d:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<sb.p> r5 = sb.EnumC6022p.class
            r1.<init>(r5)
            sb.p r5 = sb.EnumC6022p.f23214b0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r1.put(r5, r6)
        L3d:
            sb.o r5 = new sb.o
            sb.q[] r4 = new sb.C6023q[r4]
            sb.q r6 = new sb.q
            r7 = r12[r2]
            r8 = 1
            r12 = r12[r8]
            int r7 = r7 + r12
            float r12 = (float) r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r7
            float r10 = (float) r10
            r6.<init>(r12, r10)
            r4[r2] = r6
            sb.q r12 = new sb.q
            float r11 = (float) r11
            r12.<init>(r11, r10)
            r4[r8] = r12
            sb.a r10 = sb.EnumC6007a.f23167o0
            r5.<init>(r0, r3, r4, r10)
            if (r1 == 0) goto L65
            r5.m12499a(r1)
        L65:
            return r5
    }
}
