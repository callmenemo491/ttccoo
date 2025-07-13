package p031c1;

/* renamed from: c1.r */
/* loaded from: classes.dex */
public final class C0850r extends p031c1.C0851s {
    public C0850r(android.media.session.MediaSessionManager.RemoteUserInfo r3) {
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            int r1 = r3.getPid()
            int r3 = r3.getUid()
            r2.<init>(r0, r1, r3)
            return
    }

    public C0850r(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            android.media.session.MediaSessionManager$RemoteUserInfo r0 = new android.media.session.MediaSessionManager$RemoteUserInfo
            r0.<init>(r2, r3, r4)
            return
    }
}
