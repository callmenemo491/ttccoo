package p031c1;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public class RunnableC0835c implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat.Token f4557Y;

    /* renamed from: Z */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.e f4558Z;

    public RunnableC0835c(p031c1.AbstractServiceC0833a.e r1, android.support.v4.media.session.MediaSessionCompat.Token r2) {
            r0 = this;
            r0.f4558Z = r1
            r0.f4557Y = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r7 = this;
            c1.a$e r0 = r7.f4558Z
            android.support.v4.media.session.MediaSessionCompat$Token r1 = r7.f4557Y
            java.util.List<android.os.Bundle> r2 = r0.f4538a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L33
            android.support.v4.media.session.b r2 = r1.m295b()
            if (r2 == 0) goto L2e
            java.util.List<android.os.Bundle> r3 = r0.f4538a
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r3.next()
            android.os.Bundle r4 = (android.os.Bundle) r4
            android.os.IBinder r5 = r2.asBinder()
            java.lang.String r6 = "extra_session_binder"
            r4.putBinder(r6, r5)
            goto L18
        L2e:
            java.util.List<android.os.Bundle> r2 = r0.f4538a
            r2.clear()
        L33:
            android.service.media.MediaBrowserService r0 = r0.f4539b
            java.lang.Object r1 = r1.f531Z
            android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
            r0.setSessionToken(r1)
            return
    }
}
