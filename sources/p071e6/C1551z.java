package p071e6;

/* renamed from: e6.z */
/* loaded from: classes.dex */
public final class C1551z extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.gms.cast.framework.media.MediaNotificationService f7473a;

    public C1551z(com.google.android.gms.cast.framework.media.MediaNotificationService r1) {
            r0 = this;
            r0.f7473a = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            r8 = this;
            java.lang.String r0 = "targetActivity"
            android.os.Parcelable r10 = r10.getParcelableExtra(r0)
            android.content.ComponentName r10 = (android.content.ComponentName) r10
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r10, r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.setComponent(r10)
            com.google.android.gms.cast.framework.media.MediaNotificationService r2 = r8.f7473a
            d6.a r2 = r2.f5472m0
            java.util.Objects.requireNonNull(r2)
            java.lang.String r3 = "Must be called from the main thread."
            com.google.android.gms.common.internal.C1101a.m3099d(r3)
            r3 = 0
            r4 = 1
            d6.o0 r2 = r2.f6809b     // Catch: android.os.RemoteException -> L2a
            boolean r2 = r2.mo3814i()     // Catch: android.os.RemoteException -> L2a
            goto L42
        L2a:
            r2 = move-exception
            h6.b r5 = p052d6.C1295a.f6805i
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "hasActivityInRecents"
            r6[r3] = r7
            java.lang.Class<d6.o0> r7 = p052d6.InterfaceC1324o0.class
            java.lang.String r7 = r7.getSimpleName()
            r6[r4] = r7
            java.lang.String r7 = "Unable to call %s on %s."
            r5.m6377b(r2, r7, r6)
            r2 = 0
        L42:
            r5 = 134217728(0x8000000, float:3.85186E-34)
            if (r2 == 0) goto L53
            r10 = 603979776(0x24000000, float:2.7755576E-17)
            r1.setFlags(r10)
            int r10 = p072e7.C1642j.f7655a
            r10 = r10 | r5
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r9, r4, r1, r10)
            goto L99
        L53:
            com.google.android.gms.cast.framework.media.MediaNotificationService r2 = r8.f7473a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r6.size()
        L5e:
            android.content.Intent r10 = p030c0.C0821h.m2472b(r2, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            if (r10 == 0) goto L6c
            r6.add(r7, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            android.content.ComponentName r10 = r10.getComponent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lbe
            goto L5e
        L6c:
            r6.add(r1)
            int r10 = p072e7.C1642j.f7655a
            r10 = r10 | r5
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto Lb6
            int r1 = r6.size()
            android.content.Intent[] r1 = new android.content.Intent[r1]
            java.lang.Object[] r1 = r6.toArray(r1)
            android.content.Intent[] r1 = (android.content.Intent[]) r1
            android.content.Intent r5 = new android.content.Intent
            r6 = r1[r3]
            r5.<init>(r6)
            r6 = 268484608(0x1000c000, float:2.539146E-29)
            android.content.Intent r5 = r5.addFlags(r6)
            r1[r3] = r5
            r5 = 0
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivities(r2, r4, r1, r10, r5)
        L99:
            java.util.Objects.requireNonNull(r10, r0)     // Catch: android.app.PendingIntent.CanceledException -> Lab
            android.content.Intent r0 = new android.content.Intent     // Catch: android.app.PendingIntent.CanceledException -> Lab
            r0.<init>()     // Catch: android.app.PendingIntent.CanceledException -> Lab
            r1 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r0 = r0.setFlags(r1)     // Catch: android.app.PendingIntent.CanceledException -> Lab
            r10.send(r9, r4, r0)     // Catch: android.app.PendingIntent.CanceledException -> Lab
            return
        Lab:
            r9 = move-exception
            h6.b r10 = com.google.android.gms.cast.framework.media.MediaNotificationService.f5456o0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "Sending PendingIntent failed"
            r10.m6377b(r9, r1, r0)
            return
        Lb6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "No intents added to TaskStackBuilder; cannot getPendingIntent"
            r9.<init>(r10)
            throw r9
        Lbe:
            r9 = move-exception
            java.lang.String r10 = "TaskStackBuilder"
            java.lang.String r0 = "Bad ComponentName while traversing activity parent metadata"
            android.util.Log.e(r10, r0)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r9)
            throw r10
    }
}
