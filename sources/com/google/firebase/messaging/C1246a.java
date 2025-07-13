package com.google.firebase.messaging;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public class C1246a {

    /* renamed from: a */
    public final android.content.SharedPreferences f6622a;

    /* renamed from: b */
    public final android.content.Context f6623b;

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class a {

        /* renamed from: d */
        public static final long f6624d = 0;

        /* renamed from: a */
        public final java.lang.String f6625a;

        /* renamed from: b */
        public final java.lang.String f6626b;

        /* renamed from: c */
        public final long f6627c;

        static {
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
                r1 = 7
                long r0 = r0.toMillis(r1)
                com.google.firebase.messaging.C1246a.a.f6624d = r0
                return
        }

        public a(java.lang.String r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.f6625a = r1
                r0.f6626b = r2
                r0.f6627c = r3
                return
        }

        /* renamed from: a */
        public static java.lang.String m3671a(java.lang.String r2, java.lang.String r3, long r4) {
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L19
                r0.<init>()     // Catch: org.json.JSONException -> L19
                java.lang.String r1 = "token"
                r0.put(r1, r2)     // Catch: org.json.JSONException -> L19
                java.lang.String r2 = "appVersion"
                r0.put(r2, r3)     // Catch: org.json.JSONException -> L19
                java.lang.String r2 = "timestamp"
                r0.put(r2, r4)     // Catch: org.json.JSONException -> L19
                java.lang.String r2 = r0.toString()     // Catch: org.json.JSONException -> L19
                return r2
            L19:
                r2 = move-exception
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                int r3 = r3 + 24
                r4.<init>(r3)
                java.lang.String r3 = "Failed to encode token: "
                java.lang.String r5 = "FirebaseMessaging"
                p031c1.C0842j.m2517a(r4, r3, r2, r5)
                r2 = 0
                return r2
        }

        /* renamed from: b */
        public static com.google.firebase.messaging.C1246a.a m3672b(java.lang.String r6) {
                boolean r0 = android.text.TextUtils.isEmpty(r6)
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = "{"
                boolean r0 = r6.startsWith(r0)
                if (r0 == 0) goto L45
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
                r0.<init>(r6)     // Catch: org.json.JSONException -> L2d
                com.google.firebase.messaging.a$a r6 = new com.google.firebase.messaging.a$a     // Catch: org.json.JSONException -> L2d
                java.lang.String r2 = "token"
                java.lang.String r2 = r0.getString(r2)     // Catch: org.json.JSONException -> L2d
                java.lang.String r3 = "appVersion"
                java.lang.String r3 = r0.getString(r3)     // Catch: org.json.JSONException -> L2d
                java.lang.String r4 = "timestamp"
                long r4 = r0.getLong(r4)     // Catch: org.json.JSONException -> L2d
                r6.<init>(r2, r3, r4)     // Catch: org.json.JSONException -> L2d
                return r6
            L2d:
                r6 = move-exception
                java.lang.String r6 = java.lang.String.valueOf(r6)
                int r0 = r6.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r0 = r0 + 23
                r2.<init>(r0)
                java.lang.String r0 = "Failed to parse token: "
                java.lang.String r3 = "FirebaseMessaging"
                p031c1.C0842j.m2517a(r2, r0, r6, r3)
                return r1
            L45:
                com.google.firebase.messaging.a$a r0 = new com.google.firebase.messaging.a$a
                r2 = 0
                r0.<init>(r6, r1, r2)
                return r0
        }
    }

    public C1246a(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.f6623b = r4
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f6622a = r0
            java.lang.Object r1 = p046d0.C1259a.f6733a
            java.io.File r4 = p046d0.C1259a.b.m3711c(r4)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "com.google.android.gms.appid-no-backup"
            r1.<init>(r4, r2)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L22
            goto L78
        L22:
            boolean r4 = r1.createNewFile()     // Catch: java.io.IOException -> L4f
            if (r4 == 0) goto L78
            monitor-enter(r3)     // Catch: java.io.IOException -> L4f
            java.util.Map r4 = r0.getAll()     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)     // Catch: java.io.IOException -> L4f
            if (r4 != 0) goto L78
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r4, r1)     // Catch: java.io.IOException -> L4f
            monitor-enter(r3)     // Catch: java.io.IOException -> L4f
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch: java.lang.Throwable -> L49
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch: java.lang.Throwable -> L49
            r4.commit()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r3)     // Catch: java.io.IOException -> L4f
            goto L78
        L49:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.io.IOException -> L4f
            throw r4     // Catch: java.io.IOException -> L4f
        L4c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.io.IOException -> L4f
            throw r4     // Catch: java.io.IOException -> L4f
        L4f:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L78
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r4.length()
            if (r1 == 0) goto L6e
            java.lang.String r4 = r0.concat(r4)
            goto L73
        L6e:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L73:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r4)
        L78:
            return
    }

    /* renamed from: a */
    public final java.lang.String m3669a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 5
            int r0 = r0 + r1
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = "|T|"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = "|*"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    /* renamed from: b */
    public synchronized void m3670b(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            monitor-enter(r2)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r5 = com.google.firebase.messaging.C1246a.a.m3671a(r5, r6, r0)     // Catch: java.lang.Throwable -> L1f
            if (r5 != 0) goto Ld
            monitor-exit(r2)
            return
        Ld:
            android.content.SharedPreferences r6 = r2.f6622a     // Catch: java.lang.Throwable -> L1f
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r2.m3669a(r3, r4)     // Catch: java.lang.Throwable -> L1f
            r6.putString(r3, r5)     // Catch: java.lang.Throwable -> L1f
            r6.commit()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            return
        L1f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
