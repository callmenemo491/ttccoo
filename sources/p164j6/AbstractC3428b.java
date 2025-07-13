package p164j6;

/* renamed from: j6.b */
/* loaded from: classes.dex */
public abstract class AbstractC3428b extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final java.util.concurrent.ExecutorService f14873a;

    public AbstractC3428b() {
            r9 = this;
            r9.<init>()
            v6.a r7 = new v6.a
            java.lang.String r0 = "firebase-iid-executor"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r8.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r8)
            r9.f14873a = r0
            return
    }

    /* renamed from: a */
    public final int m7883a(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            java.lang.String r4 = "pending_intent"
            android.os.Parcelable r0 = r5.getParcelableExtra(r4)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            java.lang.String r1 = "CloudMessagingReceiver"
            if (r0 == 0) goto L15
            r0.send()     // Catch: android.app.PendingIntent.CanceledException -> L10
            goto L15
        L10:
            java.lang.String r0 = "Notification pending intent canceled"
            android.util.Log.e(r1, r0)
        L15:
            android.os.Bundle r0 = r5.getExtras()
            if (r0 == 0) goto L1f
            r0.remove(r4)
            goto L24
        L1f:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L24:
            java.lang.String r4 = r5.getAction()
            java.lang.String r2 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L31
            goto L55
        L31:
            java.lang.String r4 = r5.getAction()
            java.lang.String r5 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L57
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r5)
            android.content.Intent r4 = r4.putExtras(r0)
            boolean r5 = p057db.C1420u.m3945c(r4)
            if (r5 == 0) goto L55
            android.os.Bundle r4 = r4.getExtras()
            java.lang.String r5 = "_nd"
            p057db.C1420u.m3944b(r5, r4)
        L55:
            r4 = -1
            return r4
        L57:
            java.lang.String r4 = "Unknown notification action"
            android.util.Log.e(r1, r4)
            r4 = 500(0x1f4, float:7.0E-43)
            return r4
    }

    /* renamed from: b */
    public final int m7884b(android.content.Context r7, android.content.Intent r8) {
            r6 = this;
            android.os.Bundle r0 = r8.getExtras()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "google.message_id"
            java.lang.String r0 = r8.getStringExtra(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1b
            r0 = 0
            s7.i r0 = p327s7.C5988l.m12464e(r0)
            goto L3a
        L1b:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "google.message_id"
            r2.putString(r3, r0)
            j6.h r0 = p164j6.C3434h.m7889m(r7)
            j6.l r3 = new j6.l
            monitor-enter(r0)
            int r4 = r0.f14895c0     // Catch: java.lang.Throwable -> L93
            int r5 = r4 + 1
            r0.f14895c0 = r5     // Catch: java.lang.Throwable -> L93
            monitor-exit(r0)
            r3.<init>(r4, r2)
            s7.i r0 = r0.m7900n(r3)
        L3a:
            j6.a r2 = new j6.a
            r2.<init>(r8)
            db.l r8 = new db.l     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            r8.<init>(r7)     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            android.content.Intent r7 = r2.f14872Y     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            s7.i r7 = r8.m3933b(r7)     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            java.lang.Object r7 = p327s7.C5988l.m12460a(r7)     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            int r1 = r7.intValue()     // Catch: java.lang.InterruptedException -> L55 java.util.concurrent.ExecutionException -> L57
            goto L5f
        L55:
            r7 = move-exception
            goto L58
        L57:
            r7 = move-exception
        L58:
            java.lang.String r8 = "FirebaseMessaging"
            java.lang.String r2 = "Failed to send message to service."
            android.util.Log.e(r8, r2, r7)
        L5f:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L6d java.lang.InterruptedException -> L6f java.util.concurrent.ExecutionException -> L71
            r2 = 1
            long r7 = r7.toMillis(r2)     // Catch: java.util.concurrent.TimeoutException -> L6d java.lang.InterruptedException -> L6f java.util.concurrent.ExecutionException -> L71
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L6d java.lang.InterruptedException -> L6f java.util.concurrent.ExecutionException -> L71
            p327s7.C5988l.m12461b(r0, r7, r2)     // Catch: java.util.concurrent.TimeoutException -> L6d java.lang.InterruptedException -> L6f java.util.concurrent.ExecutionException -> L71
            goto L92
        L6d:
            r7 = move-exception
            goto L72
        L6f:
            r7 = move-exception
            goto L72
        L71:
            r7 = move-exception
        L72:
            java.lang.String r8 = "CloudMessagingReceiver"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r0 = r7.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.w(r8, r7)
        L92:
            return r1
        L93:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            r8 = this;
            if (r10 != 0) goto L3
            return
        L3:
            boolean r4 = r8.isOrderedBroadcast()
            android.content.BroadcastReceiver$PendingResult r5 = r8.goAsync()
            java.util.concurrent.ExecutorService r6 = r8.f14873a
            j6.g r7 = new j6.g
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.execute(r7)
            return
    }
}
