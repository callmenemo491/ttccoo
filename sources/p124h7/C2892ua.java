package p124h7;

/* renamed from: h7.ua */
/* loaded from: classes.dex */
public final class C2892ua implements android.os.Parcelable.Creator<p124h7.C2874ta> {
    public C2892ua() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2874ta createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L35
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L30
            r6 = 2
            if (r5 == r6) goto L2b
            r6 = 3
            if (r5 == r6) goto L22
            p270p6.C5368b.m11709s(r8, r4)
            goto L7
        L22:
            android.os.Parcelable$Creator<v9.a> r3 = p375v9.C6586a.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r8, r4, r3)
            v9.a r3 = (p375v9.C6586a) r3
            goto L7
        L2b:
            java.lang.String r2 = p270p6.C5368b.m11695e(r8, r4)
            goto L7
        L30:
            java.lang.String r1 = p270p6.C5368b.m11695e(r8, r4)
            goto L7
        L35:
            p270p6.C5368b.m11699i(r8, r0)
            h7.ta r8 = new h7.ta
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2874ta[] newArray(int r1) {
            r0 = this;
            h7.ta[] r1 = new p124h7.C2874ta[r1]
            return r1
    }
}
