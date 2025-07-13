package com.google.firebase.messaging;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends p057db.AbstractServiceC1397f {

    /* renamed from: d0 */
    public static final java.util.Queue<java.lang.String> f6621d0 = null;

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 10
            r0.<init>(r1)
            com.google.firebase.messaging.FirebaseMessagingService.f6621d0 = r0
            return
    }

    public FirebaseMessagingService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p057db.AbstractServiceC1397f
    /* renamed from: b */
    public void mo3666b(android.content.Intent r32) {
            r31 = this;
            r1 = r31
            r2 = r32
            java.lang.String r0 = r32.getAction()
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r3 = r3.equals(r0)
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 != 0) goto L4b
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L1b
            goto L4b
        L1b:
            java.lang.String r3 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "token"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.mo3668d(r0)
            return
        L2d:
            java.lang.String r0 = r32.getAction()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unknown intent action: "
            int r3 = r0.length()
            if (r3 == 0) goto L42
            java.lang.String r0 = r2.concat(r0)
            goto L47
        L42:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L47:
            android.util.Log.d(r5, r0)
            return
        L4b:
            java.lang.String r0 = "google.message_id"
            java.lang.String r3 = r2.getStringExtra(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r7 = 3
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L5b
            goto L94
        L5b:
            java.util.Queue<java.lang.String> r6 = com.google.firebase.messaging.FirebaseMessagingService.f6621d0
            java.util.ArrayDeque r6 = (java.util.ArrayDeque) r6
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L86
            boolean r6 = android.util.Log.isLoggable(r5, r7)
            if (r6 == 0) goto L84
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = "Received duplicate message: "
            int r10 = r3.length()
            if (r10 == 0) goto L7c
            java.lang.String r3 = r6.concat(r3)
            goto L81
        L7c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r6)
        L81:
            android.util.Log.d(r5, r3)
        L84:
            r3 = 1
            goto L95
        L86:
            int r10 = r6.size()
            r11 = 10
            if (r10 < r11) goto L91
            r6.remove()
        L91:
            r6.add(r3)
        L94:
            r3 = 0
        L95:
            if (r3 != 0) goto L341
            java.lang.String r3 = "message_type"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r6 = "gcm"
            if (r3 != 0) goto La2
            r3 = r6
        La2:
            int r10 = r3.hashCode()
            r11 = 2
            switch(r10) {
                case -2062414158: goto Lc7;
                case 102161: goto Lbf;
                case 814694033: goto Lb5;
                case 814800675: goto Lab;
                default: goto Laa;
            }
        Laa:
            goto Ld1
        Lab:
            java.lang.String r6 = "send_event"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto Ld1
            r6 = 2
            goto Ld2
        Lb5:
            java.lang.String r6 = "send_error"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto Ld1
            r6 = 3
            goto Ld2
        Lbf:
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto Ld1
            r6 = 0
            goto Ld2
        Lc7:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto Ld1
            r6 = 1
            goto Ld2
        Ld1:
            r6 = -1
        Ld2:
            java.lang.String r10 = "message_id"
            if (r6 == 0) goto L10f
            if (r6 == r8) goto L341
            if (r6 == r11) goto L10a
            if (r6 == r7) goto Lf4
            java.lang.String r0 = "Received message with unknown type: "
            int r2 = r3.length()
            if (r2 == 0) goto Le9
            java.lang.String r0 = r0.concat(r3)
            goto Lef
        Le9:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        Lef:
            android.util.Log.w(r5, r0)
            goto L341
        Lf4:
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto Lfd
            r2.getStringExtra(r10)
        Lfd:
            j6.m r0 = new j6.m
            java.lang.String r3 = "error"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.<init>(r2)
            goto L341
        L10a:
            r2.getStringExtra(r0)
            goto L341
        L10f:
            boolean r3 = p057db.C1420u.m3945c(r32)
            if (r3 == 0) goto L11e
            android.os.Bundle r3 = r32.getExtras()
            java.lang.String r6 = "_nr"
            p057db.C1420u.m3944b(r6, r3)
        L11e:
            java.lang.String r3 = r32.getAction()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L129
            goto L172
        L129:
            java.lang.String r3 = "delivery_metrics_exported_to_big_query_enabled"
            p251o9.C5180d.m11494c()     // Catch: java.lang.IllegalStateException -> L16d
            o9.d r4 = p251o9.C5180d.m11494c()
            r4.m11497a()
            android.content.Context r4 = r4.f20312a
            java.lang.String r6 = "com.google.firebase.messaging"
            android.content.SharedPreferences r6 = r4.getSharedPreferences(r6, r9)
            java.lang.String r7 = "export_to_big_query"
            boolean r12 = r6.contains(r7)
            if (r12 == 0) goto L14a
            boolean r3 = r6.getBoolean(r7, r9)
            goto L173
        L14a:
            android.content.pm.PackageManager r6 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            if (r6 == 0) goto L172
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            r7 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r6.getApplicationInfo(r4, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            if (r4 == 0) goto L172
            android.os.Bundle r6 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            if (r6 == 0) goto L172
            boolean r6 = r6.containsKey(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            if (r6 == 0) goto L172
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            boolean r3 = r4.getBoolean(r3, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L172
            goto L173
        L16d:
            java.lang.String r3 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r5, r3)
        L172:
            r3 = 0
        L173:
            if (r3 == 0) goto L2ee
            eb.a$b r26 = p076eb.C1811a.b.f7907a0
            t3.g r3 = com.google.firebase.messaging.FirebaseMessaging.f6605l
            if (r3 != 0) goto L182
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r5, r0)
            goto L2ee
        L182:
            android.os.Bundle r4 = r32.getExtras()
            if (r4 != 0) goto L18a
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L18a:
            int r6 = p076eb.C1811a.f7878p
            java.lang.String r6 = ""
            java.lang.String r7 = "google.ttl"
            java.lang.Object r7 = r4.get(r7)
            boolean r9 = r7 instanceof java.lang.Integer
            if (r9 == 0) goto L19f
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            goto L1aa
        L19f:
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L1c1
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.NumberFormatException -> L1ad
            int r7 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L1ad
        L1aa:
            r22 = r7
            goto L1c4
        L1ad:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r9 = r7.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r9 = r9 + 13
            r12.<init>(r9)
            java.lang.String r9 = "Invalid TTL: "
            p031c1.C0842j.m2517a(r12, r9, r7, r5)
        L1c1:
            r7 = 0
            r22 = 0
        L1c4:
            java.lang.String r7 = "google.to"
            java.lang.String r7 = r4.getString(r7)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L1d3
        L1d0:
            r16 = r7
            goto L1e6
        L1d3:
            o9.d r7 = p251o9.C5180d.m11494c()     // Catch: java.lang.InterruptedException -> L2e5 java.util.concurrent.ExecutionException -> L2e7
            xa.c r7 = p412xa.C7010c.m14153f(r7)     // Catch: java.lang.InterruptedException -> L2e5 java.util.concurrent.ExecutionException -> L2e7
            s7.i r7 = r7.mo14165r()     // Catch: java.lang.InterruptedException -> L2e5 java.util.concurrent.ExecutionException -> L2e7
            java.lang.Object r7 = p327s7.C5988l.m12460a(r7)     // Catch: java.lang.InterruptedException -> L2e5 java.util.concurrent.ExecutionException -> L2e7
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.InterruptedException -> L2e5 java.util.concurrent.ExecutionException -> L2e7
            goto L1d0
        L1e6:
            o9.d r7 = p251o9.C5180d.m11494c()
            r7.m11497a()
            android.content.Context r7 = r7.f20312a
            java.lang.String r19 = r7.getPackageName()
            eb.a$d r18 = p076eb.C1811a.d.f7918a0
            boolean r7 = p057db.C1422w.m3951l(r4)
            if (r7 == 0) goto L1fe
            eb.a$c r7 = p076eb.C1811a.c.f7914c0
            goto L200
        L1fe:
            eb.a$c r7 = p076eb.C1811a.c.f7912a0
        L200:
            r17 = r7
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L20c
            java.lang.String r0 = r4.getString(r10)
        L20c:
            if (r0 == 0) goto L210
            r15 = r0
            goto L211
        L210:
            r15 = r6
        L211:
            java.lang.String r0 = p057db.C1420u.m3943a(r4)
            if (r0 == 0) goto L21a
            r23 = r0
            goto L21c
        L21a:
            r23 = r6
        L21c:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L227
            r20 = r0
            goto L229
        L227:
            r20 = r6
        L229:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L234
            r27 = r0
            goto L236
        L234:
            r27 = r6
        L236:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L241
            r30 = r0
            goto L243
        L241:
            r30 = r6
        L243:
            java.lang.String r0 = "google.c.sender.id"
            boolean r6 = r4.containsKey(r0)
            r9 = 0
            if (r6 == 0) goto L25c
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.NumberFormatException -> L256
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L256
            goto L2a5
        L256:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r5, r4, r0)
        L25c:
            o9.d r4 = p251o9.C5180d.m11494c()
            r4.m11497a()
            o9.h r0 = r4.f20314c
            java.lang.String r0 = r0.f20328e
            if (r0 == 0) goto L275
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L26e
            goto L2a5
        L26e:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r5, r0, r6)
        L275:
            r4.m11497a()
            o9.h r0 = r4.f20314c
            java.lang.String r0 = r0.f20325b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L285
            goto L298
        L285:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 >= r11) goto L28f
            goto L2a4
        L28f:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L298
            goto L2a4
        L298:
            long r6 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L29d
            goto L2a5
        L29d:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "error parsing app ID"
            android.util.Log.w(r5, r0, r4)
        L2a4:
            r6 = r9
        L2a5:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2ab
            r13 = r6
            goto L2ac
        L2ab:
            r13 = r9
        L2ac:
            eb.a r0 = new eb.a
            r12 = r0
            r21 = 0
            r24 = 0
            r28 = 0
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r30)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.Class<eb.b> r6 = p076eb.C1812b.class
            java.lang.String r7 = "proto"
            t3.b r8 = new t3.b     // Catch: java.lang.RuntimeException -> L2de
            r8.<init>(r7)     // Catch: java.lang.RuntimeException -> L2de
            t3.e r7 = p057db.C1419t.f7094Y     // Catch: java.lang.RuntimeException -> L2de
            t3.f r3 = r3.mo12698a(r4, r6, r8, r7)     // Catch: java.lang.RuntimeException -> L2de
            eb.b r4 = new eb.b     // Catch: java.lang.RuntimeException -> L2de
            r4.<init>(r0)     // Catch: java.lang.RuntimeException -> L2de
            t3.a r0 = new t3.a     // Catch: java.lang.RuntimeException -> L2de
            t3.d r6 = p335t3.EnumC6151d.f23743Z     // Catch: java.lang.RuntimeException -> L2de
            r7 = 0
            r0.<init>(r7, r4, r6)     // Catch: java.lang.RuntimeException -> L2de
            w3.k r3 = (p385w3.C6789k) r3     // Catch: java.lang.RuntimeException -> L2de
            androidx.room.a r4 = androidx.room.C0618a.f3651a0     // Catch: java.lang.RuntimeException -> L2de
            r3.m13809a(r0, r4)     // Catch: java.lang.RuntimeException -> L2de
            goto L2ee
        L2de:
            r0 = move-exception
            java.lang.String r3 = "Failed to send big query analytics payload."
            android.util.Log.w(r5, r3, r0)
            goto L2ee
        L2e5:
            r0 = move-exception
            goto L2e8
        L2e7:
            r0 = move-exception
        L2e8:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L2ee:
            android.os.Bundle r0 = r32.getExtras()
            if (r0 != 0) goto L2f9
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L2f9:
            java.lang.String r3 = "androidx.content.wakelockid"
            r0.remove(r3)
            boolean r3 = p057db.C1422w.m3951l(r0)
            if (r3 == 0) goto L339
            db.w r3 = new db.w
            r3.<init>(r0)
            v6.a r4 = new v6.a
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            db.d r5 = new db.d
            r5.<init>(r1, r3, r4)
            boolean r3 = r5.m3915a()     // Catch: java.lang.Throwable -> L333
            r4.shutdown()
            if (r3 == 0) goto L323
            goto L341
        L323:
            boolean r3 = p057db.C1420u.m3945c(r32)
            if (r3 == 0) goto L339
            android.os.Bundle r2 = r32.getExtras()
            java.lang.String r3 = "_nf"
            p057db.C1420u.m3944b(r3, r2)
            goto L339
        L333:
            r0 = move-exception
            r2 = r0
            r4.shutdown()
            throw r2
        L339:
            db.x r2 = new db.x
            r2.<init>(r0)
            r1.mo3667c(r2)
        L341:
            return
    }

    /* renamed from: c */
    public void mo3667c(p057db.C1423x r1) {
            r0 = this;
            return
    }

    /* renamed from: d */
    public void mo3668d(java.lang.String r1) {
            r0 = this;
            return
    }
}
