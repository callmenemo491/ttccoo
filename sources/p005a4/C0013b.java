package p005a4;

/* renamed from: a4.b */
/* loaded from: classes.dex */
public class C0013b implements p005a4.InterfaceC0023l {

    /* renamed from: a */
    public final android.content.Context f13a;

    /* renamed from: b */
    public final p021b4.InterfaceC0666c f14b;

    /* renamed from: c */
    public final com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c f15c;

    public C0013b(android.content.Context r1, p021b4.InterfaceC0666c r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c r3) {
            r0 = this;
            r0.<init>()
            r0.f13a = r1
            r0.f14b = r2
            r0.f15c = r3
            return
    }

    @Override // p005a4.InterfaceC0023l
    /* renamed from: a */
    public void mo21a(p385w3.AbstractC6787i r17, int r18, boolean r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r0.f13a
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r5 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r3.<init>(r4, r5)
            android.content.Context r4 = r0.f13a
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            java.util.zip.Adler32 r5 = new java.util.zip.Adler32
            r5.<init>()
            android.content.Context r6 = r0.f13a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r8)
            r5.update(r6)
            java.lang.String r6 = r17.mo13798b()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r7)
            r5.update(r6)
            r6 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r6)
            t3.d r8 = r17.mo13800d()
            int r8 = p069e4.C1515a.m4103a(r8)
            java.nio.ByteBuffer r7 = r7.putInt(r8)
            byte[] r7 = r7.array()
            r5.update(r7)
            byte[] r7 = r17.mo13799c()
            if (r7 == 0) goto L65
            byte[] r7 = r17.mo13799c()
            r5.update(r7)
        L65:
            long r7 = r5.getValue()
            int r5 = (int) r7
            java.lang.String r7 = "JobInfoScheduler"
            java.lang.String r8 = "attemptNumber"
            r9 = 0
            r10 = 1
            if (r19 != 0) goto La1
            java.util.List r11 = r4.getAllPendingJobs()
            java.util.Iterator r11 = r11.iterator()
        L7a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L98
            java.lang.Object r12 = r11.next()
            android.app.job.JobInfo r12 = (android.app.job.JobInfo) r12
            android.os.PersistableBundle r13 = r12.getExtras()
            int r13 = r13.getInt(r8)
            int r12 = r12.getId()
            if (r12 != r5) goto L7a
            if (r13 < r2) goto L98
            r11 = 1
            goto L99
        L98:
            r11 = 0
        L99:
            if (r11 == 0) goto La1
            java.lang.String r2 = "Upload for context %s is already scheduled. Returning..."
            p064e.C1494h.m4052c(r7, r2, r1)
            return
        La1:
            b4.c r11 = r0.f14b
            long r11 = r11.mo2225H(r1)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c r13 = r0.f15c
            android.app.job.JobInfo$Builder r14 = new android.app.job.JobInfo$Builder
            r14.<init>(r5, r3)
            t3.d r3 = r17.mo13800d()
            r15 = r7
            long r6 = r13.m2818b(r3, r11, r2)
            r14.setMinimumLatency(r6)
            java.util.Map r6 = r13.mo2811c()
            java.lang.Object r3 = r6.get(r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r3 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a) r3
            java.util.Set r3 = r3.mo2813c()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5245Y
            boolean r6 = r3.contains(r6)
            r7 = 2
            if (r6 == 0) goto Ld5
            r14.setRequiredNetworkType(r7)
            goto Ld8
        Ld5:
            r14.setRequiredNetworkType(r10)
        Ld8:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5247a0
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto Le3
            r14.setRequiresCharging(r10)
        Le3:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5246Z
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto Lee
            r14.setRequiresDeviceIdle(r10)
        Lee:
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            r3.putInt(r8, r2)
            java.lang.String r6 = r17.mo13798b()
            java.lang.String r8 = "backendName"
            r3.putString(r8, r6)
            t3.d r6 = r17.mo13800d()
            int r6 = p069e4.C1515a.m4103a(r6)
            java.lang.String r8 = "priority"
            r3.putInt(r8, r6)
            byte[] r6 = r17.mo13799c()
            if (r6 == 0) goto L11f
            byte[] r6 = r17.mo13799c()
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            java.lang.String r8 = "extras"
            r3.putString(r8, r6)
        L11f:
            r14.setExtras(r3)
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r9] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r10] = r5
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c r5 = r0.f15c
            t3.d r1 = r17.mo13800d()
            long r5 = r5.m2818b(r1, r11, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3[r7] = r1
            r1 = 3
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r3[r1] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r2 = 4
            r3[r2] = r1
            java.lang.String r1 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            r2 = r15
            p064e.C1494h.m4053d(r2, r1, r3)
            android.app.job.JobInfo r1 = r14.build()
            r4.schedule(r1)
            return
    }

    @Override // p005a4.InterfaceC0023l
    /* renamed from: b */
    public void mo22b(p385w3.AbstractC6787i r2, int r3) {
            r1 = this;
            r0 = 0
            r1.mo21a(r2, r3, r0)
            return
    }
}
