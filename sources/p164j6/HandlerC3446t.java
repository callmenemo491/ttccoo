package p164j6;

/* renamed from: j6.t */
/* loaded from: classes.dex */
public final class HandlerC3446t extends p091f7.HandlerC2078a {

    /* renamed from: a */
    public final /* synthetic */ p164j6.C3429c f14917a;

    public HandlerC3446t(p164j6.C3429c r1, android.os.Looper r2) {
            r0 = this;
            r0.f14917a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r9) {
            r8 = this;
            j6.c r0 = r8.f14917a
            java.util.Objects.requireNonNull(r0)
            if (r9 == 0) goto L179
            java.lang.Object r1 = r9.obj
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto L179
            android.content.Intent r1 = (android.content.Intent) r1
            j6.d$a r2 = new j6.d$a
            r2.<init>()
            r1.setExtrasClassLoader(r2)
            java.lang.String r2 = "google.messenger"
            boolean r2 = r1.hasExtra(r2)
            if (r2 == 0) goto L36
            java.lang.String r2 = "google.messenger"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            boolean r2 = r1 instanceof p164j6.C3430d
            if (r2 == 0) goto L2e
            r2 = r1
            j6.d r2 = (p164j6.C3430d) r2
            r0.f14882g = r2
        L2e:
            boolean r2 = r1 instanceof android.os.Messenger
            if (r2 == 0) goto L36
            android.os.Messenger r1 = (android.os.Messenger) r1
            r0.f14881f = r1
        L36:
            java.lang.Object r9 = r9.obj
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.String r1 = r9.getAction()
            java.lang.String r2 = "com.google.android.c2dm.intent.REGISTRATION"
            boolean r2 = r2.equals(r1)
            r3 = 3
            if (r2 != 0) goto L66
            java.lang.String r9 = "Rpc"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L180
            java.lang.String r9 = "Rpc"
            java.lang.String r0 = "Unexpected response action: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L5f
            goto L153
        L5f:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L15d
        L66:
            java.lang.String r1 = "registration_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            if (r1 != 0) goto L74
            java.lang.String r1 = "unregistered"
            java.lang.String r1 = r9.getStringExtra(r1)
        L74:
            r2 = 2
            r4 = 1
            if (r1 != 0) goto L131
            java.lang.String r1 = "error"
            java.lang.String r1 = r9.getStringExtra(r1)
            if (r1 != 0) goto La3
            java.lang.String r0 = "Rpc"
            android.os.Bundle r9 = r9.getExtras()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r1 = r9.length()
            int r1 = r1 + 49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unexpected response, no error or registration id "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            goto L17d
        La3:
            java.lang.String r5 = "Rpc"
            boolean r5 = android.util.Log.isLoggable(r5, r3)
            if (r5 == 0) goto Lc3
            java.lang.String r5 = "Rpc"
            java.lang.String r6 = "Received InstanceID error "
            int r7 = r1.length()
            if (r7 == 0) goto Lba
            java.lang.String r6 = r6.concat(r1)
            goto Lc0
        Lba:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        Lc0:
            android.util.Log.d(r5, r6)
        Lc3:
            java.lang.String r5 = "|"
            boolean r5 = r1.startsWith(r5)
            if (r5 == 0) goto L112
            java.lang.String r5 = "\\|"
            java.lang.String[] r5 = r1.split(r5)
            int r6 = r5.length
            if (r6 <= r2) goto Lfb
            java.lang.String r6 = "ID"
            r7 = r5[r4]
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Ldf
            goto Lfb
        Ldf:
            r1 = r5[r2]
            r2 = r5[r3]
            java.lang.String r3 = ":"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto Lef
            java.lang.String r2 = r2.substring(r4)
        Lef:
            java.lang.String r3 = "error"
            android.content.Intent r9 = r9.putExtra(r3, r2)
            android.os.Bundle r9 = r9.getExtras()
            goto L175
        Lfb:
            java.lang.String r0 = "Rpc"
            java.lang.String r9 = "Unexpected structured response "
            int r2 = r1.length()
            if (r2 == 0) goto L10b
            java.lang.String r9 = r9.concat(r1)
            goto L17d
        L10b:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
            r9 = r1
            goto L17d
        L112:
            s.h<java.lang.String, s7.j<android.os.Bundle>> r5 = r0.f14876a
            monitor-enter(r5)
            r1 = 0
        L116:
            s.h<java.lang.String, s7.j<android.os.Bundle>> r2 = r0.f14876a     // Catch: java.lang.Throwable -> L12e
            int r3 = r2.f22812a0     // Catch: java.lang.Throwable -> L12e
            if (r1 >= r3) goto L12c
            java.lang.Object r2 = r2.m12343h(r1)     // Catch: java.lang.Throwable -> L12e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L12e
            android.os.Bundle r3 = r9.getExtras()     // Catch: java.lang.Throwable -> L12e
            r0.m7885a(r2, r3)     // Catch: java.lang.Throwable -> L12e
            int r1 = r1 + 1
            goto L116
        L12c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12e
            goto L180
        L12e:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12e
            throw r9
        L131:
            java.lang.String r5 = "\\|ID\\|([^|]+)\\|:?+(.*)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r6 = r5.matches()
            if (r6 != 0) goto L162
            java.lang.String r9 = "Rpc"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L180
            java.lang.String r9 = "Rpc"
            java.lang.String r0 = "Unexpected response string: "
            int r2 = r1.length()
            if (r2 == 0) goto L158
        L153:
            java.lang.String r0 = r0.concat(r1)
            goto L15e
        L158:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
        L15d:
            r0 = r1
        L15e:
            android.util.Log.d(r9, r0)
            goto L180
        L162:
            java.lang.String r1 = r5.group(r4)
            java.lang.String r2 = r5.group(r2)
            if (r1 == 0) goto L180
            android.os.Bundle r9 = r9.getExtras()
            java.lang.String r3 = "registration_id"
            r9.putString(r3, r2)
        L175:
            r0.m7885a(r1, r9)
            goto L180
        L179:
            java.lang.String r0 = "Rpc"
            java.lang.String r9 = "Dropping invalid message"
        L17d:
            android.util.Log.w(r0, r9)
        L180:
            return
    }
}
