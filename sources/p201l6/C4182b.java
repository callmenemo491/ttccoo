package p201l6;

/* renamed from: l6.b */
/* loaded from: classes.dex */
public class C4182b extends java.lang.Exception {

    /* renamed from: Y */
    @androidx.annotation.RecentlyNonNull
    @java.lang.Deprecated
    public final com.google.android.gms.common.api.Status f17345Y;

    public C4182b(@androidx.annotation.RecentlyNonNull com.google.android.gms.common.api.Status r5) {
            r4 = this;
            int r0 = r5.f5536Z
            java.lang.String r1 = r5.f5537a0
            if (r1 == 0) goto L7
            goto L9
        L7:
            java.lang.String r1 = ""
        L9:
            r2 = 13
            int r2 = p064e.C1489c.m4038a(r1, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.f17345Y = r5
            return
    }
}
