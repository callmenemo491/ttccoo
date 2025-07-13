package p057db;

/* renamed from: db.d */
/* loaded from: classes.dex */
public class C1393d {

    /* renamed from: a */
    public final java.util.concurrent.Executor f7012a;

    /* renamed from: b */
    public final android.content.Context f7013b;

    /* renamed from: c */
    public final p057db.C1422w f7014c;

    public C1393d(android.content.Context r1, p057db.C1422w r2, java.util.concurrent.Executor r3) {
            r0 = this;
            r0.<init>()
            r0.f7012a = r3
            r0.f7013b = r1
            r0.f7014c = r2
            return
    }

    /* renamed from: a */
    public boolean m3915a() {
            r15 = this;
            db.w r0 = r15.f7014c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.m3953a(r1)
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.content.Context r0 = r15.f7013b
            java.lang.String r1 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r1 = 0
            if (r0 == 0) goto L1e
            goto L4e
        L1e:
            int r0 = android.os.Process.myPid()
            android.content.Context r2 = r15.f7013b
            java.lang.String r3 = "activity"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            java.util.List r2 = r2.getRunningAppProcesses()
            if (r2 == 0) goto L4e
            java.util.Iterator r2 = r2.iterator()
        L36:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.pid
            if (r4 != r0) goto L36
            int r0 = r3.importance
            r2 = 100
            if (r0 != r2) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L52
            return r1
        L52:
            db.w r0 = r15.f7014c
            java.lang.String r2 = "gcm.n.image"
            java.lang.String r0 = r0.m3962j(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "FirebaseMessaging"
            if (r2 == 0) goto L63
            goto L88
        L63:
            db.s r2 = new db.s     // Catch: java.net.MalformedURLException -> L6e
            java.net.URL r4 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6e
            r4.<init>(r0)     // Catch: java.net.MalformedURLException -> L6e
            r2.<init>(r4)     // Catch: java.net.MalformedURLException -> L6e
            goto L89
        L6e:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Not downloading image, bad URL: "
            int r4 = r0.length()
            if (r4 == 0) goto L80
            java.lang.String r0 = r2.concat(r0)
            goto L85
        L80:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L85:
            android.util.Log.w(r3, r0)
        L88:
            r2 = 0
        L89:
            if (r2 == 0) goto L98
            java.util.concurrent.Executor r0 = r15.f7012a
            a7.c r4 = new a7.c
            r4.<init>(r2)
            s7.i r0 = p327s7.C5988l.m12462c(r0, r4)
            r2.f7092Z = r0
        L98:
            android.content.Context r0 = r15.f7013b
            db.w r4 = r15.f7014c
            java.util.concurrent.atomic.AtomicInteger r5 = p057db.C1389b.f7001a
            java.lang.String r5 = "Couldn't get own application info: "
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            java.lang.String r7 = r0.getPackageName()
            r8 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb5
            if (r6 == 0) goto Lc8
            android.os.Bundle r6 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb5
            if (r6 == 0) goto Lc8
            goto Lca
        Lb5:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 35
            r8.<init>(r7)
            p031c1.C0842j.m2517a(r8, r5, r6, r3)
        Lc8:
            android.os.Bundle r6 = android.os.Bundle.EMPTY
        Lca:
            java.lang.String r7 = r0.getPackageName()
            java.lang.String r8 = "gcm.n.android_channel_id"
            java.lang.String r8 = r4.m3962j(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 3
            r11 = 26
            if (r9 >= r11) goto Ldd
            goto L162
        Ldd:
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L162
            java.lang.String r12 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L162
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r12, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L162
            int r9 = r9.targetSdkVersion     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L162
            if (r9 < r11) goto L162
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r9 = r0.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L118
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L102
            goto L163
        L102:
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 122
            r12.<init>(r11)
            java.lang.String r11 = "Notification Channel requested ("
            java.lang.String r13 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            p057db.C1387a.m3905a(r12, r11, r8, r13, r3)
        L118:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r8 = r6.getString(r8)
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L12e
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L12b
            goto L163
        L12b:
            java.lang.String r8 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            goto L130
        L12e:
            java.lang.String r8 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
        L130:
            android.util.Log.w(r3, r8)
            java.lang.String r8 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 != 0) goto L163
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r12 = r0.getPackageName()
            java.lang.String r13 = "fcm_fallback_notification_channel_label"
            java.lang.String r14 = "string"
            int r11 = r11.getIdentifier(r13, r14, r12)
            if (r11 != 0) goto L155
            java.lang.String r11 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r3, r11)
            java.lang.String r11 = "Misc"
            goto L159
        L155:
            java.lang.String r11 = r0.getString(r11)
        L159:
            android.app.NotificationChannel r12 = new android.app.NotificationChannel
            r12.<init>(r8, r11, r10)
            r9.createNotificationChannel(r12)
            goto L163
        L162:
            r8 = 0
        L163:
            android.content.res.Resources r9 = r0.getResources()
            android.content.pm.PackageManager r10 = r0.getPackageManager()
            c0.m r11 = new c0.m
            r11.<init>(r0, r8)
            java.lang.String r8 = "gcm.n.title"
            java.lang.String r8 = r4.m3961i(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L17f
            r11.m2485d(r8)
        L17f:
            java.lang.String r8 = "gcm.n.body"
            java.lang.String r8 = r4.m3961i(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L1a2
            r11.m2484c(r8)
            c0.l r12 = new c0.l
            r12.<init>()
            java.lang.CharSequence r8 = p030c0.C0826m.m2482b(r8)
            r12.f4460b = r8
            c0.n r8 = r11.f4473m
            if (r8 == r12) goto L1a2
            r11.f4473m = r12
            r12.m2491f(r11)
        L1a2:
            java.lang.String r8 = "gcm.n.icon"
            java.lang.String r8 = r4.m3962j(r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L1e0
            java.lang.String r12 = "drawable"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L1bc
            boolean r13 = p057db.C1389b.m3909a(r9, r12)
            if (r13 != 0) goto L215
        L1bc:
            java.lang.String r12 = "mipmap"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L1ca
            boolean r13 = p057db.C1389b.m3909a(r9, r12)
            if (r13 != 0) goto L215
        L1ca:
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 61
            r13.<init>(r12)
            java.lang.String r12 = "Icon resource "
            java.lang.String r14 = " not found. Notification will use default icon."
            p057db.C1387a.m3905a(r13, r12, r8, r14, r3)
        L1e0:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r8 = r6.getInt(r8, r1)
            if (r8 == 0) goto L1ee
            boolean r12 = p057db.C1389b.m3909a(r9, r8)
            if (r12 != 0) goto L209
        L1ee:
            android.content.pm.ApplicationInfo r12 = r10.getApplicationInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f6
            int r5 = r12.icon     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f6
            r12 = r5
            goto L20a
        L1f6:
            r12 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r13 = r13 + 35
            r14.<init>(r13)
            p031c1.C0842j.m2517a(r14, r5, r12, r3)
        L209:
            r12 = r8
        L20a:
            if (r12 == 0) goto L212
            boolean r5 = p057db.C1389b.m3909a(r9, r12)
            if (r5 != 0) goto L215
        L212:
            r12 = 17301651(0x1080093, float:2.4979667E-38)
        L215:
            android.app.Notification r5 = r11.f4485y
            r5.icon = r12
            java.lang.String r5 = "gcm.n.sound2"
            java.lang.String r5 = r4.m3962j(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L22b
            java.lang.String r5 = "gcm.n.sound"
            java.lang.String r5 = r4.m3962j(r5)
        L22b:
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            r12 = 2
            if (r8 == 0) goto L234
            r5 = 0
            goto L279
        L234:
            java.lang.String r8 = "default"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L275
            java.lang.String r8 = "raw"
            int r8 = r9.getIdentifier(r5, r8, r7)
            if (r8 == 0) goto L275
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r8 = r8 + 24
            int r8 = r8 + r9
            r13.<init>(r8)
            java.lang.String r8 = "android.resource://"
            r13.append(r8)
            r13.append(r7)
            java.lang.String r8 = "/raw/"
            r13.append(r8)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L279
        L275:
            android.net.Uri r5 = android.media.RingtoneManager.getDefaultUri(r12)
        L279:
            if (r5 == 0) goto L27e
            r11.m2488g(r5)
        L27e:
            java.lang.String r5 = "gcm.n.click_action"
            java.lang.String r5 = r4.m3962j(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L298
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r5)
            r8.setPackage(r7)
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r8.setFlags(r5)
            goto L2b7
        L298:
            android.net.Uri r5 = r4.m3957e()
            if (r5 == 0) goto L2ac
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r8.<init>(r9)
            r8.setPackage(r7)
            r8.setData(r5)
            goto L2b7
        L2ac:
            android.content.Intent r8 = r10.getLaunchIntentForPackage(r7)
            if (r8 != 0) goto L2b7
            java.lang.String r5 = "No activity found to launch app"
            android.util.Log.w(r3, r5)
        L2b7:
            r5 = 23
            java.lang.String r7 = "google.c.a.e"
            if (r8 != 0) goto L2bf
            r8 = 0
            goto L328
        L2bf:
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r8.addFlags(r9)
            android.os.Bundle r9 = new android.os.Bundle
            android.os.Bundle r10 = r4.f7100a
            r9.<init>(r10)
            android.os.Bundle r10 = r4.f7100a
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L2d5:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L303
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "google.c."
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L2fc
            java.lang.String r14 = "gcm.n."
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L2fc
            java.lang.String r14 = "gcm.notification."
            boolean r14 = r13.startsWith(r14)
            if (r14 == 0) goto L2fa
            goto L2fc
        L2fa:
            r14 = 0
            goto L2fd
        L2fc:
            r14 = 1
        L2fd:
            if (r14 == 0) goto L2d5
            r9.remove(r13)
            goto L2d5
        L303:
            r8.putExtras(r9)
            boolean r9 = r4.m3953a(r7)
            if (r9 == 0) goto L315
            android.os.Bundle r9 = r4.m3964m()
            java.lang.String r10 = "gcm.n.analytics_data"
            r8.putExtra(r10, r9)
        L315:
            java.util.concurrent.atomic.AtomicInteger r9 = p057db.C1389b.f7001a
            int r9 = r9.incrementAndGet()
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r5) goto L322
            r10 = 1140850688(0x44000000, float:512.0)
            goto L324
        L322:
            r10 = 1073741824(0x40000000, float:2.0)
        L324:
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r0, r9, r8, r10)
        L328:
            r11.f4467g = r8
            boolean r7 = r4.m3953a(r7)
            if (r7 != 0) goto L332
            r5 = 0
            goto L36c
        L332:
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r7.<init>(r8)
            android.os.Bundle r8 = r4.m3964m()
            android.content.Intent r7 = r7.putExtras(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = p057db.C1389b.f7001a
            int r8 = r8.incrementAndGet()
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "com.google.firebase.MESSAGING_EVENT"
            r9.<init>(r10)
            android.content.ComponentName r10 = new android.content.ComponentName
            java.lang.String r13 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r10.<init>(r0, r13)
            android.content.Intent r9 = r9.setComponent(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r7 = r9.putExtra(r10, r7)
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r5) goto L366
            r5 = 1140850688(0x44000000, float:512.0)
            goto L368
        L366:
            r5 = 1073741824(0x40000000, float:2.0)
        L368:
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r0, r8, r7, r5)
        L36c:
            if (r5 == 0) goto L372
            android.app.Notification r7 = r11.f4485y
            r7.deleteIntent = r5
        L372:
            java.lang.String r5 = "gcm.n.color"
            java.lang.String r5 = r4.m3962j(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L39d
            int r7 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.IllegalArgumentException -> L387
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L387
            goto L3b4
        L387:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 56
            r8.<init>(r7)
            java.lang.String r7 = "Color is invalid: "
            java.lang.String r9 = ". Notification will use default color."
            p057db.C1387a.m3905a(r8, r7, r5, r9, r3)
        L39d:
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_color"
            int r5 = r6.getInt(r5, r1)
            if (r5 == 0) goto L3b3
            int r0 = p046d0.C1259a.m3706b(r0, r5)     // Catch: android.content.res.Resources.NotFoundException -> L3ae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: android.content.res.Resources.NotFoundException -> L3ae
            goto L3b4
        L3ae:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r3, r0)
        L3b3:
            r0 = 0
        L3b4:
            if (r0 == 0) goto L3bc
            int r0 = r0.intValue()
            r11.f4480t = r0
        L3bc:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r4.m3953a(r0)
            r0 = r0 ^ 1
            r5 = 16
            r11.m2486e(r5, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r4.m3953a(r0)
            r11.f4476p = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r4.m3962j(r0)
            if (r0 == 0) goto L3e1
            android.app.Notification r5 = r11.f4485y
            java.lang.CharSequence r0 = p030c0.C0826m.m2482b(r0)
            r5.tickerText = r0
        L3e1:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r4.m3954b(r0)
            r5 = -2
            if (r0 != 0) goto L3eb
            goto L40d
        L3eb:
            int r6 = r0.intValue()
            if (r6 < r5) goto L3f7
            int r6 = r0.intValue()
            if (r6 <= r12) goto L40e
        L3f7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r7.<init>(r6)
            java.lang.String r6 = "notificationPriority is invalid "
            java.lang.String r8 = ". Skipping setting notificationPriority."
            p057db.C1387a.m3905a(r7, r6, r0, r8, r3)
        L40d:
            r0 = 0
        L40e:
            if (r0 == 0) goto L416
            int r0 = r0.intValue()
            r11.f4470j = r0
        L416:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r4.m3954b(r0)
            if (r0 != 0) goto L41f
            goto L445
        L41f:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L42d
            int r6 = r0.intValue()
            r7 = 1
            if (r6 <= r7) goto L446
        L42d:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 53
            r7.<init>(r6)
            java.lang.String r6 = "visibility is invalid: "
            java.lang.String r8 = ". Skipping setting visibility."
            java.lang.String r9 = "NotificationParams"
            p057db.C1387a.m3905a(r7, r6, r0, r8, r9)
        L445:
            r0 = 0
        L446:
            if (r0 == 0) goto L44e
            int r0 = r0.intValue()
            r11.f4481u = r0
        L44e:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r4.m3954b(r0)
            if (r0 != 0) goto L457
            goto L473
        L457:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L474
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 67
            r7.<init>(r6)
            java.lang.String r6 = "notificationCount is invalid: "
            java.lang.String r8 = ". Skipping setting notificationCount."
            p057db.C1387a.m3905a(r7, r6, r0, r8, r3)
        L473:
            r0 = 0
        L474:
            if (r0 == 0) goto L47c
            int r0 = r0.intValue()
            r11.f4469i = r0
        L47c:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.Long r0 = r4.m3960h(r0)
            if (r0 == 0) goto L48f
            r6 = 1
            r11.f4471k = r6
            long r6 = r0.longValue()
            android.app.Notification r0 = r11.f4485y
            r0.when = r6
        L48f:
            long[] r0 = r4.m3963k()
            if (r0 == 0) goto L499
            android.app.Notification r6 = r11.f4485y
            r6.vibrate = r0
        L499:
            int[] r0 = r4.m3956d()
            if (r0 == 0) goto L4bb
            r6 = r0[r1]
            r7 = 1
            r7 = r0[r7]
            r0 = r0[r12]
            android.app.Notification r8 = r11.f4485y
            r8.ledARGB = r6
            r8.ledOnMS = r7
            r8.ledOffMS = r0
            if (r7 == 0) goto L4b4
            if (r0 == 0) goto L4b4
            r0 = 1
            goto L4b5
        L4b4:
            r0 = 0
        L4b5:
            int r6 = r8.flags
            r5 = r5 & r6
            r0 = r0 | r5
            r8.flags = r0
        L4bb:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r4.m3953a(r0)
            java.lang.String r5 = "gcm.n.default_vibrate_timings"
            boolean r5 = r4.m3953a(r5)
            if (r5 == 0) goto L4cb
            r0 = r0 | 2
        L4cb:
            java.lang.String r5 = "gcm.n.default_light_settings"
            boolean r5 = r4.m3953a(r5)
            if (r5 == 0) goto L4d5
            r0 = r0 | 4
        L4d5:
            android.app.Notification r5 = r11.f4485y
            r5.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L4e3
            int r0 = r5.flags
            r0 = r0 | 1
            r5.flags = r0
        L4e3:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r4.m3962j(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L4f0
            goto L507
        L4f0:
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 37
            r0.<init>(r6)
            java.lang.String r6 = "FCM-Notification:"
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L507:
            if (r2 != 0) goto L50a
            goto L565
        L50a:
            s7.i<android.graphics.Bitmap> r4 = r2.f7092Z     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            java.lang.String r5 = "null reference"
            java.util.Objects.requireNonNull(r4, r5)     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r5 = 5
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            java.lang.Object r4 = p327s7.C5988l.m12461b(r4, r5, r7)     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r11.m2487f(r4)     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            c0.k r5 = new c0.k     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r5.<init>()     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r5.f4457b = r4     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r4 = 0
            r5.m2477g(r4)     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            c0.n r4 = r11.f4473m     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            if (r4 == r5) goto L565
            r11.f4473m = r5     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            r5.m2491f(r11)     // Catch: java.util.concurrent.TimeoutException -> L533 java.lang.InterruptedException -> L53c java.util.concurrent.ExecutionException -> L54c
            goto L565
        L533:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r3, r4)
            r2.close()
            goto L565
        L53c:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r3, r4)
            r2.close()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L565
        L54c:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r5.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            p031c1.C0842j.m2517a(r5, r4, r2, r3)
        L565:
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L571
            java.lang.String r2 = "Showing notification"
            android.util.Log.d(r3, r2)
        L571:
            android.content.Context r2 = r15.f7013b
            java.lang.String r3 = "notification"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            android.app.Notification r3 = r11.m2483a()
            r2.notify(r0, r1, r3)
            r0 = 1
            return r0
    }
}
