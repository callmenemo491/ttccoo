package p248o6;

/* renamed from: o6.k */
/* loaded from: classes.dex */
public interface InterfaceC4916k extends android.os.IInterface {

    /* renamed from: o6.k$a */
    public static abstract class a extends p110g7.BinderC2295a implements p248o6.InterfaceC4916k {

        /* renamed from: o6.k$a$a, reason: collision with other inner class name */
        public static class C7410a extends p053d7.C1340b implements p248o6.InterfaceC4916k {
            public C7410a(android.os.IBinder r3) {
                    r2 = this;
                    java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                    r1 = 2
                    r2.<init>(r3, r0, r1)
                    return
            }

            @Override // p248o6.InterfaceC4916k
            /* renamed from: a */
            public final android.accounts.Account mo11070a() {
                    r2 = this;
                    android.os.Parcel r0 = r2.m3839v()
                    r1 = 2
                    android.os.Parcel r0 = r2.m3835l2(r1, r0)
                    android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
                    android.os.Parcelable r1 = p110g7.C2296b.m6061a(r0, r1)
                    android.accounts.Account r1 = (android.accounts.Account) r1
                    r0.recycle()
                    return r1
            }
        }

        @androidx.annotation.RecentlyNonNull
        /* renamed from: x */
        public static p248o6.InterfaceC4916k m11071x(@androidx.annotation.RecentlyNonNull android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                boolean r1 = r0 instanceof p248o6.InterfaceC4916k
                if (r1 == 0) goto L11
                o6.k r0 = (p248o6.InterfaceC4916k) r0
                return r0
            L11:
                o6.k$a$a r0 = new o6.k$a$a
                r0.<init>(r2)
                return r0
        }
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    android.accounts.Account mo11070a();
}
