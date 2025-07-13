package androidx.media.session;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f2583a = 0;

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C0479a extends android.support.v4.media.MediaBrowserCompat.C0126c {

        /* renamed from: c */
        public final android.content.Context f2584c;

        /* renamed from: d */
        public final android.content.Intent f2585d;

        /* renamed from: e */
        public final android.content.BroadcastReceiver.PendingResult f2586e;

        /* renamed from: f */
        public android.support.v4.media.MediaBrowserCompat f2587f;

        public C0479a(android.content.Context r1, android.content.Intent r2, android.content.BroadcastReceiver.PendingResult r3) {
                r0 = this;
                r0.<init>()
                r0.f2584c = r1
                r0.f2585d = r2
                r0.f2586e = r3
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: a */
        public void mo193a() {
                r3 = this;
                android.content.Context r0 = r3.f2584c
                android.support.v4.media.MediaBrowserCompat r1 = r3.f2587f
                android.support.v4.media.session.MediaSessionCompat$Token r1 = r1.m187a()
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
                if (r1 == 0) goto L31
                android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 r2 = new android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21
                r2.<init>(r0, r1)
                android.content.Intent r0 = r3.f2585d
                java.lang.String r1 = "android.intent.extra.KEY_EVENT"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.view.KeyEvent r0 = (android.view.KeyEvent) r0
                if (r0 == 0) goto L29
                android.media.session.MediaController r1 = r2.f507a
                r1.dispatchMediaButtonEvent(r0)
                r3.m1472d()
                return
            L29:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "KeyEvent may not be null"
                r0.<init>(r1)
                throw r0
            L31:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "sessionToken must not be null"
                r0.<init>(r1)
                throw r0
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: b */
        public void mo194b() {
                r0 = this;
                r0.m1472d()
                return
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0126c
        /* renamed from: c */
        public void mo195c() {
                r0 = this;
                r0.m1472d()
                return
        }

        /* renamed from: d */
        public final void m1472d() {
                r5 = this;
                android.support.v4.media.MediaBrowserCompat r0 = r5.f2587f
                android.support.v4.media.MediaBrowserCompat$d r0 = r0.f459a
                android.support.v4.media.MediaBrowserCompat$e r0 = (android.support.v4.media.MediaBrowserCompat.C0128e) r0
                android.support.v4.media.MediaBrowserCompat$i r1 = r0.f473g
                if (r1 == 0) goto L1b
                android.os.Messenger r2 = r0.f474h
                if (r2 == 0) goto L1b
                r3 = 7
                r4 = 0
                r1.m203c(r3, r4, r2)     // Catch: android.os.RemoteException -> L14
                goto L1b
            L14:
                java.lang.String r1 = "MediaBrowserCompat"
                java.lang.String r2 = "Remote error unregistering client messenger."
                android.util.Log.i(r1, r2)
            L1b:
                android.media.browse.MediaBrowser r0 = r0.f468b
                r0.disconnect()
                android.content.BroadcastReceiver$PendingResult r0 = r5.f2586e
                r0.finish()
                return
        }
    }

    public MediaButtonReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static android.content.ComponentName m1471a(android.content.Context r3, java.lang.String r4) {
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4)
            java.lang.String r3 = r3.getPackageName()
            r1.setPackage(r3)
            r3 = 0
            java.util.List r0 = r0.queryIntentServices(r1, r3)
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L2e
            java.lang.Object r3 = r0.get(r3)
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ServiceInfo r3 = r3.serviceInfo
            java.lang.String r0 = r3.packageName
            java.lang.String r3 = r3.name
            r4.<init>(r0, r3)
            return r4
        L2e:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L36
            r3 = 0
            return r3
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected 1 service that handles "
            java.lang.String r2 = ", found "
            java.lang.StringBuilder r4 = androidx.activity.result.C0196d.m449a(r1, r4, r2)
            int r0 = r0.size()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            if (r5 == 0) goto L66
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "android.intent.action.MEDIA_BUTTON"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L66
            java.lang.String r0 = "android.intent.extra.KEY_EVENT"
            boolean r0 = r5.hasExtra(r0)
            if (r0 != 0) goto L17
            goto L66
        L17:
            android.content.ComponentName r0 = m1471a(r4, r1)
            if (r0 == 0) goto L30
            r5.setComponent(r0)
            java.lang.Object r0 = p046d0.C1259a.f6733a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2c
            p046d0.C1259a.e.m3718a(r4, r5)
            goto L2f
        L2c:
            r4.startService(r5)
        L2f:
            return
        L30:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            android.content.ComponentName r0 = m1471a(r4, r0)
            if (r0 == 0) goto L5e
            android.content.BroadcastReceiver$PendingResult r1 = r3.goAsync()
            android.content.Context r4 = r4.getApplicationContext()
            androidx.media.session.MediaButtonReceiver$a r2 = new androidx.media.session.MediaButtonReceiver$a
            r2.<init>(r4, r5, r1)
            android.support.v4.media.MediaBrowserCompat r5 = new android.support.v4.media.MediaBrowserCompat
            r1 = 0
            r5.<init>(r4, r0, r2, r1)
            r2.f2587f = r5
            java.lang.String r4 = "MediaBrowserCompat"
            java.lang.String r0 = "Connecting to a MediaBrowserService."
            android.util.Log.d(r4, r0)
            android.support.v4.media.MediaBrowserCompat$d r4 = r5.f459a
            android.support.v4.media.MediaBrowserCompat$e r4 = (android.support.v4.media.MediaBrowserCompat.C0128e) r4
            android.media.browse.MediaBrowser r4 = r4.f468b
            r4.connect()
            return
        L5e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service."
            r4.<init>(r5)
            throw r4
        L66:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Ignore unsupported intent: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MediaButtonReceiver"
            android.util.Log.d(r5, r4)
            return
    }
}
