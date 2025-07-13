package sj;

/* renamed from: sj.c */
/* loaded from: classes.dex */
public class C6082c {

    /* renamed from: a */
    public final int[] f23446a;

    public C6082c(int[] r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.f23446a = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof sj.C6082c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            sj.c r2 = (sj.C6082c) r2
            int[] r0 = r1.f23446a
            int[] r2 = r2.f23446a
            boolean r2 = p400wj.C6888a.m13950b(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            int[] r0 = r1.f23446a
            int r0 = p400wj.C6888a.m13953e(r0)
            return r0
    }
}
