package p411x9;

/* renamed from: x9.z */
/* loaded from: classes.dex */
public final class C7007z implements android.os.Parcelable.Creator<p411x9.C7006y> {
    public C7007z() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C7006y createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L32
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L2d
            r6 = 2
            if (r5 == r6) goto L28
            r6 = 3
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            boolean r3 = p270p6.C5368b.m11700j(r8, r4)
            goto L8
        L28:
            java.lang.String r2 = p270p6.C5368b.m11695e(r8, r4)
            goto L8
        L2d:
            java.lang.String r1 = p270p6.C5368b.m11695e(r8, r4)
            goto L8
        L32:
            p270p6.C5368b.m11699i(r8, r0)
            x9.y r8 = new x9.y
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C7006y[] newArray(int r1) {
            r0 = this;
            x9.y[] r1 = new p411x9.C7006y[r1]
            return r1
    }
}
