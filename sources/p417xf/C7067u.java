package p417xf;

/* renamed from: xf.u */
/* loaded from: classes.dex */
public final class C7067u {
    public static final java.lang.String getAssetUrlIpfs(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "http"
            r1 = 0
            r2 = 2
            boolean r0 = p362uh.C6463i.m13061R(r3, r0, r1, r2)
            if (r0 == 0) goto L10
            goto L1f
        L10:
            boolean r0 = p362uh.C6463i.m13054K(r3)
            if (r0 == 0) goto L19
            java.lang.String r3 = ""
            goto L1f
        L19:
            java.lang.String r0 = "https://cdn.tacocrypto.io/default/resize:fit:400:400:0/plain/"
            java.lang.String r3 = p064e.C1493g.m4049a(r0, r3)
        L1f:
            return r3
    }
}
