package io.tacocrypto.app.notification;

/* loaded from: classes.dex */
public final class MyFirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    public MyFirebaseMessagingService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: c */
    public void mo3667c(p057db.C1423x r11) {
            r10 = this;
            db.x$b r0 = r11.f7103a0
            r1 = 0
            if (r0 != 0) goto L1b
            android.os.Bundle r0 = r11.f7101Y
            boolean r0 = p057db.C1422w.m3951l(r0)
            if (r0 == 0) goto L1b
            db.x$b r0 = new db.x$b
            db.w r2 = new db.w
            android.os.Bundle r3 = r11.f7101Y
            r2.<init>(r3)
            r0.<init>(r2, r1)
            r11.f7103a0 = r0
        L1b:
            db.x$b r0 = r11.f7103a0
            if (r0 != 0) goto L20
            return
        L20:
            android.content.Context r2 = r10.getApplicationContext()
            java.lang.String r3 = "notification"
            java.lang.Object r2 = r2.getSystemService(r3)
            java.lang.String r4 = "null cannot be cast to non-null type android.app.NotificationManager"
            java.util.Objects.requireNonNull(r2, r4)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 2131951947(0x7f13014b, float:1.9540323E38)
            r6 = 2
            r7 = 1
            if (r2 < r4) goto L94
            java.lang.Object r2 = r10.getSystemService(r3)
            boolean r3 = r2 instanceof android.app.NotificationManager
            if (r3 == 0) goto L47
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            goto L48
        L47:
            r2 = r1
        L48:
            if (r2 == 0) goto L52
            java.lang.String r1 = r10.getString(r5)
            android.app.NotificationChannel r1 = r2.getNotificationChannel(r1)
        L52:
            if (r1 != 0) goto L94
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            java.lang.String r3 = r10.getString(r5)
            r4 = 4
            java.lang.String r8 = "Notification"
            r1.<init>(r3, r8, r4)
            java.lang.String r3 = "All notifications"
            r1.setDescription(r3)
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            android.media.AudioAttributes$Builder r3 = r3.setContentType(r4)
            r8 = 5
            android.media.AudioAttributes$Builder r3 = r3.setUsage(r8)
            android.media.AudioAttributes r3 = r3.build()
            r1.enableLights(r7)
            r8 = -256(0xffffffffffffff00, float:NaN)
            r1.setLightColor(r8)
            r1.enableVibration(r7)
            r1.setImportance(r4)
            r1.setShowBadge(r7)
            android.net.Uri r4 = android.media.RingtoneManager.getDefaultUri(r6)
            r1.setSound(r4, r3)
            if (r2 == 0) goto L94
            r2.createNotificationChannel(r1)
        L94:
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.f7102Z
            if (r1 != 0) goto Leb
            android.os.Bundle r1 = r11.f7101Y
            s.a r2 = new s.a
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        La7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r1.get(r4)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto La7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "google."
            boolean r9 = r4.startsWith(r9)
            if (r9 != 0) goto La7
            java.lang.String r9 = "gcm."
            boolean r9 = r4.startsWith(r9)
            if (r9 != 0) goto La7
            java.lang.String r9 = "from"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto La7
            java.lang.String r9 = "message_type"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto La7
            java.lang.String r9 = "collapse_key"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto La7
            r2.put(r4, r8)
            goto La7
        Le9:
            r11.f7102Z = r2
        Leb:
            java.util.Map<java.lang.String, java.lang.String> r11 = r11.f7102Z
            java.lang.String r1 = "url"
            java.lang.Object r11 = r11.get(r1)
            java.lang.String r11 = (java.lang.String) r11
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r2 < r3) goto Lfe
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            goto L100
        Lfe:
            r2 = 134217728(0x8000000, float:3.85186E-34)
        L100:
            r3 = 0
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<io.tacocrypto.app.ui.splash.SplashActivity> r8 = io.tacocrypto.app.p156ui.splash.SplashActivity.class
            r4.<init>(r10, r8)
            if (r11 == 0) goto L10d
            r4.putExtra(r1, r11)
        L10d:
            android.app.PendingIntent r11 = android.app.PendingIntent.getActivity(r10, r3, r4, r2)
            c0.m r1 = new c0.m
            java.lang.String r2 = r10.getString(r5)
            r1.<init>(r10, r2)
            r2 = 2131231231(0x7f0801ff, float:1.8078537E38)
            android.app.Notification r3 = r1.f4485y
            r3.icon = r2
            java.lang.String r2 = r0.f7104a
            r1.m2485d(r2)
            java.lang.String r0 = r0.f7105b
            r1.m2484c(r0)
            r0 = 16
            r1.m2486e(r0, r7)
            android.content.Context r0 = r10.getApplicationContext()
            r2 = 2131099722(0x7f06004a, float:1.7811805E38)
            int r0 = p046d0.C1259a.m3706b(r0, r2)
            r1.f4480t = r0
            r1.f4467g = r11
            r1.f4470j = r7
            android.net.Uri r11 = android.media.RingtoneManager.getDefaultUri(r6)
            r1.m2488g(r11)
            android.app.Notification r11 = r1.m2483a()
            java.lang.String r0 = "Builder(this, getString(\u2026\n                .build()"
            p214m2.C4339q.m9705j(r11, r0)
            android.content.Context r0 = r10.getApplicationContext()
            c0.q r1 = new c0.q
            r1.<init>(r0)
            r1.m2496b(r6, r11)
            return
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* renamed from: d */
    public void mo3668d(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "fcmToken"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "FCM_Service"
            hk.a$b r0 = hk.C3053a.m7466a(r0)
            java.lang.String r1 = "onNewToken: "
            java.lang.String r3 = p064e.C1493g.m4049a(r1, r3)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.mo7467a(r3, r1)
            return
    }
}
