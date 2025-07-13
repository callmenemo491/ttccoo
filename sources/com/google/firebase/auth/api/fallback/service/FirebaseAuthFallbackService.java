package com.google.firebase.auth.api.fallback.service;

/* loaded from: classes.dex */
public class FirebaseAuthFallbackService extends android.app.Service {
    public FirebaseAuthFallbackService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "com.google.firebase.auth.api.gms.service.START"
            java.lang.String r2 = r2.getAction()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L14
            w9.a r2 = new w9.a     // Catch: java.lang.Throwable -> L17
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return r2
        L14:
            r2 = 0
            monitor-exit(r1)
            return r2
        L17:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
