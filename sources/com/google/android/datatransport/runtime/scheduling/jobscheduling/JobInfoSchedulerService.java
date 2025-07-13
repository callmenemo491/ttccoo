package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {

    /* renamed from: Y */
    public static final /* synthetic */ int f5236Y = 0;

    public JobInfoSchedulerService() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r6) {
            r5 = this;
            android.os.PersistableBundle r0 = r6.getExtras()
            java.lang.String r1 = "backendName"
            java.lang.String r0 = r0.getString(r1)
            android.os.PersistableBundle r1 = r6.getExtras()
            java.lang.String r2 = "extras"
            java.lang.String r1 = r1.getString(r2)
            android.os.PersistableBundle r2 = r6.getExtras()
            java.lang.String r3 = "priority"
            int r2 = r2.getInt(r3)
            android.os.PersistableBundle r3 = r6.getExtras()
            java.lang.String r4 = "attemptNumber"
            int r3 = r3.getInt(r4)
            android.content.Context r4 = r5.getApplicationContext()
            p385w3.C6791m.m13811b(r4)
            w3.i$a r4 = p385w3.AbstractC6787i.m13808a()
            r4.mo13802b(r0)
            t3.d r0 = p069e4.C1515a.m4104b(r2)
            r4.mo13803c(r0)
            if (r1 == 0) goto L49
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)
            r1 = r4
            w3.b$b r1 = (p385w3.C6780b.b) r1
            r1.f26322b = r0
        L49:
            w3.m r0 = p385w3.C6791m.m13810a()
            a4.i r0 = r0.f26346d
            w3.i r1 = r4.mo13801a()
            a4.c r2 = new a4.c
            r2.<init>(r5, r6)
            java.util.concurrent.Executor r6 = r0.f41e
            a4.h r4 = new a4.h
            r4.<init>(r0, r1, r3, r2)
            r6.execute(r4)
            r6 = 1
            return r6
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
