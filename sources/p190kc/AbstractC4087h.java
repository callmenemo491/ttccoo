package p190kc;

/* renamed from: kc.h */
/* loaded from: classes.dex */
public abstract class AbstractC4087h extends p190kc.AbstractC4089j {
    public AbstractC4087h(p453zb.C7269a r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: b */
    public final void m9177b(java.lang.StringBuilder r3, int r4) {
            r2 = this;
            java.lang.String r0 = "(01)"
            r3.append(r0)
            int r0 = r3.length()
            r1 = 57
            r3.append(r1)
            r2.m9178c(r3, r4, r0)
            return
    }

    /* renamed from: c */
    public final void m9178c(java.lang.StringBuilder r6, int r7, int r8) {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 4
            r3 = 10
            if (r1 >= r2) goto L26
            androidx.fragment.app.l0 r2 = r5.f17006b
            int r4 = r1 * 10
            int r4 = r4 + r7
            int r2 = r2.m1284s(r4, r3)
            int r3 = r2 / 100
            r4 = 48
            if (r3 != 0) goto L19
            r6.append(r4)
        L19:
            int r3 = r2 / 10
            if (r3 != 0) goto L20
            r6.append(r4)
        L20:
            r6.append(r2)
            int r1 = r1 + 1
            goto L2
        L26:
            r7 = 0
            r1 = 0
        L28:
            r2 = 13
            if (r7 >= r2) goto L3e
            int r2 = r7 + r8
            char r2 = r6.charAt(r2)
            int r2 = r2 + (-48)
            r4 = r7 & 1
            if (r4 != 0) goto L3a
            int r2 = r2 * 3
        L3a:
            int r1 = r1 + r2
            int r7 = r7 + 1
            goto L28
        L3e:
            int r1 = r1 % r3
            int r7 = 10 - r1
            if (r7 != r3) goto L44
            goto L45
        L44:
            r0 = r7
        L45:
            r6.append(r0)
            return
    }
}
