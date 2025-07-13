package p418xg;

/* renamed from: xg.c */
/* loaded from: classes.dex */
public class C7072c extends p418xg.C7071b {

    /* renamed from: c */
    public final p238nd.C4728b0 f27394c;

    public C7072c(p105g2.C2221o r1, p238nd.C4728b0 r2, boolean r3, int r4) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r3)
            r0.f27394c = r2
            return
    }

    /* renamed from: d */
    public final java.lang.String m14180d() {
            r2 = this;
            nd.b0 r0 = r2.f27394c
            id.b r0 = r0.m10795h()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.f12559a
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "user not logged (close the app and reopen it)"
            r0.<init>(r1)
            throw r0
    }
}
