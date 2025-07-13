package p150ic;

/* renamed from: ic.c */
/* loaded from: classes.dex */
public final class C3127c {

    /* renamed from: a */
    public final int f12542a;

    /* renamed from: b */
    public final int[] f12543b;

    /* renamed from: c */
    public final sb.C6023q[] f12544c;

    public C3127c(int r1, int[] r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f12542a = r1
            r0.f12543b = r2
            r1 = 2
            sb.q[] r1 = new sb.C6023q[r1]
            sb.q r2 = new sb.q
            float r3 = (float) r3
            float r5 = (float) r5
            r2.<init>(r3, r5)
            r3 = 0
            r1[r3] = r2
            sb.q r2 = new sb.q
            float r3 = (float) r4
            r2.<init>(r3, r5)
            r3 = 1
            r1[r3] = r2
            r0.f12544c = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p150ic.C3127c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ic.c r3 = (p150ic.C3127c) r3
            int r0 = r2.f12542a
            int r3 = r3.f12542a
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f12542a
            return r0
    }
}
