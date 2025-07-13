package mc;

/* renamed from: mc.c */
/* loaded from: classes.dex */
public final class C4531c {

    /* renamed from: a */
    public p453zb.C7270b f18424a;

    /* renamed from: b */
    public sb.C6023q f18425b;

    /* renamed from: c */
    public sb.C6023q f18426c;

    /* renamed from: d */
    public sb.C6023q f18427d;

    /* renamed from: e */
    public sb.C6023q f18428e;

    /* renamed from: f */
    public int f18429f;

    /* renamed from: g */
    public int f18430g;

    /* renamed from: h */
    public int f18431h;

    /* renamed from: i */
    public int f18432i;

    public C4531c(mc.C4531c r5) {
            r4 = this;
            r4.<init>()
            zb.b r0 = r5.f18424a
            sb.q r1 = r5.f18425b
            sb.q r2 = r5.f18426c
            sb.q r3 = r5.f18427d
            sb.q r5 = r5.f18428e
            r4.f18424a = r0
            r4.f18425b = r1
            r4.f18426c = r2
            r4.f18427d = r3
            r4.f18428e = r5
            r4.m10438a()
            return
    }

    public C4531c(p453zb.C7270b r1, sb.C6023q r2, sb.C6023q r3, sb.C6023q r4, sb.C6023q r5) {
            r0 = this;
            r0.<init>()
            if (r2 != 0) goto L7
            if (r4 == 0) goto L14
        L7:
            if (r3 != 0) goto Lb
            if (r5 == 0) goto L14
        Lb:
            if (r2 == 0) goto Lf
            if (r3 == 0) goto L14
        Lf:
            if (r4 == 0) goto L17
            if (r5 == 0) goto L14
            goto L17
        L14:
            sb.k r1 = sb.C6017k.f23200a0
            throw r1
        L17:
            r0.f18424a = r1
            r0.f18425b = r2
            r0.f18426c = r3
            r0.f18427d = r4
            r0.f18428e = r5
            r0.m10438a()
            return
    }

    /* renamed from: a */
    public final void m10438a() {
            r4 = this;
            sb.q r0 = r4.f18425b
            if (r0 != 0) goto L1c
            sb.q r0 = new sb.q
            sb.q r1 = r4.f18427d
            float r1 = r1.f23223b
            r2 = 0
            r0.<init>(r2, r1)
            r4.f18425b = r0
            sb.q r0 = new sb.q
            sb.q r1 = r4.f18428e
            float r1 = r1.f23223b
            r0.<init>(r2, r1)
            r4.f18426c = r0
            goto L3e
        L1c:
            sb.q r1 = r4.f18427d
            if (r1 != 0) goto L3e
            sb.q r1 = new sb.q
            zb.b r2 = r4.f18424a
            int r2 = r2.f27902Y
            int r3 = r2 + (-1)
            float r3 = (float) r3
            float r0 = r0.f23223b
            r1.<init>(r3, r0)
            r4.f18427d = r1
            sb.q r0 = new sb.q
            int r2 = r2 + (-1)
            float r1 = (float) r2
            sb.q r2 = r4.f18426c
            float r2 = r2.f23223b
            r0.<init>(r1, r2)
            r4.f18428e = r0
        L3e:
            sb.q r0 = r4.f18425b
            float r0 = r0.f23222a
            sb.q r1 = r4.f18426c
            float r1 = r1.f23222a
            float r0 = java.lang.Math.min(r0, r1)
            int r0 = (int) r0
            r4.f18429f = r0
            sb.q r0 = r4.f18427d
            float r0 = r0.f23222a
            sb.q r1 = r4.f18428e
            float r1 = r1.f23222a
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (int) r0
            r4.f18430g = r0
            sb.q r0 = r4.f18425b
            float r0 = r0.f23223b
            sb.q r1 = r4.f18427d
            float r1 = r1.f23223b
            float r0 = java.lang.Math.min(r0, r1)
            int r0 = (int) r0
            r4.f18431h = r0
            sb.q r0 = r4.f18426c
            float r0 = r0.f23223b
            sb.q r1 = r4.f18428e
            float r1 = r1.f23223b
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (int) r0
            r4.f18432i = r0
            return
    }
}
